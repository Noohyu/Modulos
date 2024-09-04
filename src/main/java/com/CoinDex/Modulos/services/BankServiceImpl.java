package com.CoinDex.Modulos.services;

/*
Importación de la clase "Bank", el repositorio "BankRepository", 
la clase "Optional" para manejar valores que pueden ser nulos, 
y las anotaciones "@Autowired" y "@Service".

*/
import com.CoinDex.Modulos.model.Bank;
import com.CoinDex.Modulos.repository.BankRepository;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/*
Indica que la clase es un servicio gestionado por el contenedor de Spring. 
Además, implementa la interfaz BankService, proporcionando implementaciones 
para todos los métodos definidos en dicha interfaz.
*/
@Service
public class BankServiceImpl implements BankService{

    /*
    Inyecta automáticamente una instancia de BankRepository en bankRepository, 
    permitiendo interactuar con la base de datos.
    */
    @Autowired
    private BankRepository bankRepository;
    
    //Crea un nuevo banco en el sistema y la guarda usando el método "save" del repositorio.
    @Override
    public Bank newBank(Bank newBank) {
        return bankRepository.save(newBank);
    }

    //Obtiene todos los bancos llamando al método "findAll" del repositorio.
    @Override
    public Iterable<Bank> getAll() {
        return this.bankRepository.findAll();
    }

    /*
    Modifica los detalles de un banco existente. Si el banco no se encuentra, 
    devuelve null.
    */
    @Override
    public Bank modifyBank(Bank bank) {
        Optional<Bank> bankFound = this.bankRepository.findById(bank.getBankID());
        if(bankFound.get()!=null){
            bankFound.get().setBankName(bank.getBankName());
            bankFound.get().setBankCode(bank.getBankCode());
            
            return this.newBank(bankFound.get());
        }
        return null;
    }

    //Elimina el banco del sistema por su ID, utilizando el método "deleteById".
    @Override
    public Boolean deleteBank(Long BankID) {
        this.bankRepository.deleteById(BankID);
        return true;
    }
    
}
