
package com.CoinDex.Modulos.services;

import com.CoinDex.Modulos.model.Customer;
import com.CoinDex.Modulos.repository.CustomerRepository;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CustomerServiceImpl implements CustomerService{

    @Autowired
    private CustomerRepository customerRepository;
            
    @Override
    public Customer newCustomer(Customer newCustomer) {
        return customerRepository.save(newCustomer);
    }

    @Override
    public Iterable<Customer> getAll() {
        return this.customerRepository.findAll();
    }

    @Override
    public Customer modifyCustomer(Customer customer) {
        Optional<Customer> customerFound = this.customerRepository.findById(customer.getCustomerID());
        if(customerFound.get()!=null){
            customerFound.get().setFirstName(customer.getFirstName());
            customerFound.get().setLastName(customer.getLastName());
            customerFound.get().setDateOfBirth(customer.getDateOfBirth());
            customerFound.get().setEmail(customer.getEmail());
            customerFound.get().setPhoneNumber(customer.getPhoneNumber());
            customerFound.get().setAddress(customer.getAddress());
            
            return this.newCustomer(customerFound.get());
        }
        return null;
    }

    @Override
    public Boolean deleteCustormer(Long CustomerID) {
        this.customerRepository.deleteById(CustomerID);
        return true;
    }
    
}
