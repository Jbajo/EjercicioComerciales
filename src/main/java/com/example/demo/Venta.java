package com.example.demo;

public class Venta {
	
	private long id;
	private String nombre;
	private long valor;
	
	public Venta() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Venta(long id, String nombre, long valor) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.valor = valor;
	}
	
	
	
	public void pintarVenta() {
		System.out.println("el producto de id " + this.id + " nombre " + this.nombre + " y precio " +this.valor);
	}
	
	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public long getValor() {
		return valor;
	}

	public void setValor(long valor) {
		this.valor = valor;
	}
	
	

}
