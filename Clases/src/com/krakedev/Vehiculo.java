package com.krakedev;

public class Vehiculo {
	private String marca;
	private String modelo;
	private String anio;
	private String valor;
	
	
	
	
	public Vehiculo() {
		System.out.println("Ingresa el metodo constructor:");
	}
	public Vehiculo(String marca) {
		this.marca=marca;
		System.out.println("Ingresa el metodo constructor:");
	}
	
	public Vehiculo(String modelo, String marca , String anio) {
		this.modelo=modelo;
		this.anio= anio;
		this.marca=marca;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public String getAnio() {
		return anio;
	}

	public void setAnio(String anio) {
		this.anio = anio;
	}

	public String getValor() {
		return valor;
	}

	public void setValor(String valor) {
		this.valor = valor;
	}
}