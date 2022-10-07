package org.hdcd.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

	@GetMapping("/formHome")
	public String formHome() {
		return "formHome";
	}

	@GetMapping("/ajaxHome")
	public String ajaxHome() {
		return "ajaxHome";
	}
}
