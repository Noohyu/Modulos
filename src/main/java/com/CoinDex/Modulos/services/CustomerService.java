package com.CoinDex.Modulos.services;

import com.CoinDex.Modulos.model.Customer;

/*
Se define un contrato que cualquier clase que implemente esta interfaz debe cumplir, 
proporcionando implementaciones para todos los métodos definidos en la interfaz.
*/
public interface CustomerService{
    //Métodos
    
    //Crea un cliente en el sistema.
    Customer newCustomer (Customer newCustomer);
    
    //Recupera en forma de lista todos los clientes almacenados en el sistema.
    Iterable<Customer> getAll();
    
    //Modifica los detalles de un cliente existente.
    Customer modifyCustomer(Customer customer);
    
    //Elimina un cliente del sistema basada en su ID, devolviendo un valor Boolean.
    Boolean deleteCustormer (Long CustomerID);
}
