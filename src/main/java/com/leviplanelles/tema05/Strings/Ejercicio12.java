package com.leviplanelles.tema05.Strings;

public class Ejercicio12 {

    public static String sustituirOcurrencias(String cadena) {
        return cadena.replaceAll("es","no por");
    }
    public static String sustituirDigitos(String cadena) {
        return cadena.replaceAll("\\d+","*");
    }

    public static void main(String[] args) {
    String cadena = "esto1234es5678bueno900";
    System.out.println(sustituirOcurrencias(cadena));
    System.out.println(sustituirDigitos(cadena));
    }
}
