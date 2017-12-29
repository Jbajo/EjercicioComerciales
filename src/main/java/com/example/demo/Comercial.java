package com.example.demo;

import java.util.ArrayList;
/**
 * 
 * @author Javier Bajo Chacon  javier.bajochacon@gmail.com
 *
 */
public class Comercial {
	
	private long id;
	String nombre;
	String apellido;
	long salario;
	private ArrayList<Venta> ventas;
	
	/**
	 * 
	 * @param id
	 * @param nombre
	 * @param apellido
	 * @param salario
	 */
	public Comercial(long id, String nombre, String apellido, long salario) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.apellido = apellido;
		this.salario = salario;
		this.ventas = new ArrayList <Venta>();
	}

	
	public Comercial() {
		super();
		// TODO Auto-generated constructor stub
	}

/**
 * 
 * @return
 */
	public Venta crearVenta() {
		Venta aux = new Venta();
		ventas.add(aux);
		return aux;		
		
	}
	
	public void mostrarListaVentas() {
		final Venta[] aux = new Venta[1];
		this.ventas.forEach(k->{
		aux[0]= k;		
		System.out.println(aux[0].getNombre()+ " " + aux[0].getId()+ " " + aux[0].getValor());});
	}
	
	/**
	 * 
	 * @param id del elemento a introducir en el ArrayList de ventas
	 * @param nombre nombre del producto
	 * @param valor precio del producto
	 * 
	 */
	
	public Venta crearVentaParametro(long id, String nombre, long valor) {
		Venta aux = new Venta(id, nombre, valor); 
		ventas.add(aux);
		return aux;
	}
	
	/**
	 * 
	 * @param id del elemento a eliminar del ArrayList de ventas
	 */
	public void devolucion(long id) {
		final Venta[] devuelto = new Venta[1];
		final Venta []i = new Venta[1];
		final boolean [] encontrado = new boolean[] {false};
		
		if(ventas.size()>0) {
		ventas.forEach(k->{
			devuelto[0]= k;
		if(devuelto[0].getId()==id) {			
			i[0]=devuelto[0];
			encontrado[0] = true;//Encontrado id en el ArrayList
		}});
		
		if(encontrado[0]) {
			if(i[0].getId()==id) {
			System.out.println("El comercial con id +" +this.id + " ha devuelto el producto +" + id);
			ventas.remove(ventas.indexOf(i[0]));
			}
		}
		else {
				System.out.println("Id " + id + " no encontrado");
		}
		}
	}

	public float getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public float getSalario() {
		return salario;
	}

	public void setSalario(long salario) {
		this.salario = salario;
	}
}
