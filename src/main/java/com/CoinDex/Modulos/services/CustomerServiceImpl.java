package com.CoinDex.Modulos.services;

/*
Importación de la clase "Customer", el repositorio "CustomerRepository", 
la clase "Optional" para manejar valores que pueden ser nulos, 
y las anotaciones "@Autowired" y "@Service".

*/
import com.CoinDex.Modulos.model.Customer;
import com.CoinDex.Modulos.repository.CustomerRepository;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/*
Indica que la clase es un servicio gestionado por el contenedor de Spring. 
Además, implementa la interfaz CustomerService, proporcionando implementaciones 
para todos los métodos definidos en dicha interfaz.
*/
@Service
public class CustomerServiceImpl implements CustomerService{

    /*
    Inyecta automáticamente una instancia de CustomerRepository en customerRepository, 
    permitiendo interactuar con la base de datos.
    */
    @Autowired
    private CustomerRepository customerRepository;
    
    //Crea un nuevo cliente en el sistema y la guarda usando el método "save" del repositorio.
    @Override
    public Customer newCustomer(Customer newCustomer) {
        return customerRepository.save(newCustomer);
    }

    //Obtiene todos los clientes llamando al método "findAll" del repositorio.
    @Override
    public Iterable<Customer> getAll() {
        return this.customerRepository.findAll();
    }

    /*
    Modifica los detalles de un cliente existente. Si el cliente no se encuentra, 
    devuelve null.
    */
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

    //Elimina al cliente del sistema por su ID, utilizando el método "deleteById".
    @Override
    public Boolean deleteCustormer(Long CustomerID) {
        this.customerRepository.deleteById(CustomerID);
        return true;
    }
    
}
