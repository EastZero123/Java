package org.zerock.b01.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import lombok.extern.log4j.Log4j2;

@Controller
@Log4j2
public class SampleController {

	@GetMapping("/hello")
	public void hello(Model model) {

		log.info("hello..........");

		model.addAttribute("msg", "HELLO WORLD");
	}

	@GetMapping("/ex/ex1")
	public void ex1(Model model) {
		List<String> list = Arrays.asList("AAA", "BBB", "CCC", "DDD");

		model.addAttribute("list", list);
	}

}
