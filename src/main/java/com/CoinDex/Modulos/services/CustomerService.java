package com.CoinDex.Modulos.services;

import com.CoinDex.Modulos.model.Customer;


public interface CustomerService{
    Customer newCustomer (Customer newCustomer);
    Iterable<Customer> getAll();
    Customer modifyCustomer(Customer customer);
    Boolean deleteCustormer (Long CustomerID);
}
