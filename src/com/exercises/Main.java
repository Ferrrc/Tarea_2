package com.exercises;

public class Main {
    public static void main(String[] args) {
        double precio = 100.0;
        double precioConIVA = getPrecioConIVA(precio);
        System.out.println("Precio con IVA: " + precioConIVA);


    }

    static double getPrecioConIVA(double precio) {
        final double IVA = 0.21; // IVA en España
        return precio + (precio * IVA); //Agrego parentesis para q el codigo sea mas legible
    }


}