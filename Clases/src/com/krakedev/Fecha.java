package com.krakedev;

public class Fecha {
	
	private int dia;
	private int mes;
	private int anio;
	
	public Fecha(int dia, int mes, int anio) {
		this.dia = dia;
		this.mes = mes;
		this.anio = anio;
	}
	
	public int getDia() {
		return dia;
	}
	public int getMes() {
		return mes;
	}
	public int getAnio() {
		return anio;
	}
	public void setDia(int nuevoDia) {
		dia = nuevoDia;
	}
	public void setAnio(int nuevoAnio) {
		anio = nuevoAnio;
	}
	public void setMes(int nuevoMes) {
		mes = nuevoMes;
	}
}