package com.leviplanelles.tema05.Matrices;

import com.leviplanelles.tema05.lib.IO;

public class Ejercicio2 {

    public static int[][] multiplicacion_Arrays(int[] arr1, int[] arr2) {
        int[][] matriz = new int[50][20];
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                matriz[i][j] = arr1[i] * arr2[j];
            }
        }
        return matriz;
    }
    public static void main(String[] args) {
        int[] arr50 = IO.crearArrayEnteros(50,1,10);
        int[] arr20 = IO.crearArrayEnteros(20,1,10);
        int[][] matriz = multiplicacion_Arrays(arr50,arr20);
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.printf("%d ",(matriz[i][j]));
            }
            System.out.println();
        }

    }
}
