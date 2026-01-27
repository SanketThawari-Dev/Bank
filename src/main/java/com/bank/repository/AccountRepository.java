package com.bank.repository;

import java.sql.ResultSet;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.bank.entity.Account;

@Repository
public class AccountRepository {

    private final JdbcTemplate jdbcTemplate;

    public AccountRepository(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    public String deposit(String uid, String am) {
        try {
            String bal = jdbcTemplate.queryForObject(
                    "select bal from account where userid=?",
                    String.class,
                    uid
            );

            int updatedBal = Integer.parseInt(bal) + Integer.parseInt(am);

            int i = jdbcTemplate.update(
                    "update account set bal=? where userid=?",
                    String.valueOf(updatedBal),
                    uid
            );

            return i == 1 ? "updated" : "failed";

        } catch (Exception e) {
            return "failed";
        }
    }

    public Account readAccount(String uid) {
        return jdbcTemplate.queryForObject(
                "select * from account where userid=?",
                (ResultSet rs, int rowNum) -> {
                    Account ac = new Account();
                    ac.setUserid(rs.getString(1));
                    ac.setPass(rs.getString(2));
                    ac.setContact(rs.getString(3));
                    ac.setEmail(rs.getString(4));
                    ac.setCity(rs.getString(5));
                    ac.setAcholname(rs.getString(6));
                    ac.setActype(rs.getString(7));
                    ac.setAtm(rs.getString(8));
                    ac.setAcno(rs.getString(9));
                    ac.setBal(rs.getString(10));
                    return ac;
                },
                uid
        );
    }
}

