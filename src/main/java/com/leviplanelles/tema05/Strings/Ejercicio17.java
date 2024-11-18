package com.leviplanelles.tema05.Strings;

import com.leviplanelles.tema05.lib.IO;
import static com.leviplanelles.tema05.Strings.Ejercicio16.calcularNIF;
public class Ejercicio17 {
    /**
     * Este metodo te comprueba si el nif introducido es correcto o no
     * @param nif un nif
     * @return devuelve true o false dependiendo de si es valido o no
     */
    public static boolean comprobarNIF(String nif) {
        String documentoNacionalIdentidad = nif.substring(0, nif.length()-1);
        int dni = Integer.parseInt(documentoNacionalIdentidad);
        return nif.equals(calcularNIF(dni));
    }

    public static void main(String[] args) {
        String nif = IO.solicitarString("Ingresa tu NIF:",0,100);
        boolean valido = comprobarNIF(nif.trim().toUpperCase());
        String res = valido ? "El NIF introducido es correcto" : "El NIF introducido es incorrecto!" ;
        System.out.println(res);
    }
}
