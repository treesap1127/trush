package kr.ac.kopo.bookshop.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import kr.ac.kopo.bookshop.model.Book;
import kr.ac.kopo.bookshop.service.BookService;

@Controller
@RequestMapping("/book")
public class BookController {
	final String path = "book/";

	@Autowired
	BookService service;

	@RequestMapping("/list")
	public String list(Model model) {
		List<Book> list = service.list();

		model.addAttribute("list", list);

		return path + "list";

	}

	@RequestMapping("/delete/{bookid}")
	public String delete(int bookid) {
		service.delete(bookid);
		return "redirect:list";
	}

	@RequestMapping(value = "/add", method = RequestMethod.GET)
	public String add() {
		return path + "add";
	}

	@RequestMapping(value = "/add", method = RequestMethod.POST)
	public String add(Book item) {
		service.add(item);
		return "redirect:list";
	}

	@RequestMapping(value = "/update/{bookid}", method = RequestMethod.GET)
	public String update(int bookid, Model model) {
		Book item = service.getItem(bookid);
		model.addAttribute("item", item);
		return path + "update";
	}

	@RequestMapping(value = "/update/{bookid}", method = RequestMethod.POST)
	public String update(Book item) {
		service.update(item);
		return "redirect:list";
	}

}
