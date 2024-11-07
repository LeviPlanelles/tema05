package com.leviplanelles.tema05.Strings;

import com.leviplanelles.tema05.lib.IO;

public class Ejercicio8 {
    /**
     * Este metodo imprime por consola palabra por palabra de una frase y su cantidad de caracteres
     * @param frase una frase
     */
    public static void fraseSeparada(String frase) {
        String[] palabra = frase.split("\\s+");
        String t1 = "Palabra:";
        String t2 = "Cantidad:";
        System.out.printf("%-10s%4s\n",t1,t2);
        System.out.println("-------------------");
        for (int i = 0; i < palabra.length; i++) {
            System.out.printf("%-10s%4s\n",palabra[i],palabra[i].length());
        }

    }
    public static void main(String[] args) {
        String palabra = IO.solicitarString("Ingresa una frase:", 0,100);
        fraseSeparada(palabra);
    }
}
