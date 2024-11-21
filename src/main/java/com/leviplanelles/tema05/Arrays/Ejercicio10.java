package com.leviplanelles.tema05.Arrays;

import com.leviplanelles.tema05.lib.IO;

import java.util.Arrays;

public class Ejercicio10 {
    /**
     * Método que te crea un array de otro array con la condicion de que si el elemento es menor o igual a 10 pondra un -1
     * @param arr un array
     * @return el array con la condicion comentada anteriormente
     */
    public static int[] arrayDeOtro(int[] arr) {
        int[] array = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > 10) {
                array[i] = arr[i];
            } else if (arr[i] <= 10) {
                array[i] = -1;
            }
        }
        return array;
    }
    public static void main(String[] args) {
        int[] P = IO.crearArrayEnteros(10,30);
        IO.visualizarArrayEnteros(P);
        System.out.println(Arrays.toString(arrayDeOtro(P)));

    }
}
