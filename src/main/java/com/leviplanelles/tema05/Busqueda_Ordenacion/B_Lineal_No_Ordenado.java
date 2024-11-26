package com.leviplanelles.tema05.Busqueda_Ordenacion;

import com.leviplanelles.tema05.lib.IO;

import java.util.Arrays;

public class B_Lineal_No_Ordenado {

    public static String buscarEnteroArray(int[] arr, int n) {
        String res = "";
        if (arr == null) {
            return "No hay ningún elemento en el array";
        }else {
            for (int num : arr) {
                if (num == n) {
                    res = "El elemento " + n + " se ha encontrado en el array en la posición ";
                    break;
                }
                else {
                    res = "El elemento " + n + " no se ha encontrado en el array";
                }
            }
        }
        return res;

    }
    public static void main(String[] args) {
        int[] arrNoOrdenado = IO.crearArrayEnteros(10,0,20);
        System.out.println(Arrays.toString(arrNoOrdenado));
        System.out.println(buscarEnteroArray(arrNoOrdenado,3));

    }
}
