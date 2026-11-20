package com.krakedev;

public class Calculadora {
	
	private String marca;
	private String modelo;
	private boolean esCientifica;
	
	public Calculadora(String marca, String modelo, boolean esCientifica) {
		this.marca = marca;
		this.modelo = modelo;
		this.esCientifica = esCientifica;
	}
	
	public String getMarca() {
		return marca;
	}

	public String getModelo() {
		return modelo;
	}

	public boolean isEsCientifica() {
		return esCientifica;
	}

	public int sumar(int a, int b) {
		int resultado;
		resultado = a + b;
		return resultado;
	}
	
	public int restar(int a , int b) {
		int resultado;
		resultado = a-b;
		return resultado;
	}
	
	public double multiplicar(double a , double b) {
		double resultado;
		resultado = a*b;
		return resultado;
	}
	
	public double dividir(double a , double b) {
		double resultado;
		resultado = a/b;
		return resultado;
	}

	public double promediar(double a , double b,double c) {
		double resultado;
		resultado = (a+b+c)/3;
		return resultado;
	}

	public void mostrarResultado() {
		System.out.println("Ahorita no joven, Salí al almuerzo. Regreso en 15 minutos");
	}
	
	public double calcularDescuento(double precio, double descuento) {
		double valor=precio-((precio*descuento)/100);
		return valor;
	}
}