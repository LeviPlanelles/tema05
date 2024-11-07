package com.leviplanelles.tema05.Strings;

import com.leviplanelles.tema05.lib.IO;

public class Ejercicio4 {
    /**
     * Este metodo recibe una frase y mediante bucles cuenta las vocales y consonantes de cada palabra
     * @param frase una frase
     * @return las vocales y consonantes de cada palabra
     */
    public static String vocConsFrase(String frase) {
        StringBuilder sb = new StringBuilder(64);
        frase = frase.toLowerCase();
        String[] palabra = frase.split("\\s+");
        int vocales,consonantes;
        int contadorPalabra = 1;
        for (int i = 0; i < palabra.length; i++) {
            vocales = 0;
            consonantes = 0;
            for (int j = 0; j <= palabra[i].length()-1; j++) {
                char letra = palabra[i].charAt(j);
                switch (letra) {
                    case 'a','e','i','o','u' -> vocales++;
                    case 'b','c','d','f','g','h','j','k','l','m','n','ñ','p','q','r','s','t','v',
                         'x','z','w','y' -> consonantes++;
                }
            }
            sb.append("Palabra nº").append(contadorPalabra).append(": --> Vocales: ").append(vocales).append(" Consonantes: ").append(consonantes).append("\n");
            contadorPalabra++;
        }
        return sb.toString();
    }
    public static void main(String[] args) {

        String frase = IO.solicitarString("Ingresa una frase:",0,100);
        System.out.println("La frase es: " + frase);
        System.out.println(vocConsFrase(frase));
    }
}
