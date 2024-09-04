package com.CoinDex.Modulos.services;

/*
Importación de la clase "Transaction", el repositorio "TransactionRepository", 
la clase "Optional" para manejar valores que pueden ser nulos, 
y las anotaciones "@Autowired" y "@Service".

*/
import com.CoinDex.Modulos.model.Transaction;
import com.CoinDex.Modulos.repository.TransactionRepository;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/*
Indica que la clase es un servicio gestionado por el contenedor de Spring. 
Además, implementa la interfaz TransactionService, proporcionando implementaciones 
para todos los métodos definidos en dicha interfaz.
*/
@Service
public class TransactionServiceImpl implements TransactionService{

    /*
    Inyecta automáticamente una instancia de TransactionRepository en transactionRepository, 
    permitiendo interactuar con la base de datos.
    */
    @Autowired
    private TransactionRepository transactionRepository;
    
    //Crea una nueva transacción en el sistema y la guarda usando el método "save" del repositorio.
    @Override
    public Transaction newTransaction(Transaction transaction) {
        return transactionRepository.save(transaction);
    }

    //Obtiene todas las transacciones llamando al método "findAll" del repositorio.
    @Override
    public Iterable<Transaction> getAll() {
        return this.transactionRepository.findAll();
    }

    /*
    Modifica los detalles de una transacción existente. Si la transacción no se encuentra, 
    devuelve null.
    */
    @Override
    public Transaction modifyTransaction(Transaction transaction) {
        Optional<Transaction> transactionFound = this.transactionRepository.findById(transaction.getTransactionID());
        if(transactionFound.get()!=null){
            transactionFound.get().setAmount(transaction.getAmount());
            transactionFound.get().setTransactionDate(transaction.getTransactionDate());
            transactionFound.get().setTransactionType(transaction.getTransactionType());
            
            return this.newTransaction(transactionFound.get());
        }
        return null;
    }

    //Elimina la transacción del sistema por su ID, utilizando el método "deleteById".
    @Override
    public Boolean deleteTransaction(Long TransactionID) {
        this.transactionRepository.deleteById(TransactionID);
        return true;
    }
    
}
