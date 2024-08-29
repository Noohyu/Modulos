package com.CoinDex.Modulos.controller;

import com.CoinDex.Modulos.model.Bank;
import com.CoinDex.Modulos.services.BankService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/bank")
public class BankController {
    
    @Autowired
    private BankService bankService;
    
    @PostMapping("/new_bank")
    public Bank newBank(@RequestBody Bank bank){
        return this.bankService.newBank(bank);
    }
    
    @GetMapping("/show_bank")
    public Iterable<Bank> getAll(){
        return bankService.getAll();
    }
    
    @PostMapping("/modify_bank")
    public Bank modifyBank (@RequestBody Bank bank){
        return this.bankService.modifyBank(bank);
    }
    
    @PostMapping(value="/id")
    public Boolean deleteBank(@PathVariable(value="id") Long id){
        return this.bankService.deleteBank(id);
    }
}
