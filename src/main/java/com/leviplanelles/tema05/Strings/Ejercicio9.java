package com.leviplanelles.tema05.Strings;


import com.leviplanelles.tema05.lib.IO;

public class Ejercicio9 {

    public static String fraseLetrasImpares(String frase) {
        StringBuilder sb = new StringBuilder();
        String[] letra = frase.split("\\s?");
        for (int i = 1; i < frase.length(); i+=2) {
            sb.append(letra[i]);
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        String frase = IO.solicitarString("Ingresa una frase: ",0,100);
        System.out.println(fraseLetrasImpares(frase));
    }
}
