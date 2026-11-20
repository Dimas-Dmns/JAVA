package com.krakedev.Test;

import com.krakedev.Plato;

public class TestPlato {
    public static void main(String[] args) {
        Plato p1 = new Plato();
        p1.setNombre("Encebollado");
        p1.setPrecio(3.50);
        p1.setDescripcion("Sopa de pescado con yuca y cebolla");
        p1.setDisponible(true);

        System.out.println("Nombre: " + p1.getNombre());
        System.out.println("Precio: $" + p1.getPrecio());
        System.out.println("Descripción: " + p1.getDescripcion());
        System.out.println("Disponible: " + p1.isDisponible());
    }
}