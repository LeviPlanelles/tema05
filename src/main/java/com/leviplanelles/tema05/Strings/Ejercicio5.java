package com.leviplanelles.tema05.Strings;

import com.leviplanelles.tema05.lib.IO;

public class Ejercicio5 {
    /**
     * Este método te pide una frase y te devuelve la palabra más larga que haya dentro de esa frase
     * @param frase una frase
     * @return te devuelve la palabra más larga que haya dentro de esa frase
     */
    public static String palabraMayor(String frase) {
        String[] palabra = frase.split("\\s+");
        String palabraMasLarga = " ";
        for (int i = 0; i < palabra.length; i++) {
            if (palabra[i].length() > palabraMasLarga.length()) {
                palabraMasLarga = palabra[i];
            }
        }
        return palabraMasLarga;
    }

    public static void main(String[] args) {
        String frase = IO.solicitarString("Ingresa una frase:",0,100);

        System.out.printf("Frase: %s\n",frase);
        System.out.printf("Palabra más larga: %s\n",palabraMayor(frase));
        System.out.printf("Tamaño: %s carácteres",palabraMayor(frase).length());
    }
}
