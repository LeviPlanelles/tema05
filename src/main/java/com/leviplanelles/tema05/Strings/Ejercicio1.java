package com.leviplanelles.tema05.Strings;

import java.util.Scanner;

public class Ejercicio1 {

    public static String primeraEnMayus(String cadena) {
        char primerCaracter = cadena.toUpperCase().charAt(0);
        return primerCaracter + cadena.substring(1);
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Escribe una palabra con todo en minúsculas:");
        String cadena = scanner.nextLine();
        scanner.close();
        System.out.println(primeraEnMayus(cadena));

    }
}
