package com.leviplanelles.tema05.Strings;

import com.leviplanelles.tema05.lib.IO;

public class Ejercicio6 {
    /**
     * Método que te multiplica una palabra el número de veces que pongas
     * @param frase una frase
     * @param factorMultiplicacion numero de veces que se va a multiplicar la palabra
     * @return String con la palabra seleccionada repetida x veces
     */
    public static String palabraMultiplicada(String frase, int factorMultiplicacion) {
        StringBuilder sb = new StringBuilder(64);
        for (int i = 1; i <= factorMultiplicacion; i++) {
            sb.append(frase);
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        String palabra = IO.solicitarString("Ingresa una palabra:", 0,100);
        int factor = IO.solicitarInt("Ingresa un número:", 0,100);
        System.out.println(palabraMultiplicada(palabra,factor));
    }
}
