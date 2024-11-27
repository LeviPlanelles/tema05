package com.leviplanelles.tema05.Busqueda_Ordenacion;

import com.leviplanelles.tema05.lib.IO;

import java.util.Arrays;

public class Seleccion {

    public static void seleccionSort(int[] array) {
        for (int i = 0; i < array.length; i++) {
            int min = array[i];
            int posicion = i;
            for (int j = i+1; j < array.length; j++) {
                if (array[j] < min) {
                    min = array[j];
                    posicion = j;
                }
            }
            if (min < array[i]) {
                BubbleSort.intercambio(array,i,posicion);
            }
        }
        System.out.println(Arrays.toString(array));
    }
    public static void main(String[] args) {
        int[] arr = IO.crearArrayEnteros(10,1,10);
        IO.visualizarArrayEnteros(arr);
        seleccionSort(arr);
    }
}
