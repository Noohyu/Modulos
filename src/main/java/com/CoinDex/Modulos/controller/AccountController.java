package com.CoinDex.Modulos.controller;

import com.CoinDex.Modulos.model.Account;
import com.CoinDex.Modulos.services.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/account")
public class AccountController {
    
    @Autowired
    private AccountService accountService;
    
    @PostMapping("/new_account")
    public Account newAccount(@RequestBody Account account){
        return this.accountService.newAccount(account);
    }
    
    @GetMapping("/show_account")
    public Iterable<Account> getAll(){
        return accountService.getAll();
    }
    
    @PostMapping("/modify_account")
    public Account modifyAccount (@RequestBody Account account){
        return this.accountService.modifyAccount(account);
    }
    
    @PostMapping(value="/{id}")
    public Boolean deleteAccount(@PathVariable(value="id") Long id){
        return this.accountService.deleteAccount(id);
    }
}
