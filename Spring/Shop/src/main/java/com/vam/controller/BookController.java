package com.vam.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class BookController {

	private static final Logger logger = LoggerFactory.getLogger(BookController.class);
	
	@GetMapping("/main")
	public void mainPageGET() {
		logger.info("메인 페이지 진입");
	}
}
