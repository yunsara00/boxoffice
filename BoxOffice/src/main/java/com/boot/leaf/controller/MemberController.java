package com.boot.leaf.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.boot.leaf.biz.MemberBIz;
import com.boot.leaf.dto.MemberDto;

@Controller
public class MemberController {
	
	@Autowired
	MemberBIz biz;
	
	@PostMapping("/login")
	public @ResponseBody String login(HttpSession session, Model model, MemberDto dto) {
		MemberDto login = biz.login(dto);
		
		if(login != null) {
			session.setAttribute("login", login);
			
			return "<script>location.href='../main';</script>";
		} else {
			return "<script>alert('login fail'); location.href='../';</script>";
		}
	}
	
	@GetMapping("/main")
	public String utility() {
		
		return "main";
	}
}
