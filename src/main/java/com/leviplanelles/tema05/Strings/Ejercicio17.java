package com.leviplanelles.tema05.Strings;

import com.leviplanelles.tema05.lib.IO;
import static com.leviplanelles.tema05.Strings.Ejercicio16.calcularNIF;
public class Ejercicio17 {
    /**
     * Este metodo te comprueba si el NIF introducido es correcto o no
     * @param NIF un NIF
     * @return devuelve true o false dependiendo de si es valido o no
     */
    public static boolean comprobarNIF(String NIF) {
        String dni = NIF.substring(0, NIF.length()-1);
        int DNI = Integer.parseInt(dni);
        return NIF.equals(calcularNIF(DNI));
    }

    public static void main(String[] args) {
        String NIF = IO.solicitarString("Ingresa tu NIF:",0,100);
        boolean valido = comprobarNIF(NIF.trim().toUpperCase());
        String res = valido ? "El NIF introducido es correcto" : "El NIF introducido es incorrecto!" ;
        System.out.println(res);
    }
}
