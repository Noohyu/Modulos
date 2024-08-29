package com.CoinDex.Modulos.services;

import com.CoinDex.Modulos.model.Transaction;


public interface TransactionService {
    Transaction newTransaction (Transaction newTransaction);
    Iterable<Transaction> getAll();
    Transaction modifyTransaction(Transaction transaction);
    Boolean deleteTransaction (Long TransactionID);
}
