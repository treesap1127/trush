package kr.ac.kopo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import kr.ac.kopo.model.Partner;
import kr.ac.kopo.model.Product;
import kr.ac.kopo.model.Purchase;
import kr.ac.kopo.service.PartnerService;
import kr.ac.kopo.service.Productservice;
import kr.ac.kopo.service.PurchaseService;
import kr.ac.kopo.util.Pager;

@Controller
@RequestMapping("/purchase")
public class PurchaseContoller {
	private String path="purchase/";
	@Autowired
	PurchaseService service;
	@Autowired
	Productservice Productservice;
	@Autowired
	PartnerService Partnerservice;
	@RequestMapping({"/list","/"})
	public String list(Pager pager,Model model) {
		List<Purchase> list=service.list(pager);
		model.addAttribute("list", list);
		return path+"list";
	}
	@GetMapping("/add")
	public String add(Model model) {
		List<Product> listproduct =Productservice.list();
		model.addAttribute("listproduct", listproduct);
		List<Partner> listpartner =Partnerservice.list();
		model.addAttribute("listpartner", listpartner);
		
		return path+"add";
	}
	@PostMapping("/add")
	public String add(Purchase item) {
		service.add(item);
		return "redirect:../list";
	}
	@GetMapping("/update/{code}")
	public String update(@PathVariable int code,Model model) {
		Purchase item = service.item(code);
		model.addAttribute("item", item);
		return path+"update";
	}
	@PostMapping("/update/{code}")
	public String update(@PathVariable int code,Purchase item) {
		service.update(item);
		
		return "redirect:../list";
	}
	@GetMapping("/delete/{code}")
	public String delete(@PathVariable int code) {
		service.delete(code);
		return "redirect:..";
	}
	
}
