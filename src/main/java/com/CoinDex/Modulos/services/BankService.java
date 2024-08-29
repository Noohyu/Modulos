package com.CoinDex.Modulos.services;

import com.CoinDex.Modulos.model.Bank;

public interface BankService {
    Bank newBank (Bank newBank);
    Iterable<Bank> getAll();
    Bank modifyBank(Bank bank);
    Boolean deleteBank (Long BankID);
}
