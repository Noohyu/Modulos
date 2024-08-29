package com.CoinDex.Modulos.repository;

import com.CoinDex.Modulos.model.Account;
import org.springframework.data.jpa.repository.JpaRepository;


public interface AccountRepository extends JpaRepository<Account, Long>{
    
}
