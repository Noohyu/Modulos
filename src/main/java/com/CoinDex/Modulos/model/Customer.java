package com.CoinDex.Modulos.model;

//Importación de paquetes 

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;
import java.time.LocalDate;

/*
Anotación Entity indica que la clase es una entidad JPA y se debe mapear en una base de datos.
Anotación Data genera automáticamente los métodos getters y setters.
*/
@Entity
@Data
public class Customer {
    
    //Indica que este campo es la clave primaria de la entidad.
    @Id
    @Column
    private Long CustomerID;
    
    @Column(nullable = false, length = 25)
    private String FirstName;
    
    @Column(nullable = false, length = 25)
    private String LastName;
    
    @Column(nullable = false)
    private LocalDate DateOfBirth;
    
    @Column(nullable = false, length = 30)
    private String Email;
    
    @Column(nullable = false)
    private int PhoneNumber;
    
    @Column(nullable = false, length = 20)
    private String Address;
}
