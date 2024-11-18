package com.leviplanelles.tema05.Arrays;
import java.util.Scanner;

public class Ejercicio3 {
    /**
     * Metodo que te pide 20 numeros consecutivos y te los guarda en un array
     * @return te devuelve ese mismo array con los 20 numeros
     */
    public static int[] pedirNumerosArray() {
        Scanner scanner = new Scanner(System.in);
        int[] numeros = new int[20];
        System.out.println("Introduce 20 números, los separarás pulsando el botón 'Enter'.");
        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = Integer.parseInt(scanner.nextLine());
        }
        return numeros;
    }

    /**
     * Método que imprime una tabla con los números de un array que le pases
     * @param numeros un array de números
     */
    public static void tablaArray(int[] numeros) {
        StringBuilder sb = new StringBuilder(64);
        for (int i = 0; i < numeros.length; i++) {
            sb.append(numeros[i]).append(" ");
            System.out.print(sb);
            sb.setLength(0);
            if ((i + 1) % 4 == 0) {
                System.out.println("\n");
            }
        }
    }
    public static void main(String[] args) {
        int[] numeros = pedirNumerosArray();
        tablaArray(numeros);
    }
}
