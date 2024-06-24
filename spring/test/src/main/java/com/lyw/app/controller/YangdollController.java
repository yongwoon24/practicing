package com.lyw.app.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class YangdollController {

	@RequestMapping(value = "/yangdoll", method = RequestMethod.GET)
	public String Yangdoll(){
		
		return "yangdoll";
	}
}
