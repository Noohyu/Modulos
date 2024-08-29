package com.CoinDex.Modulos.repository;

import com.CoinDex.Modulos.model.Transaction;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TransactionRepository extends JpaRepository<Transaction, Long>{
    
}
