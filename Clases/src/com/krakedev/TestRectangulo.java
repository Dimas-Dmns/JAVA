package com.krakedev;

public class TestRectangulo {

	public static void main(String[] args) {
		Rectangulo r1 = new Rectangulo();
		r1.setAltura(5);
		r1.setBase(4);

		int resultadoArea;
		resultadoArea = r1.calcularArea();
		System.out.println("Resultado area:" + resultadoArea);

		Rectangulo r2 = new Rectangulo();
		int resultadoArea2;
		r2.setAltura(8);
		r2.setBase(2);
		resultadoArea2 = r2.calcularArea();
		System.out.println("Resultado area 2: " + resultadoArea2);

		Rectangulo r3 = new Rectangulo();
		double calcularPerimetro;
		r3.setAltura(4);
		r3.setBase(2);
		r3.setBase(2);
		r3.setAltura(4);
		calcularPerimetro = r3.calcularPerimetro();
		System.out.println("Resultado perimetro: " + calcularPerimetro);
	}
}