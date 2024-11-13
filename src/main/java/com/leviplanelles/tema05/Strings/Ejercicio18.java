package com.leviplanelles.tema05.Strings;

import com.leviplanelles.tema05.lib.IO;

public class Ejercicio18 {
    /**
     * Método para pedir una fecha y quitarle los espacios y los guiones
     * @return devuelve la fecha pero solamente los numeros sin ningún espacio
     */
    public static String pedirFechaNac() {
        String fecha = IO.solicitarString("Introduce tu fecha de nacimiento (dd-mm-aaaa): ",0,100);
        String fechaSinEspacios = fecha.trim();
        return fechaSinEspacios.replace("-","");
    }

    /**
     * Método para calcular el número de la suerte
     * @param fechaTodaJunta una fecha
     * @return te devuelve el número de la suerte
     */
    public static int calcularLuckyNumber(String fechaTodaJunta) {
        int total = 0;
        int suma = 0;
        char[] numeros = new char[fechaTodaJunta.length()];
        for (int i = 0; i < fechaTodaJunta.length(); i++) {
            numeros[i] = fechaTodaJunta.charAt(i);
        }
        for (int j = 0; j < numeros.length; j++) {
            total += Character.getNumericValue(numeros[j]);
        }
        String res = String.valueOf(total);
        char n1 = res.charAt(0);
        char n2 = res.charAt(1);
        return Character.getNumericValue(n1) + Character.getNumericValue(n2);
    }
    public static void main(String[] args) {
        String fechaJunta = pedirFechaNac();
        int numero = calcularLuckyNumber(fechaJunta);
        System.out.println("Tu número de la suerte es el: " + numero);
    }
}
