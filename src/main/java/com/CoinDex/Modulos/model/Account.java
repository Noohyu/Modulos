package com.CoinDex.Modulos.model;

//Importación de clases de jakarta.persistence y lombok.

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

/*
Anotación Entity indica que la clase es una entidad JPA y se debe mapear en una base de datos.
Anotación Data genera automáticamente los métodos getters y setters.
*/
@Entity
@Data
public class Account {
    
    /*
    Indica que este campo es la clave primaria de la entidad y 
    que su valor se genera automáticamente por la base de datos.
    */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column
    private Long AccountID;
    
    //Indica que ningún valor de la columna debe ser nulo y debe ser único.
    @Column(nullable = false, unique = true)
    private Long AccountNumber;
    
    //Indica que los valores de esta columna son de un tipo Enum y se almacenan como cadenas de texto.   
    @Column(nullable = false)
    @Enumerated(EnumType.STRING)
    private accountType AccountType;
    
    //Indica que los valores de esta columna son de un tipo Enum y se almacenan como cadenas de texto.  
    @Column(nullable = false)
    @Enumerated(EnumType.STRING)
    private accountStatus AccountStatus;
    
    @Column
    private Long CurrentBalance;
    
    //Definición de los valores permitidos para las columnas de tipo de cuenta y estado de cuenta.
    public enum accountType {
        SAVING,
        CHECKING,
        NA
    }
    public enum accountStatus {
        ACTIVE,
        INACTIVE,
        DELETE
    }
    
}
