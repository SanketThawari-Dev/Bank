package com.bank.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.bank.entity.TxnHistory;
import com.bank.repository.TransactionRepository;

@Service
public class TransactionService {

    private final TransactionRepository transactionRepository;

    public TransactionService(TransactionRepository transactionRepository) {
        this.transactionRepository = transactionRepository;
    }

    public void insertTxn(String uid, String status, String amount) {
        transactionRepository.insertTxn(uid, status, amount);
    }

    public List<TxnHistory> readTxn(String uid) {
        return transactionRepository.readTxn(uid);
    }
}

