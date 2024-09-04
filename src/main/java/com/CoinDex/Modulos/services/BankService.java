package com.CoinDex.Modulos.services;

import com.CoinDex.Modulos.model.Bank;

/*
Se define un contrato que cualquier clase que implemente esta interfaz debe cumplir, 
proporcionando implementaciones para todos los métodos definidos en la interfaz.
*/
public interface BankService {
    //Métodos
    
    //Crea uno banco en el sistema.
    Bank newBank (Bank newBank);
    
    //Recupera en forma de lista todos los bancos almacenados en el sistema.
    Iterable<Bank> getAll();
    
    //Modifica los detalles de un banco existente.
    Bank modifyBank(Bank bank);
    
    //Elimina un banco del sistema basada en su ID, devolviendo un valor Boolean.
    Boolean deleteBank (Long BankID);
}
