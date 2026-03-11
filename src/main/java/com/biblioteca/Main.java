package com.biblioteca;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Libro con constructor
        Libro libro1 = new Libro("Java Basico", "Juan Perez", 5, 1);

        // Libro por consola
        Libro libro2 = new Libro();

        System.out.println("Ingrese titulo:");
        libro2.setTitulo(sc.nextLine());

        System.out.println("Ingrese autor:");
        libro2.setAutor(sc.nextLine());

        System.out.println("Ingrese ejemplares:");
        libro2.setEjemplares(sc.nextInt());

        libro2.setPrestados(0);

        // LibroTextoUNIAC
        LibroTextoUNIAC libro3 = new LibroTextoUNIAC(
                "POO Avanzada",
                "Carlos Ruiz",
                10,
                2,
                "Programacion",
                "Ingenieria"
        );

        // Novela
        Novela novela1 = new Novela(
                "Cien años de soledad",
                "Gabriel Garcia Marquez",
                4,
                1,
                "Realista"
        );

        System.out.println(libro1);
        System.out.println(libro2);
        System.out.println(libro3);
        System.out.println(novela1);

        libro1.prestamo();
        libro1.devolucion();

        System.out.println("Estado final libro1:");
        System.out.println(libro1);
    }
}