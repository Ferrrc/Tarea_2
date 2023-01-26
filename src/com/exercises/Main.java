package com.exercises;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner precio1 = new Scanner(System.in);
        System.out.println("Introduce un precio:");

        int precio = precio1.nextInt();
        double precioConIVA = getPrecioConIVA(precio);
        System.out.println("Tu precio es: " + precioConIVA);


    }

    static double getPrecioConIVA(double precio) {
        final double IVA = 0.21; // IVA en España
        return precio + (precio * IVA); //Agrego parentesis para q el codigo sea mas legible
    }


}