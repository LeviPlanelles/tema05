package com.leviplanelles.tema05.Busqueda_Ordenacion;

import com.leviplanelles.tema05.lib.IO;

import java.util.Arrays;

public class CountingSort {
    public static void countingSort(int[] array) {
        final int DISTANCIA_MAXIMA = 100_000;
        ArrayEstadistica arrayEstadistica = new ArrayEstadistica(array);
        int min = arrayEstadistica.getMin();
        int max = arrayEstadistica.getMax();
        if (max - min + 1 > DISTANCIA_MAXIMA) {
            System.err.println("Hay demasiada dispersión en los datos.");
            return;
        }
        int[] arrayConteo = new int[max+1];
        int contador = 0;
        for (int i = 0; i < array.length; i++) {
            arrayConteo[array[i]]++;
        }
        System.out.println("Conteo: " + Arrays.toString(arrayConteo));
        for (int i = 0; i < arrayConteo.length; i++) {
            for (int j = 0; j < arrayConteo[i]; j++) {
                array[contador++] = i;
            }
        }
        System.out.println("Ordenado: " + Arrays.toString(array));

    }
    public static void main(String[] args) {
        int[] arr = IO.crearArrayEnteros(10,1,10);
        IO.visualizarArrayEnteros(arr);
        countingSort(arr);
    }
}
