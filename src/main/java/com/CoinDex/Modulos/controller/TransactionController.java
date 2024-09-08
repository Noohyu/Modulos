package com.CoinDex.Modulos.controller;

import com.CoinDex.Modulos.model.Transaction;
import com.CoinDex.Modulos.services.TransactionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/transaction")
public class TransactionController {
    
    @Autowired
    private TransactionService transactionService;
    
    @PostMapping("/new_transaction")
    public Transaction newTransaction(@RequestBody Transaction transaction){
        return this.transactionService.newTransaction(transaction);
    }
    
    @GetMapping("/show_transaction")
    public Iterable<Transaction> getAll(){
        return transactionService.getAll();
    }
    
    @PostMapping("/modify_transaction")
    public Transaction modifyTransaction (@RequestBody Transaction transaction){
        return this.transactionService.modifyTransaction(transaction);
    }
    
    @PostMapping(value="/{id}")
    public Boolean deleteTransaction(@PathVariable(value="id") Long id){
        return this.transactionService.deleteTransaction(id);
    }
}
