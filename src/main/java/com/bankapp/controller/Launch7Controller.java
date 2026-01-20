package com.bankapp.controller;

import java.sql.Connection;
import java.util.List;

import javax.sql.DataSource;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import com.bankapp.dao.Transac_his_dao;
import com.bankapp.entity.TxnHistory;

@Controller
public class Launch7Controller {

    @Autowired
    private DataSource dataSource;

    Transac_his_dao txnDao = new Transac_his_dao();

    @GetMapping("/readtxn")
    public String readTxn(HttpServletRequest req) {

        HttpSession session = req.getSession();
        String id = req.getParameter("uid");

        try (Connection con = dataSource.getConnection()) {

            List<TxnHistory> al = txnDao.readTxn(con, id);

            session.setAttribute("check", id);
            session.setAttribute("al", al);

            // ✅ redirect to controller
            return "redirect:/transactions";

        } catch (Exception e) {
            e.printStackTrace();
            session.setAttribute("msg", "Internal server error");
            return "redirect:/account";
        }
    }
}
