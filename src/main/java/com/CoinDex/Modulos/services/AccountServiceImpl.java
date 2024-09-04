package com.CoinDex.Modulos.services;

/*
Importación de la clase "Account", el repositorio "AccountRepository", 
la clase "Optional" para manejar valores que pueden ser nulos, 
y las anotaciones "@Autowired" y "@Service".

*/
import com.CoinDex.Modulos.model.Account;
import com.CoinDex.Modulos.repository.AccountRepository;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/*
Indica que la clase es un servicio gestionado por el contenedor de Spring. 
Además, implementa la interfaz AccountService, proporcionando implementaciones 
para todos los métodos definidos en dicha interfaz.
*/
@Service
public class AccountServiceImpl implements AccountService{

    /*
    Inyecta automáticamente una instancia de AccountRepository en accountRepository, 
    permitiendo interactuar con la base de datos.
    */
    @Autowired
    private AccountRepository accountRepository;
    
    //Crea una nueva cuenta en el sistema y la guarda usando el método "save" del repositorio.
    @Override
    public Account newAccount(Account newAccount) {
        return accountRepository.save(newAccount);
    }

    //Obtiene todas las cuentas llamando al método "findAll" del repositorio.
    @Override
    public Iterable<Account> getAll() {
        return this.accountRepository.findAll();
    }

    /*
    Modifica los detalles de una cuenta existente. Si la cuenta no se encuentra, 
    devuelve null.
    */
    @Override
    public Account modifyAccount(Account account) {
        Optional<Account> accountFound = this.accountRepository.findById(account.getAccountID());
        if (accountFound.get()!=null){
            accountFound.get().setAccountNumber(account.getAccountNumber());
            accountFound.get().setAccountStatus(account.getAccountStatus());
            accountFound.get().setAccountType(account.getAccountType());
            accountFound.get().setCurrentBalance(account.getCurrentBalance());
            
            return this.newAccount(accountFound.get());
        }
        return null;
    }

    //Elimina la cuenta del sistema por su ID, utilizando el método "deleteById".
    @Override
    public Boolean deleteAccount(Long AccountID) {
        this.accountRepository.deleteById(AccountID);
        return true;
    }   
    
}
