package com.CoinDex.Modulos.services;

import com.CoinDex.Modulos.model.Transaction;

/*
Se define un contrato que cualquier clase que implemente esta interfaz debe cumplir, 
proporcionando implementaciones para todos los métodos definidos en la interfaz.
*/
public interface TransactionService {
    //Métodos
    
    //Crea una transacción en el sistema.
    Transaction newTransaction (Transaction newTransaction);
    
    //Recupera en forma de lista todas las transacciones almacenadas en el sistema.
    Iterable<Transaction> getAll();
    
    //Modifica los detalles de una transacción existente.
    Transaction modifyTransaction(Transaction transaction);
    
    //Elimina una transacción del sistema basada en su ID, devolviendo un valor Boolean.
    Boolean deleteTransaction (Long TransactionID);
}
