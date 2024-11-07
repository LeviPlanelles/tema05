package com.leviplanelles.tema05.Strings;

public class Ejercicio10 {

    public static boolean palindroma(String palabra) {
        StringBuilder sb = new StringBuilder();
        sb.append(palabra);
        return sb.reverse().toString().equals(palabra);
    }
    public static void main(String[] args) {
        String texto = "holaaloh";
        String validar = palindroma(texto) ? texto + " es una palabra palíndroma" : texto + " no es una palabra palíndroma";
        System.out.println(validar);
    }
}
