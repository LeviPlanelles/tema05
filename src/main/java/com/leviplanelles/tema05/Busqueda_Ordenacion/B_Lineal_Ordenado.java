package com.leviplanelles.tema05.Busqueda_Ordenacion;

import java.util.Arrays;

public class B_Lineal_Ordenado {

    public static String buscarEnteroEnArrayOrdenado(int[] arr, int entero) {
        String res = "";
        int contador = 0;
        if (arr == null) {
            return "No hay ningún elemento en el array";
        }else {
            do {
                if (arr[contador] == entero) {
                    res = "Se ha encontrado el número " +entero+ " en la posición " + arr[contador] + " del array " + Arrays.toString(arr);
                    break;
                }else {
                    res = "El número " + entero + " no está en el array " + Arrays.toString(arr);
                }
                contador++;
            }while (arr[contador] <= entero);

        }
        return res;
    }
    public static void main(String[] args) {
        int[] arrOrdenado = {12,22,23,43,55,86,99,111,203,465,488};
        System.out.println(buscarEnteroEnArrayOrdenado(arrOrdenado,53));
    }
}
