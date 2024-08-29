package com.CoinDex.Modulos.services;

import com.CoinDex.Modulos.model.Transaction;
import com.CoinDex.Modulos.repository.TransactionRepository;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TransactionServiceImpl implements TransactionService{

    @Autowired
    private TransactionRepository transactionRepository;
    
    @Override
    public Transaction newTransaction(Transaction transaction) {
        return transactionRepository.save(transaction);
    }

    @Override
    public Iterable<Transaction> getAll() {
        return this.transactionRepository.findAll();
    }

    @Override
    public Transaction modifyTransaction(Transaction transaction) {
        Optional<Transaction> transactionFound = this.transactionRepository.findById(transaction.getTransactionID());
        if(transactionFound.get()!=null){
            transactionFound.get().setAmount(transaction.getAmount());
            transactionFound.get().setTransactionDate(transaction.getTransactionDate());
            transactionFound.get().setTransactionType(transaction.getTransactionType());
            
            return this.newTransaction(transactionFound.get());
        }
        return null;
    }

    
    public Boolean deleteCustormer(Long TransactionID) {
        this.transactionRepository.deleteById(TransactionID);
        return true;
    }

    @Override
    public Boolean deleteTransaction(Long TransactionID) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}
