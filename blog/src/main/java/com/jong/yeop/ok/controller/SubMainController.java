package com.jong.yeop.ok.controller;

import ch.qos.logback.core.model.Model;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/ok")
public class SubMainController {

    @GetMapping("/")
    public String index(Model model) {
        return "/OK/Home/main.html";
    }
}
