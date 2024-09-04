package com.CoinDex.Modulos.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;


@Entity
@Data
public class Bank {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column
    private Long BankID;
    
    @Column(nullable = false, length = 30)
    private String BankName;
    
    @Column(nullable = false)
    private int BankCode;
}
