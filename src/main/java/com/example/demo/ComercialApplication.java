package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ComercialApplication {

	public static void main(String[] args) {
		SpringApplication.run(ComercialApplication.class, args);
		
		Comercial comercial1 = new Comercial(1234, "Paco", "Rodriguez", 1600);
		Comercial comercial2 = new Comercial(1234, "Francisco", "Rodriguez", 1700);
		comercial2.crearVentaParametro(1234, "tomate", 100);				
		comercial1.crearVentaParametro(1235, "pepino", 150);
		comercial2.mostrarListaVentas();
		comercial1.mostrarListaVentas();		
		comercial2.devolucion(1234);		
		//comercial2.devolucion();
		
		
		
	}
}
