package com.leviplanelles.tema05.Strings;

import com.leviplanelles.tema05.lib.IO;

public class Ejercicio13 {
    public static void mostrarMenu() {
        System.out.println("MENÚ PRINCIPAL");
        System.out.println("==============");
        System.out.println("1. Palabra más larga");
        System.out.println("2. Palabra más corta");
        System.out.println("3. Número de vocales");
        System.out.println("----------------------------------");
        System.out.println("0. Salir");
    }
    public static String masLarga() {
        String p1,p2,p3,palabraLarga;
        p1 = IO.solicitarString("Introduce una palabra:",0,100);
        p2 = IO.solicitarString("Introduce otra palabra:",0,100);
        p3 = IO.solicitarString("Introduce otra palabra:",0,100);
        String[] palabra1 = p1.split("\\s+");
        String[] palabra2 = p1.split("\\s+");
        String[] palabra3 = p1.split("\\s+");
        palabraLarga = palabra1.length >= palabra2.length ? p1:p2;
        palabraLarga = palabraLarga.length() > palabra3.length ? palabraLarga : p3;
        return palabraLarga;
    }
    public static String masCorta() {
        String p1,p2,p3,palabraCorta;
        p1 = IO.solicitarString("Introduce una palabra:",0,100);
        p2 = IO.solicitarString("Introduce otra palabra:",0,100);
        p3 = IO.solicitarString("Introduce otra palabra:",0,100);
        String[] palabra1 = p1.split("\\s+");
        String[] palabra2 = p1.split("\\s+");
        String[] palabra3 = p1.split("\\s+");
        palabraCorta = palabra1.length <= palabra2.length ? p1:p2;
        palabraCorta = palabraCorta.length() < palabra3.length ? palabraCorta : p3;
        return palabraCorta;
    }
    public static int numVocales(String palabra) {
        return IO.contarVocales(palabra);
    }
    public static void main(String[] args) {
        String palabra;
        int choice;
        do {
            mostrarMenu();
            choice = IO.solicitarInt("Elige una opción: ",0,3);
            switch (choice) {
                case 1 -> System.out.println("La palabra más larga de las tres introducidas es: " + masLarga());
                case 2 -> System.out.println("La palabra más de las tres introducidas es: " + masCorta());
                case 3 -> {
                    palabra = IO.solicitarString("Ingresa una palabra:",0,100);
                    System.out.println("El número de vocales que tiene la palabra '" + palabra + "' es: " + numVocales(palabra));
                }
                case 0 ->{}
            }
        }while (choice != 0);
    }
}
