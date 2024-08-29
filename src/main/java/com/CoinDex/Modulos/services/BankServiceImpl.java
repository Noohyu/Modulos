package com.CoinDex.Modulos.services;

import com.CoinDex.Modulos.model.Bank;
import com.CoinDex.Modulos.repository.BankRepository;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BankServiceImpl implements BankService{

    @Autowired
    private BankRepository bankRepository;
    
    @Override
    public Bank newBank(Bank newBank) {
        return bankRepository.save(newBank);
    }

    @Override
    public Iterable<Bank> getAll() {
        return this.bankRepository.findAll();
    }

    @Override
    public Bank modifyBank(Bank bank) {
        Optional<Bank> bankFound = this.bankRepository.findById(bank.getBankID());
        if(bankFound.get()!=null){
            bankFound.get().setBankName(bank.getBankName());
            bankFound.get().setBankCode(bank.getBankCode());
            
            return this.newBank(bankFound.get());
        }
        return null;
    }

    @Override
    public Boolean deleteBank(Long BankID) {
        this.bankRepository.deleteById(BankID);
        return true;
    }
    
}
