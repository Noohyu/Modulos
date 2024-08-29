package com.CoinDex.Modulos.repository;

import com.CoinDex.Modulos.model.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepository extends JpaRepository<Customer, Long>{
    
}
