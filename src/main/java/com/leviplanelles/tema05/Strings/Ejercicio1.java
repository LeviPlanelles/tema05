package com.leviplanelles.tema05.Strings;

import java.util.Scanner;

public class Ejercicio1 {
    /**
     * Este método lo que hace es pillar el primer caracter en mayusculas y se lo guarda en un char al que despues se le suma el resto de la palabra
     * @param cadena una palabra
     * @return devuelve la palabra con la primera letra en mayúsculas
     */
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
