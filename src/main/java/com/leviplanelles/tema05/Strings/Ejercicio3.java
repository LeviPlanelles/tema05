package com.leviplanelles.tema05.Strings;

import com.leviplanelles.tema05.lib.IO;

public class Ejercicio3 {
    /**
     * Este metdodo te cuenta el número de espacios que hay en una frase
     * @param frase una frase
     * @return devuelve un String con el número de espacios que hay en una frase
     */
    public static String vocCons(String frase) {
        int espacios = 0;

        for (int i = 0; i <= frase.length()-1; i++) {
            char letra = frase.charAt(i);
            switch (letra) {
                case ' '-> espacios++;
            }
        }
        return "Hay " + espacios + " espacios en la frase introducida.";
    }

    public static void main(String[] args) {
        String frase = IO.solicitarString("Ingrese una frase: ",0,100);
        IO.close();
        System.out.println(vocCons(frase));
    }
}
