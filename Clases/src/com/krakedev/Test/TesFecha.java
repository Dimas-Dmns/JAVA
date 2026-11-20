package com.krakedev.Test;

import com.krakedev.Fecha;

public class TesFecha {

	public static void main(String[] args) {
		Fecha f1 = new Fecha(20, 2, 2026);

		System.out.println("Anio: "+f1.getAnio());
		System.out.println("Mes: "+f1.getMes());
		System.out.println("Dia: "+f1.getDia());
	}
}