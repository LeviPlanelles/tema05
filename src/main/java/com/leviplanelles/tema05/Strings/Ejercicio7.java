package com.leviplanelles.tema05.Strings;

import com.leviplanelles.tema05.lib.IO;

public class Ejercicio7 {
    /**
     * Este metodo imprime por consola palabra por palabra de una frase
     * @param frase una fresa
     * @return devuelve un string
     */
    public static String fraseSeparada(String frase) {
        StringBuilder sb = new StringBuilder();
        String[] palabra = frase.split("\\s+");

        for (int i = 0; i < palabra.length; i++) {
            sb.append(palabra[i]).append("\n");
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        String palabra = IO.solicitarString("Ingresa una frase:", 0,100);
        System.out.println(fraseSeparada(palabra));
    }
}
