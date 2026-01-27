package com.bank.controller;

import jakarta.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.bank.service.TransactionService;

@Controller
public class TransactionController {

    private final TransactionService transactionService;

    public TransactionController(TransactionService transactionService) {
        this.transactionService = transactionService;
    }

    // Launch7.java
    @GetMapping("/readtxn")
    public String readTxn(@RequestParam("uid") String uid,
                          HttpSession session) {

        session.setAttribute("check", uid);
        session.setAttribute("al", transactionService.readTxn(uid));

        return "redirect:/readtxn.jsp";
    }
}
