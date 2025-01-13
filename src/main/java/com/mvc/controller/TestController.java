package com.mvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class TestController {

	@GetMapping("wish/bhogi")
	public String testMessge() {
		return "index";
	}

	@GetMapping("profile/2v")
	public String e2Profile() {
		return "profile";
	}

}
