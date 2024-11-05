package com.leviplanelles.tema05.Strings;

import com.leviplanelles.tema05.lib.IO;

public class Ejercicio2 {
    /**
     * Este metdodo te cuenta las vocales y consonantes de una frase
     * @param frase una frase
     * @return devuelve un String con el número de consonantes y vocales que hay en la frase
     */
    public static String vocCons(String frase) {
        int vocales = 0;
        int consonantes = 0;

        frase = frase.toLowerCase();
        for (int i = 0; i <= frase.length()-1; i++) {
            char letra = frase.charAt(i);
            switch (letra) {
                case 'a','e','i','o','u' -> vocales++;
                case 'b','c','d','f','g','h','j','k','l','m','n','ñ','p','q','r','s','t','v',
                     'x','z','w','y' -> consonantes++;
                default -> {
                }
            }
        }
        return "Hay " + vocales + " vocales y " + consonantes + " consonantes.";
    }

    public static void main(String[] args) {
        String frase = IO.solicitarString("Ingrese una frase: ",0,100);
        IO.close();
        System.out.println(vocCons(frase));
    }
}
