package com.leviplanelles.tema05.Busqueda_Ordenacion;

import com.leviplanelles.tema05.lib.IO;

import java.util.Arrays;

public class BubbleSort {
    public static void intercambio(int[] arr, int posicionOrgien, int posicionDestino) {
        int aux = arr[posicionOrgien];
        arr[posicionOrgien] = arr[posicionDestino];
        arr[posicionDestino] = aux;
    }
    public static int[] bubbleSort(int[] array) {
        int guardar;
        boolean hayCambios;
        for (int i = 0; i < array.length; i++) {
            hayCambios = false;
            for (int j = 0; j < array.length - 1; j++) {
                if (array[j] > array[j+1]) {
                    intercambio(array,j,j+1);
                    hayCambios = true;
                }
                if (!hayCambios) {
                    return array;
                }
            }
        }
        return array;
    }
    public static void main(String[] args) {
        int[] arrDesordenado = IO.crearArrayEnteros(10,-10, 10);
        System.out.println(Arrays.toString(arrDesordenado));
        System.out.println(Arrays.toString(bubbleSort(arrDesordenado)));


    }
}
