package com.krakedev;

public class VehiculoTest {

	public static void main(String[] args) {
		Vehiculo v;
		v = new Vehiculo();
		System.out.println("=========Vehiculo 1 : Creado=======");
		System.out.println("Modelo"+v.modelo);
		System.out.println("Anio"+v.anio);
		System.out.println("Valor"+v.valor);
		
		System.out.println("=========Vehiculo 1 : Valores asignados=======");

		
		
		
		v.anio = "2012";
		v.modelo = "chevrolet";
		v.valor = "34521$";
		
		System.out.println("Modelo: "+v.modelo);
		System.out.println("Anio:" +v.anio);
		System.out.println("Valor: "+v.valor);
		
		System.out.println("=========Vehiculo 2 : Creado=======");
		Vehiculo v2 = new Vehiculo();
		
		
		v.anio = "2022";
		v.modelo = "Mazda";
		v.valor = "23456$";
		
		System.out.println("Modelo: "+v.modelo);
		System.out.println("Anio:" +v.anio);
		System.out.println("Valor: "+v.valor);
	}

}
