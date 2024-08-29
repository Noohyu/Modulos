package com.CoinDex.Modulos.controller;

import com.CoinDex.Modulos.model.Customer;
import com.CoinDex.Modulos.services.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/customer")
public class CustomerController {
    
    @Autowired
    private CustomerService customerService;
    
    @PostMapping("/new_customer")
    public Customer newCustomer(@RequestBody Customer customer){
        return this.customerService.newCustomer(customer);
    }
    
    @GetMapping("/show_customer")
    public Iterable<Customer> getAll(){
        return customerService.getAll();
    }
    
    @PostMapping("/modify_customer")
    public Customer modifyCustomer (@RequestBody Customer customer){
        return this.customerService.modifyCustomer(customer);
    }
    
    @PostMapping(value="/id")
    public Boolean deleteCustomer(@PathVariable(value="id") Long id){
        return this.customerService.deleteCustormer(id);
    }
}
