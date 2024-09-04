package com.CoinDex.Modulos.controller;

/*
Importación de la clases para trabajar con Spring, inyección de dependencias, 
mapeo de solicitudes HTTP, además de incluir anotaciones que definen el comportamiento
del controlador.
*/
import com.CoinDex.Modulos.model.Account;
import com.CoinDex.Modulos.services.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/*
 Anotaciones para gestionar solicitudes HTTP y devolverá respuestas en formato
JSON o similar y definir la ruta de base para todas las solicitudes gestionadas por
el controlador.
*/
@RestController
@RequestMapping("/account")
public class AccountController {
    
    //Inyectar automaticamente una instancia.
    @Autowired
    private AccountService accountService;
    
    /*
    El metódo mapea solicitudes HTTP POST a URL y utiliza la anotación "@RequestBody" para convertir
    el cuerpo de la solicitud en un objeto "Account",y luego pasa al servicio "AccountService" para 
    la creación de una cuenta.
    */
    @PostMapping("/new_account")
    public Account newAccount(@RequestBody Account account){
        return this.accountService.newAccount(account);
    }
    
    //Mapea solitudes HTTP Get y devuelve una lista de todas las cuentas.
    @GetMapping("/show_account")
    public Iterable<Account> getAll(){
        return accountService.getAll();
    }
    
    /*
    Recibe el objeto "Account" que contiene la información modificada y lo pasa al servicio
    para actualizar los datos correspondientes
    */
    @PostMapping("/modify_account")
    public Account modifyAccount (@RequestBody Account account){
        return this.accountService.modifyAccount(account);
    }
    
    /*
    La anotación "@PathVariable" vincula el valor de la URL al parametro "id". Utilizando el 
    {id} como variable que representa el ID de la cuenta para eliminarla.
    */
    @PostMapping(value="/{id}")
    public Boolean deleteAccount(@PathVariable(value="id") Long id){
        return this.accountService.deleteAccount(id);
    }
}
