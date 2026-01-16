package com.bankapp.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class Launch8Controller {

    @GetMapping("/loginu")
    public String loginu(HttpServletRequest req) {

        req.getSession().removeAttribute("msg");
        return "redirect:/login.jsp";
    }
}
