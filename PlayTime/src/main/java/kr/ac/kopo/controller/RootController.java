package kr.ac.kopo.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import kr.ac.kopo.model.Member;
import kr.ac.kopo.service.MemberService;

@Controller
public class RootController {
	@Autowired
	MemberService memberservice;
	@RequestMapping("/")
	public String index() {
		return "index";
	}
	@GetMapping("/login")
	public String login() {
		return "login";
	}
	
	@PostMapping("/login")
	public String login(HttpSession session,Member member) {
		if(memberservice.login(member))
			{session.setAttribute("member", member);
		return "redirect:.";}
		return "redirect:/login";
	}
	
}
