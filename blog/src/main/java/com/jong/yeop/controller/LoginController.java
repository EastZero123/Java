package com.jong.yeop.controller;

import com.jong.yeop.model.LoginVO;
import com.jong.yeop.service.LoginService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import java.util.HashMap;
import java.util.Map;

@Controller
@RequestMapping("/admin")
public class LoginController {

    private LoginService loginService;

    private LoginController(LoginService loginService) {
        this.loginService = loginService;
    }

    @GetMapping(value = "/login")
    public String login() {
        return "/Login/login.html";
    }

    @PostMapping(value = "/login")
    public String login(String id, String password) {
        String returnUrl = "redirect:/Login/login.html";
        LoginVO loginVO = loginService.login(id, password);
        System.out.println("loginVO:" + loginVO);
        try {
            if (loginVO != null) {
                returnUrl = "redirect:/Home/main.html";
            } else {
                returnUrl = "redirect:/Login/login.html";
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        return returnUrl;
    }

    @GetMapping(value = "/signUp")
    public String signUp() {
        return "/Login/signUp.html";
    }

    @PostMapping(value = "/signUp")
    public ResponseEntity<Map<String, Object>> signUpProc(@RequestBody LoginVO loginVO) {
        Map<String, Object> response = new HashMap<>();
        try {
            loginService.SignUp(loginVO);
            response.put("success", true);
            response.put("message", "User added successfully!");
            return ResponseEntity.ok(response);
        } catch (Exception e) {
            e.printStackTrace();
            response.put("success", false);
            response.put("errorMessage", e.getMessage());
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(response);
        }
    }
}
