package com.leviplanelles.tema05.Arrays;

import com.leviplanelles.tema05.lib.IO;

import java.util.Arrays;

public class Ejercicio11 {
    /**
     * Funcion que te invierte un array
     * @param arr un array
     * @return el array invertido
     */
    public static int[] invertirArr(int[] arr) {
        int[] arrInvertido = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            arrInvertido[i] = arr[(arr.length-1)-i];
        }
        return arrInvertido;
    }
    public static void main(String[] args) {
        int[] arr = IO.crearArrayEnteros(10,20);
        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(invertirArr(arr)));
    }
}
