package com.itwillbs.mvc_board.controller;

import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class FintechController {

	private static final Logger log = LoggerFactory.getLogger(FintechController.class);
	
	@GetMapping("FintechMain")
	public String FintechMain() {
		return"fintech/main";
	}
	
	@GetMapping("callback")
	public String callback(@RequestParam Map<String, String> authResponse , Model model) {
//		System.out.println(authResponse);
		log.info("authResponse : " + authResponse.toString());
		
		model.addAttribute("authResponse",authResponse);
//		return "fintech/callback";
		return "";
	}
}
