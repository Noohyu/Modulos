package com.CoinDex.Modulos.services;

import com.CoinDex.Modulos.model.Account;
import com.CoinDex.Modulos.repository.AccountRepository;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AccountServiceImpl implements AccountService{

    @Autowired
    private AccountRepository accountRepository;
            
    @Override
    public Account newAccount(Account newAccount) {
        return accountRepository.save(newAccount);
    }

    @Override
    public Iterable<Account> getAll() {
        return this.accountRepository.findAll();
    }

    @Override
    public Account modifyAccount(Account account) {
        Optional<Account> accountFound = this.accountRepository.findById(account.getAccountID());
        if (accountFound.get()!=null){
            accountFound.get().setAccountNumber(account.getAccountNumber());
            accountFound.get().setAccountStatus(account.getAccountStatus());
            accountFound.get().setAccountType(account.getAccountType());
            accountFound.get().setCurrentBalance(account.getCurrentBalance());
            
            return this.newAccount(accountFound.get());
        }
        return null;
    }

    @Override
    public Boolean deleteAccount(Long AccountID) {
        this.accountRepository.deleteById(AccountID);
        return true;
    }   
    
}
