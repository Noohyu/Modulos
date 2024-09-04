package com.CoinDex.Modulos;

//Clase que se utiliza para construir y personalizar la aplicación Spring Boot antes de iniciarla.
import org.springframework.boot.builder.SpringApplicationBuilder;

/*
Clase base utilizada para configurar la aplicación cuando se despliega en un servidor 
de aplicaciones que admite servlets.
*/
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

public class ServletInitializer extends SpringBootServletInitializer {

         //Indica que el método que sigue sobrescribe un método de la clase padre (SpringBootServletInitializer).
	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
                /* 
                El método "protected" se utiliza para personalizar cómo se inicia la aplicación cuando se 
                ejecuta en un servidor de aplicaciones.

                return application.sources(ModulosApplication.class);
                Indica que la clase principal de la aplicación es ModulosApplication. 
                */
		return application.sources(ModulosApplication.class);
	}

}
