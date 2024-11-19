package com.leviplanelles.tema05.Arrays;

import java.util.Arrays;
import java.util.Random;

public class Ejercicio6 {

    /**
     * Metodo para crear un array de enteros
     * @return ese mismo array rellenado con 10 notas al azar entre el 0 al 10
     */
    public static int[] crearArrayEnteros(int tamanio, int numMax) {
        Random random = new Random();
        int[] enteros = new int[tamanio];
        for (int i = 0; i < enteros.length; i++) {
            enteros[i] = random.nextInt(0, numMax + 1);
        }
        return enteros;
    }

    /**
     * Método para sumar dos arrays
     * @param arr1 un array
     * @param arr2 otro array
     * @return devuelve un array pero con los valores sumados
     */
    public static int[] sumaDeArrays(int[] arr1, int[] arr2) {
        int[] resArraySumas = new int[10];
        for (int i = 0; i < resArraySumas.length; i++) {
            resArraySumas[i] = arr1[i]  + arr2[i];
        }
        return resArraySumas;
    }
    /**
     * Método para dividir dos arrays
     * @param arr1 un array
     * @param arr2 otro array
     * @return devuelve un array pero con los valores divididos
     */
    public static float[] divisionDeArrays(int[] arr1, int[] arr2) {
        float[] resArrayDivision = new float[10];
        for (int i = 0; i < resArrayDivision.length; i++) {
            resArrayDivision[i] = (float) arr1[i]  / arr2[i];
        }
        return resArrayDivision;
    }
    public static void main(String[] args) {
        int[] arr1 = crearArrayEnteros(10, 11);
        int[] arr2 = crearArrayEnteros(10, 11);
        System.out.println(Arrays.toString(sumaDeArrays(arr1,arr2)));
        System.out.println(Arrays.toString(divisionDeArrays(arr1,arr2)));
    }
}
