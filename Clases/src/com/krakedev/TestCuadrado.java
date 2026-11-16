package com.krakedev;

public class TestCuadrado {

	public static void main(String[] args) {
		Cuadrado r1 = new Cuadrado();
		r1.lado=4;

		
		double calcularArea;
		calcularArea=r1.calcularArea();
		System.out.println("Resultado area: "+ calcularArea);
		
		
		
		Cuadrado r2 = new Cuadrado();
		r2.lado=3;

		
		double calcularPerimetro;
		calcularPerimetro=r2.calcularPerimetro();
		System.out.println("Resultado perimetro: "+ calcularPerimetro);
	
	}

}
