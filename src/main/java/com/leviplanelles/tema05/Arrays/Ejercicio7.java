package com.leviplanelles.tema05.Arrays;
import java.util.Arrays;

import static com.leviplanelles.tema05.Arrays.Ejercicio6.crearArrayEnteros;
public class Ejercicio7 {
    public static int multiplosDeNum(int[] numeros,int multiplo) {
        int contador = 0;
        for (int numero : numeros) {
            if (numero % multiplo == 0) {
                contador++;
            }
        }
        return contador;
    }
    public static int[] arrayMultiplosDeNum(int[] numeros,int multiplo) {
        int tamanio = multiplosDeNum(numeros,multiplo);
        if (tamanio == 0) {
            return null;
        }
        int[] multiplos5 = new int[tamanio];
        int contador = 0;
        for (int numero : numeros) {
            if (numero % multiplo == 0) {
                multiplos5[contador] = numero;
                contador++;
            }
        }
        return multiplos5;
    }
    public static String esCero(int[] numeros) {
        StringBuilder sb = new StringBuilder();
        for (int num : numeros) {
            if (num == 0) {
                sb.append(num).append(" ");
            }
        }
        return sb.toString();
    }


    public static void main(String[] args) {
        int[] numerosAleatorios = crearArrayEnteros(100, 100);
        int[] multiplos5 = arrayMultiplosDeNum(numerosAleatorios,5);
        int[] multiplos10 = arrayMultiplosDeNum(numerosAleatorios,10);
        String ceros = esCero(numerosAleatorios);
        System.out.println("Multiplos de 5: " + Arrays.toString(multiplos5));
        System.out.println("Son ceros: " + ceros);
        System.out.println("Multiplos de 10: " + Arrays.toString(multiplos10));
    }
}
