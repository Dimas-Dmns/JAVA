package com.krakedev;

public class Rectangulo {

	private int base;
	private int altura;

	public int getBase() {
		return base;
	}

	public void setBase(int nuevaBase) {
		base = nuevaBase;
	}

	public int getAltura() {
		return altura;
	}

	public void setAltura(int nuevaAltura) {
		altura = nuevaAltura;
	}

	public int calcularArea() {
		int area = base * altura;
		return area;
	}

	public double calcularPerimetro() {
		double perimetro = base + base + altura + altura;
		return perimetro;
	}
}