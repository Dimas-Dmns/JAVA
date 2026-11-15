package com.krakedev;

public class TestRestaurante {
    public static void main(String[] args) {
        Restaurante r1 = new Restaurante();
        r1.setNombre("La Casa de la Abuela");
        r1.setDireccion("Av. Amazonas y Colón");
        r1.setTipoComida("Comida Típica");
        r1.setCalificacion(5);

        System.out.println("Nombre: " + r1.getNombre());
        System.out.println("Dirección: " + r1.getDireccion());
        System.out.println("Tipo de comida: " + r1.getTipoComida());
        System.out.println("Calificación: " + r1.getCalificacion());
    }
}