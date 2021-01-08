package com.boot.leaf.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.boot.leaf.biz.BookBiz;

@Controller
public class BookController {
	
	@Autowired
	BookBiz biz;
	
	@GetMapping("/selectMovie")
	public String selectMovie(Model model, int movieno) {
		model.addAttribute("movie", biz.selectMovie(movieno));
		
		return "selectDate";
	}


}
