package com.leviplanelles.tema05.Arrays;

import java.util.Random;

public class Ejercicio4 {
    /**
     * Metodo para crear un array de notas
     * @return ese mismo array rellenado con 30 notas al azar entre el 0 al 10
     */
    public static double[] crearArrayNotas() {
        Random random = new Random();
        double[] notas = new double[30];
        for (int i = 0; i < notas.length; i++) {
            notas[i] = random.nextDouble(0,11);
        }
        return notas;
    }

    /**
     * Método para calcular la media de las notas
     * @param notas un array de notas
     * @return la media de las notas
     */
    public static double mediaTotal(double[] notas) {
        double suma = 0;
        for (double nota : notas) {
            suma += nota;
        }
        return suma / notas.length;
    }

    /**
     * Método para calcular la media de las notas mayores o iguales a 5
     * @param notas un array de notas
     * @return la media de las notas mayores o iguales a 5
     */
    public static double mediaNotasMayores5(double[] notas) {
        double suma = 0;
        int contador = 0;
        for (double nota : notas) {
            if (nota >= 5) {
                suma += nota;
                contador++;
            }
        }
        return suma / contador;
    }
    public static void main(String[] args) {
        double[] notas = crearArrayNotas();
        System.out.printf("La nota media de todas las notas es de: %.2f\n",mediaTotal(notas));
        System.out.printf("La nota media de las notas mayores a 5 es de: %.2f",mediaNotasMayores5(notas));
    }
}
