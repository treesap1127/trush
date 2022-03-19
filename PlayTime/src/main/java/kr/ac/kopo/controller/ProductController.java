package kr.ac.kopo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import kr.ac.kopo.model.Product;
import kr.ac.kopo.service.Productservice;
import kr.ac.kopo.util.Pager;


@Controller
@RequestMapping("/product")

public class ProductController {
	private String path = "product/";
	@Autowired 
	Productservice service;
	@RequestMapping({"/","list"})
	public String list(Model model,Pager pager) {// 객체로 만들어서 넘기는구만
		List<Product> list =service.list(pager);
		model.addAttribute("list", list);
		return path+"list";
	}
	@RequestMapping("/dummy")
	public String dummy() {
		service.dummy();
		return "redirect:list";
	}
	
	@RequestMapping("/init")
	public String init() {
		service.init();
		return "redirect:list";
	}
	
	@GetMapping("/add")
	public String add() {
		return path+"add";
	}
	@PostMapping("/add")
	public String add(Product item) {
		service.add(item);
		return "redirect:list";
	}
	@GetMapping("/update/{code}")
	public String update(@PathVariable int code,Model model) {
		Product item =service.item(code);
		model.addAttribute("item", item);
		return path+"update";
	}
	@PostMapping("/update/{code}")
	public String update (@PathVariable int code, Product item) {
		item.setCode(code);
		service.update(item);
		return "redirect:..";
	}
	@GetMapping("/delete/{code}")
	public String delete(@PathVariable int code) {
		service.delete(code);
		return "redirect:..";
	}
	
	
	
}
