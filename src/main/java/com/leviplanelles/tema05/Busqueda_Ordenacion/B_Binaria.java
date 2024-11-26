package com.leviplanelles.tema05.Busqueda_Ordenacion;

public class B_Binaria {

    public static int busquedaBinaria(int[] arr, int entero) {
        int ini = 0;
        int fin = arr.length - 1;
        int medio;
        while (ini <= fin){
            medio = (fin + ini) / 2;
            if (arr[medio] == entero) {
                return medio;
            } else if (arr[medio] > entero) {
                fin = medio - 1;
            } else {
                ini = medio + 1;
            }

        }
        return -1;
    }
    public static void main(String[] args) {
        int[] arrOrdenado = {12,22,23,43,55,86,99,111,203,465,488,700,1002};
        String res = busquedaBinaria(arrOrdenado,55) == -1 ? "El número 55 no está en el array" : "El número 55 está en el array y en la posición " + busquedaBinaria(arrOrdenado,55);
        System.out.println(res);


    }
}
