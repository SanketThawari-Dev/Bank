package com.bankapp.controller;

import jakarta.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class Launch3Controller {

    @GetMapping("/logout")
    public String logout(HttpServletRequest req) {

        req.getSession().invalidate(); // better than removing one attribute
        return "redirect:/login";
    }
}
