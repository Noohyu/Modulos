package com.CoinDex.Modulos;

//Clase que inicializa la aplicación Spring Boot
import org.springframework.boot.SpringApplication;

//Utiliza la configuración automática de Spring Boot
import org.springframework.boot.autoconfigure.SpringBootApplication;

/*@SpringBootApplication: Habilita la configuración automática, escaneo 
de componentes y permite definir una clase principal para ejecutar una aplicación 
Spring Boot.
*/
@SpringBootApplication
public class ModulosApplication {

	public static void main(String[] args) {
            /*
            SpringApplication.run: Método que inicia la aplicación Spring Boot.
            ModulosApplication.class: Indica la clase principal que debe usarse 
            para lanzar la aplicación.
            */
		SpringApplication.run(ModulosApplication.class, args);
	}

}
    