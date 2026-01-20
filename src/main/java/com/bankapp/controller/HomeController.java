package com.bankapp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

    // Landing page
    @GetMapping("/")
    public String landingPage() {
        return "landing";   // /WEB-INF/jsp/landing.jsp
    }

    // Login page
    @GetMapping("/login")
    public String loginPage() {
        return "login";     // /WEB-INF/jsp/login.jsp
    }
}
