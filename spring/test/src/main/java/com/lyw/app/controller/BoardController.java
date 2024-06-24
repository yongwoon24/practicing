package com.lyw.app.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.lyw.app.vo.MemberVO;

@Controller
public class BoardController {
	
	@RequestMapping(value = "/abcd", method = RequestMethod.GET)
	public String abcd() {
		
		return "abcd";
	}
	
	@RequestMapping(value = "/board/insert", method = RequestMethod.GET)
	public String insert() {
		
		return "board/insert";
	}
	
	@RequestMapping(value = "/board/insertVal", method = RequestMethod.GET)
	public String insertVal(String name, int age, Model model) {
		model.addAttribute("irum", name);
		model.addAttribute("age", age);
		return "board/insertVal";
	}
	
	@RequestMapping(value = "/board/insertMem", method = RequestMethod.GET)
	public String insertMem(MemberVO vo, Model model) {
		model.addAttribute("vo", vo);
		return "board/insertMem";
	}
}
