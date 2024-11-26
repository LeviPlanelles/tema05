package com.leviplanelles.tema05.Busqueda_Ordenacion;

import com.leviplanelles.tema05.lib.IO;

import java.util.Arrays;

public class Ejercicio1 {

    public static int[] ordenarArray(int[] array) {
        int guardar;
        int contador = array.length-1;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < contador; j++) {
                if (array[j] > array[j+1]) {
                    guardar = array[j];
                    array[j] = array[j+1];
                    array[j+1] = guardar;
                    //contador--;
                }
            }
        }

        return array;
    }
    public static void main(String[] args) {
        int[] arrDesordenado = IO.crearArrayEnteros(10,-10, 10);
        System.out.println(Arrays.toString(arrDesordenado));
        System.out.println(Arrays.toString(ordenarArray(arrDesordenado)));


    }
}
