package com.CoinDex.Modulos.repository;

import com.CoinDex.Modulos.model.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

/*
El repositorio se define como una interfaz que extiende JpaRepository, lo que permite 
heredar una serie de métodos predefinidos para realizar operaciones CRUD y otras 
consultas sobre la base de datos.
*/
public interface CustomerRepository extends JpaRepository<Customer, Long>{
    
}
