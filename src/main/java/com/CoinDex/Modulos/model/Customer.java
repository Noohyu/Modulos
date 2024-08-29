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
public class Customer {
    
    @Id
    @Column
    private Long CustomerID;
    
    @Column(nullable = false)
    private String FirstName;
    
    @Column(nullable = false)
    private String LastName;
    
    @Column(nullable = false)
    private LocalDate DateOfBirth;
    
    @Column(nullable = false)
    private String Email;
    
    @Column(nullable = false)
    private Long PhoneNumber;
    
    @Column(nullable = false)
    private String Address;
}
