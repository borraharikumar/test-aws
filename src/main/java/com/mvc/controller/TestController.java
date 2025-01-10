package com.mvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class TestController {

	@GetMapping
	public String testMessge() {
		System.err.println("TestController.testMessge()");
		return "index";
	}

}
