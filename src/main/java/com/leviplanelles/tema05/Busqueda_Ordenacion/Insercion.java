package com.leviplanelles.tema05.Busqueda_Ordenacion;

import com.leviplanelles.tema05.lib.IO;

import java.util.Arrays;

public class Insercion {

    public static void insercionSort(int[] array) {
        int aux;
        boolean hayCambios = false;
        for (int i = 1; i < array.length; i++) {
            int j;
            aux = array[i];
            for (j = i - 1; j >= 0; j--) {
                if (array[j] < aux) {
                    break;
                } else if (array[j] > aux) {
                    array[j+1] = array[j];
                    hayCambios = true;

                }
            }
            if (hayCambios){
                array[j+1] = aux;
            }

        }
        System.out.println(Arrays.toString(array));
    }
    public static void main(String[] args) {
        int[] arr = IO.crearArrayEnteros(10,1,10);
        IO.visualizarArrayEnteros(arr);
        insercionSort(arr);

    }
}
