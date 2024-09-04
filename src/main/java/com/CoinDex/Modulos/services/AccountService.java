package com.CoinDex.Modulos.services;

import com.CoinDex.Modulos.model.Account;

/*
Se define un contrato que cualquier clase que implemente esta interfaz debe cumplir, 
proporcionando implementaciones para todos los métodos definidos en la interfaz.
*/
public interface AccountService {
    //Métodos
    
    //Crea una nueva cuenta en el sistema.
    Account newAccount (Account newAccount);
    
    //Recupera en forma de lista todas las cuentas almacenadas en el sistema.
    Iterable<Account> getAll();
    
    //Modifica los detalles de una cuenta existente.
    Account modifyAccount(Account account);
    
    //Elimina una cuenta del sistema basada en su ID, devolviendo un valor Boolean.
    Boolean deleteAccount (Long AccountID);
    
}
