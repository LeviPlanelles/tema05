package com.leviplanelles.tema05.Arrays;

public class Ejercicio1 {
    /**
     * Método que te imprime un array ya preestablecido en el método y te calcula su media
     */
    public static void valoresArray() {
        int total = 0;
        int[] numeros = {1,2,3,4,5,6,7,8,9,10};
        for (int numero : numeros) {
            System.out.println(numero);
            total += numero;
        }
        int media = total / numeros.length;
        System.out.println("La media de todos esos números es: " + media);
    }
    public static void main(String[] args) {
        valoresArray();
    }
}
