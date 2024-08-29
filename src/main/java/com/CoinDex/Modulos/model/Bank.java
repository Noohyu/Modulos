package com.CoinDex.Modulos.model;

//Importación de paquetes 

//Import para definir el mapeo de un campo en una clase de la base de datos
import jakarta.persistence.Column;

//Import para marcar una clase como entidad que será mapeada en la base de datos
import jakarta.persistence.Entity;

//Import para indicar el campo que determina la clave primaria de la entidad
import jakarta.persistence.Id;

//Import para genera automaticamente los métodos de encapsulamiento (entre otros)
import lombok.Data;


@Entity
@Data
public class Bank {
    
    @Id
    @Column
    private Long BankID;
    
    @Column(nullable = false)
    private String BankName;
    
    @Column(nullable = false)
    private Long BankCode;
}
