package com.krakedev;

public class VehiculoTest {

	public static void main(String[] args) {
		Vehiculo v;
		v = new Vehiculo();
		System.out.println("=========Vehiculo 1 : Creado=======");
		System.out.println("Modelo" + v.getModelo());
		System.out.println("Anio" + v.getAnio());
		System.out.println("Valor" + v.getValor());

		System.out.println("=========Vehiculo 1 : Valores asignados=======");

		v.setAnio("2012");
		v.setModelo("chevrolet");
		v.setValor("34521$");

		System.out.println("Modelo: " + v.getModelo());
		System.out.println("Anio:" + v.getAnio());
		System.out.println("Valor: " + v.getValor());

		System.out.println("=========Vehiculo 2 : Creado=======");
		Vehiculo v2 = new Vehiculo();

		v2.setAnio("2022");
		v2.setModelo("Mazda");
		v2.setValor("23456$");

		System.out.println("Modelo: " + v2.getModelo());
		System.out.println("Anio:" + v2.getAnio());
		System.out.println("Valor: " + v2.getValor());
		
		System.out.println("=========Vehiculo 3 : Creado=======");
		Vehiculo v3 = new Vehiculo("Toyota");
		System.out.println("Marca: " + v3.getMarca());
	
		System.out.println("=========Vehiculo 4 : Creado=======");

		Vehiculo v4 = new Vehiculo("Toyota","El mejor","2011");
		System.out.println("Modelo: " + v4.getModelo());
		System.out.println("Anio:" + v4.getAnio());
		System.out.println("Valor: " + v4.getValor());
	}
}