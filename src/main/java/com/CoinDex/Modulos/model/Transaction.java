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

//Import para el manejo de fechas (año, mes, día)
import java.time.LocalDate;


@Entity
@Data
public class Transaction {
    
    @Id
    @Column
    private Long TransactionID;
    
    @Column(nullable = false)
    private String TransactionType;
    
    @Column
    private Long Amount;
    
    @Column 
    private LocalDate TransactionDate;
}
