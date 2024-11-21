package com.leviplanelles.tema05.Arrays;

import com.leviplanelles.tema05.lib.IO;

import java.util.Arrays;

public class Ejercicio13 {
    /**
     * Método que te crea un array pero con la particularidad que el nuevo, los elementos solo seran los que sean multiplos del numero indicado
     * @param numeros un array
     * @param multiplo el multiplo con el que se hará el array
     * @return un array con el mismo tamaño del anterior peor con la particularidad mencionada anteriormente
     */
    public static int[] arrayMultiplosDeNum(int[] numeros,int multiplo) {
        int[] multiplos5 = new int[numeros.length];
        int contador = 0;
        for (int numero : numeros) {
            if (numero % multiplo == 0) {
                multiplos5[contador] = numero;
                contador++;
            } else {
                multiplos5[contador] = 0;
                contador++;
            }
        }
        return multiplos5;
    }

    public static void main(String[] args) {
        int[] arr = IO.crearArrayEnteros(50,50);
        int[] arrPares = arrayMultiplosDeNum(arr,2);
        String arrString = Arrays.toString(arrPares).replaceAll(" 0"," N-Impar");
        System.out.println(arrString);


    }
}
