package com.leviplanelles.tema05.Arrays;
import java.util.Scanner;

public class Ejercicio2 {
    /**
     * Metodo que te pide 10 caracteres consecutivos y te los guarda en un array
     * @return te devuelve ese mismo array con los 10 caracteres
     */
    public static char[] pedirCaracteresArray() {
        Scanner scanner = new Scanner(System.in);
        char[] c = new char[10];
        System.out.println("Introduce 10 caracteres, los separarás pulsando el botón 'Enter'.");
        for (int i = 0; i < c.length; i++) {
            c[i] = scanner.next().charAt(0);
        }
        return c;
    }

    /**
     * Visualiza las posiciones impares de un array
     * @param caracteres un array
     */
    public static void visualizarArrayPosicionesImpares(char[] caracteres) {
        for (int i = 0; i < caracteres.length; i += 2) {
            System.out.print(caracteres[i] + " ");
        }
        System.out.println("\n");
    }

    /**
     * Visualiza las posiciones pares de un array
     * @param caracteres un array
     */
    public static void visualizarArrayPosicionesPares(char[] caracteres) {
        for (int i = 1; i < caracteres.length; i += 2) {
            System.out.print(caracteres[i] + " ");
        }
        System.out.println("\n");
    }

    public static void main(String[] args) {
        char[] caracteres = pedirCaracteresArray();
        visualizarArrayPosicionesPares(caracteres);
        visualizarArrayPosicionesImpares(caracteres);

    }
}
