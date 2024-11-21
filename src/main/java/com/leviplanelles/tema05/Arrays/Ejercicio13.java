package com.leviplanelles.tema05.Arrays;

import com.leviplanelles.tema05.lib.IO;


public class Ejercicio13 {

    public static void main(String[] args) {
        int[] arr = IO.crearArrayEnteros(2,5);
        int[] arrPares = Ejercicio7.arrayMultiplosDeNum(arr,2);
        IO.visualizarArrayEnteros(arr);
        if (arrPares == null) {
            System.out.println("No hay ningún elemento par");
        }else {
            IO.visualizarArrayEnteros(arrPares);
        }


    }
}
