package com.itwillbs.mvc_board;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HomeController {
	@GetMapping("/")
	public String home(@RequestParam(defaultValue = "ko-kr") String lang) {
		System.out.println("선택된 언어 : " + lang);
		
		if(lang.equals("ko-kr")) {
			return "main_ko-kr";
		}else if(lang.equals("en-us")) {
			return "main_en-us";
		}
		return "main_ko-kr";
	}
}











