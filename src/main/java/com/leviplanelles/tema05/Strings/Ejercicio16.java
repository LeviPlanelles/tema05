package com.leviplanelles.tema05.Strings;

import com.leviplanelles.tema05.lib.IO;

public class Ejercicio16 {
    /**
     * Método que te pide el DNI
     * @return te devuelve el dni introducido como un int
     */
    public static int solicitarDNI() {
        String DNI = IO.solicitarString("Ingresa tu DNI pero sin la letra final:",0,100);
        String dniCorrecto = DNI.trim();
        return Integer.parseInt(dniCorrecto);
    }

    /**
     * Método que con un DNI te calcula el NIF
     * @param DNI necesita de un DNI
     * @return te devuelve un String con el NIF (DNI + letra)
     */
    public static String calcularNIF(int DNI) {
        StringBuilder sb = new StringBuilder();
        int numero = DNI % 23;
        String letra = switch (numero) {
            case 0 ->"T";
            case 1 ->"R";
            case 2 ->"W";
            case 3 ->"A";
            case 4 ->"G";
            case 5 ->"M";
            case 6 ->"Y";
            case 7 ->"F";
            case 8 ->"P";
            case 9 ->"D";
            case 10 ->"X";
            case 11 ->"B";
            case 12 ->"N";
            case 13 ->"J";
            case 14 ->"Z";
            case 15 ->"S";
            case 16 ->"Q";
            case 17 ->"V";
            case 18 ->"H";
            case 19 ->"L";
            case 20 ->"C";
            case 21 ->"K";
            case 22 ->"E";
            default -> "Error";
        };
        return sb.append(DNI).append(letra).toString();
    }
    public static void main(String[] args) {
        int DNI = solicitarDNI();
        System.out.println("Tu NIF es: " + calcularNIF(DNI));
    }
}
