package com.CoinDex.Modulos.services;

import com.CoinDex.Modulos.model.Account;

public interface AccountService {
    Account newAccount (Account newAccount);
    Iterable<Account> getAll();
    Account modifyAccount(Account account);
    Boolean deleteAccount (Long AccountID);
    
}
