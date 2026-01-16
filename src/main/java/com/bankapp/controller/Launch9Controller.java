package com.bankapp.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class Launch9Controller {

    @GetMapping("/signupu")
    public String signupu(HttpServletRequest req) {

        req.getSession().removeAttribute("msg");
        return "redirect:/signup.jsp";
    }
}
