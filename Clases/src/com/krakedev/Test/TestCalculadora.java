package com.krakedev.Test;

import com.krakedev.Calculadora;

public class TestCalculadora {

	public static void main(String[] args) {
		Calculadora c1 = new Calculadora("Casio", "fx-991ES", true);
		
		System.out.println("Calculadora: " + c1.getMarca() + " " + c1.getModelo());
		
		int r1;
		r1 = c1.sumar(6, 10);
		System.out.println("Resultado suma: " + r1);
		
		int r2;
		r2 = c1.restar(10, 5);
		System.out.println("Resultado resta: " + r2);
		
		double r3;
		r3 = c1.multiplicar(5, 10);
		System.out.println("Resultado multiplicacion: "+r3);
		
		double r4;
		r4 = c1.dividir(10, 2);
		System.out.println("Resultado division: "+r4);
		
		double r5;
		r5 = c1.promediar(10, 8, 9);
		System.out.println("Resultado promedio: "+r5);
		
		Calculadora n1 = new Calculadora("Sharp", "EL-531", false);
		n1.mostrarResultado();
		
		double r6;
		r6 = c1.calcularDescuento(10, 5);
		System.out.println("Descuento: "+r6);
	}
}