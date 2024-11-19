package com.leviplanelles.tema05.Arrays;

import com.leviplanelles.tema05.lib.IO;

import java.util.Arrays;

public class Ejercicio8 {
    /**
     * Método para comprobar si un numero esta dentro de un array
     * @param array un array
     * @param numero un numero
     * @return devuelve true o false dependiendo si el numero está o no dentro del array
     */
    public static boolean comprobarNumeroEnArray(int[] array, int numero) {
        boolean coincidencia = false;
        for (int num : array) {
            if (num == numero){
                coincidencia = true;
                break;
            }
        }
        return coincidencia;
    }
    public static void main(String[] args) {
        int[] enteros = IO.crearArrayEnteros(10,10);
        int num = IO.solicitarInt("Comprueba si un número esta en el array: ",0,100);
        String res = comprobarNumeroEnArray(enteros,num) ? "El número " + num + " si esta en el array " + Arrays.toString(enteros) : "El número " + num + " no está en el array";
        System.out.println(res);
    }
}
