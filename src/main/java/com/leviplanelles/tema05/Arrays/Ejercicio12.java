package com.leviplanelles.tema05.Arrays;

import com.leviplanelles.tema05.lib.IO;

import java.util.Arrays;

public class Ejercicio12 {
    /**
     * Método que con un array te crea otro pero el que te crea tiene la particularidad que cada elemento del nuevo es la suma de sus anteriores
     * @param arr un array
     * @return el array con la condicion mencionada anteriormente.
     */
    public static int[] crearArraySumatorio(int[] arr) {
        int[] P = new int[arr.length];
        for (int i = 0; i < P.length; i++) {
            P[i] = arr[i];
            for (int j = 0; j < i; j++) {
                P[i] += arr[j];
            }
        }
        return P;
    }
    public static void main(String[] args) {
        int[] V = IO.crearArrayEnteros(50,100);
        System.out.println("1. " + Arrays.toString(V));
        System.out.println("2. " + Arrays.toString(crearArraySumatorio(V)));

        
    }
}
