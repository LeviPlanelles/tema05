package com.leviplanelles.tema05.Strings;

import com.leviplanelles.tema05.lib.IO;

import java.util.Scanner;

public class Ejercicio15 {
    /**
     * Metodo que te imprime una tabla dependiendo de las filas y las columnas que le metas y con el simbolo que tu hayas marcado
     * @param filas un numero de filas
     * @param columnas un numero de columnas
     * @param c el caracter con el que se va a hacer la tabla
     */
    public static void imprimirTablaRara(int filas, int columnas, char c) {
        for (int i = 1; i <= filas; i++) {
            for (int j = 1; j <= columnas; j++) {
                System.out.print(c);
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int filas,columnas;
        char c;
        filas = IO.solicitarInt("Ingresa el número de filas:",0,100);
        columnas = IO.solicitarInt("Ingresa el número de columnas:",0,100);
        System.out.println("Ingresa un carácter:");
        c = scanner.nextLine().charAt(0);
        imprimirTablaRara(filas,columnas,c);
    }
}
