package com.example.banking.controller;

import com.example.banking.service.BankingService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class BankingController {

    private final BankingService service;

    public BankingController(BankingService service) {
        this.service = service;
    }

    @GetMapping("/")
    public String home(Model model) {
        model.addAttribute("accounts", service.getAccounts());
        return "home";
    }
}
