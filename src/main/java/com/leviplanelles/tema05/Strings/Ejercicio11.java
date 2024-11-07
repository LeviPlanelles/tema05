package com.leviplanelles.tema05.Strings;

import com.leviplanelles.tema05.lib.IO;

public class Ejercicio11 {
    public static void nombreApellidos(String nombre, String apellido1, String apellido2) {
        StringBuilder sb = new StringBuilder();
        String nombreCompleto = nombre + " " + apellido1 + " " + apellido2;
        System.out.println(nombreCompleto);
        for (int i = 0; i < nombreCompleto.length(); i++) {
            System.out.print("-");
        }
        System.out.println();
        System.out.println("a)");
        System.out.println(nombreCompleto.toLowerCase());
        System.out.println(nombreCompleto.toUpperCase());
        System.out.println(nombreCompleto.length());
        System.out.println("----");
        System.out.println("b)");
        if (nombreCompleto.length() >= 5) {
            System.out.println(nombreCompleto.substring(0,5));
        }else {
            System.out.println(nombreCompleto);
        }
        System.out.println("----");
        System.out.println("c)");
        if (nombreCompleto.length() >= 2) {
            System.out.println(nombreCompleto.substring(nombreCompleto.length()-2));
        }else {
            System.out.println(nombreCompleto);
        }
        System.out.println("----");
        System.out.println("d)");
        char ultimaLetra = nombreCompleto.charAt(nombreCompleto.length()-1);
        String soloUltimaLetra = nombreCompleto.replaceAll("[^"+ultimaLetra+"]","");
        int cantidad = soloUltimaLetra.length();
        System.out.println("En el nombre " + nombreCompleto + ", la última letra que es '" + ultimaLetra + "' se repite "+ cantidad + " veces.");
        System.out.println("----");
        System.out.println("e)");
        char primeraLetra = nombreCompleto.charAt(0);
        String soloPrimeraLetra = nombreCompleto.replaceAll("[^"+primeraLetra+"]","");
        System.out.println(soloPrimeraLetra.toUpperCase());
        System.out.println("----");
        System.out.println("f)");
        System.out.println("***"+nombreCompleto+"***");
        System.out.println("----");
        System.out.println("g");
        System.out.println(sb.append(nombre).append(" ").append(apellido1).append(" ").append(apellido2).reverse());
    }

    public static void main(String[] args) {
        String nombre = IO.solicitarString("Ingresa tu nombre",0,100);
        String apellido1 = IO.solicitarString("Ingresa tu primer apellido",0,100);
        String apellido2 = IO.solicitarString("Ingresa tu segundo apellido",0,100);
        nombreApellidos(nombre,apellido1,apellido2);
    }
}
