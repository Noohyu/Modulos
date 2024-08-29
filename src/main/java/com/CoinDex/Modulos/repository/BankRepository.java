package com.CoinDex.Modulos.repository;

import com.CoinDex.Modulos.model.Bank;
import org.springframework.data.jpa.repository.JpaRepository;


public interface BankRepository extends JpaRepository<Bank, Long> {
    
}
