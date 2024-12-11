package com.leviplanelles.tema05.Matrices;

import com.leviplanelles.tema05.lib.IO;

public class Ejercicio4 {

    public static void matrizPorFilas(int[][] matriz) {
        System.out.println("Matriz por filas:");
        for (int[] fila : matriz) {
            for (int numero : fila) {
                System.out.printf("%-3d",numero);
            }
            System.out.println();
        }
        System.out.println("---------------------------");
    }
    public static int[][] matrizTraspuesta(int[][] matriz) {
        if (matriz == null) {
            return null;
        }
        int[][] matrizTraspuesta = new int[matriz[0].length][matriz.length];
        for (int i = 0; i < matrizTraspuesta.length; i++) {
            for (int j = 0; j < matrizTraspuesta[i].length; j++) {
                matrizTraspuesta[i][j] = matriz[j][i];
            }

        }
        return matrizTraspuesta;
    }
    public static void matrizPorFilasConSuma(int[][] matriz) {
        System.out.println("Matriz por filas con suma al final:");
        int suma;
        for (int i = 0; i < matriz.length; i++) {
            suma = 0;
            for (int j = 0; j < matriz[i].length; j++) {
                suma += matriz[i][j];
                System.out.printf("%-3d",matriz[i][j]);
            }
            System.out.print("= " + suma);
            System.out.println();
        }
        System.out.println("---------------------------");
    }
    public static void valoresMaximoMinimo(int[][] matriz) {
        int valorMinimo = matriz[0][0];
        int valorMaximo = matriz[0][0];
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                if (valorMinimo > matriz[i][j]) {
                    valorMinimo = matriz[i][j];
                }
                if (valorMaximo < matriz[i][j]) {
                    valorMaximo = matriz[i][j];
                }
            }
        }
        System.out.println("Valores mínimo y máximo de la matriz:");
        System.out.println("Mínimo: " + valorMinimo);
        System.out.println("Máximo: " + valorMaximo);
        System.out.println("---------------------------");

    }
    public static double mediaMatriz(int[][] matriz) {
        int contador = 0;
        int total = 0;
        for (int[] fila : matriz) {
            for (int numero : fila) {
                contador++;
                total += numero;
            }
        }
        return total / (double)contador;
    }
    public static void columnaOchoValorAnteriores(int[][] matriz) {
        System.out.println("En la columna 8 el valor de todas los anteriores:");
        int suma;
        for (int i = 0; i < matriz.length; i++) {
            suma = 0;
            for (int j = 0; j < matriz[i].length-1; j++) {
                suma += matriz[i][j];
                System.out.printf("%-3d",matriz[i][j]);
            }
            System.out.printf("%d\n",suma);
        }
        System.out.println("---------------------------");
    }
    public static void main(String[] args) {
        int [][] matriz = IO.crearMatrizAleatoria(4,8,1,10);
        matrizPorFilas(matriz);
        int[][] matrizTraspuesta = matrizTraspuesta(matriz);
        System.out.println("Matriz por columnas (traspuesta):");
        for (int[] fila : matrizTraspuesta) {
            for (int numero : fila) {
                System.out.printf("%-3d",numero);
            }
            System.out.println();
        }
        System.out.println("---------------------------");
        matrizPorFilasConSuma(matriz);
        valoresMaximoMinimo(matriz);
        double media = mediaMatriz(matriz);
        System.out.println("Media de la matriz:");
        System.out.println("La media de los valores de la matriz es: "+media);
        System.out.println("---------------------------");
        System.out.println("El valor en la fila, columna que diga el usuario:");
        int fila = IO.solicitarInt("Dime la fila:",0,matriz.length);
        int columna = IO.solicitarInt("Dime la columna:",0,matriz[0].length);
        System.out.println("El valor es: " + matriz[fila][columna]);
        System.out.println("---------------------------");
        System.out.println("La fila que diga el usuario:");
        int filaEntera = IO.solicitarInt("Dime la fila:",0,matriz.length);
        System.out.print("Fila: ");
        for (int i = 0; i < matriz[filaEntera].length; i++) {
            System.out.printf("%-3d",matriz[filaEntera][i]);
        }
        System.out.println();
        System.out.println("---------------------------");
        System.out.println("La columna que diga el usuario:");
        int columnaEntera = IO.solicitarInt("Dime la columna:",0,matriz[0].length);
        System.out.println("Columna: ");
        for (int i = 0; i < matriz.length; i++) {
            System.out.println(matriz[i][columnaEntera]);
        }
        System.out.println("---------------------------");
        columnaOchoValorAnteriores(matriz);




    }
}
