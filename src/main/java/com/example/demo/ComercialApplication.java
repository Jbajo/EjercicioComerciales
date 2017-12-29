package com.example.demo;

import java.util.ArrayList;
import java.util.Scanner;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ComercialApplication {

	public static void main(String[] args) {
		SpringApplication.run(ComercialApplication.class, args);
		int opcion = 0;
		long salario = 0;
		long id = 0;
		String nombre ="";
		String[] nombreCompuesto = new String[] {"","",""};
		String apellido ="";
		Scanner sc = new Scanner (System.in);
		ArrayList <Comercial> comerciales = new ArrayList <Comercial>();
		
		
		
		
		comerciales.add(new Comercial(1234, "Paco", "Rodriguez", 1600));
		comerciales.add(new Comercial(1234, "Francisco", "Rodriguez", 1700));
		Venta venta1 =comerciales.get(0).crearVentaParametro(1236, "tomate", 170);				
		Venta venta2 =comerciales.get(1).crearVentaParametro(1235, "pepino", 150);
		comerciales.get(0).mostrarListaVentas();
		comerciales.get(1).mostrarListaVentas();		
		comerciales.get(0).devolucion(1236);	
		comerciales.get(1).devolucion(1235);
		
		
		
		
	}
}
