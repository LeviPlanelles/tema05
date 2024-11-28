package com.leviplanelles.tema05.Matrices;
import com.leviplanelles.tema05.lib.IO;
import java.util.Scanner;

public class Ejercicio1 {
    /**
     * Método que dependiendo de unos parametros te hace una matriz con el tamaño de esos paramaetros
     * @param filas número de filas
     * @param columnas número de columnas
     * @return te devuelve esa matriz rellenada con los inputs de la persona que ejecuta el código
     */
    public static float[][] crearMatriz(int filas, int columnas) {
        Scanner scanner = new Scanner(System.in);
        float[][] matriz = new float[filas][columnas];
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.printf("Introduce el valor para la Fila: %d Columna: %d\n",(i+1),(j+1));
                matriz[i][j] = Float.parseFloat(scanner.nextLine());
            }
        }
        return matriz;
    }
    public static void main(String[] args) {
        int filas = IO.solicitarInt("Ingresa el número de filas: ",0,100);
        int columnas = IO.solicitarInt("Ingresa el número de columnas: ",0,100);
        float[][] matriz = crearMatriz(filas,columnas);
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.printf("%.4f  ",matriz[i][j]);
            }
            System.out.println();
        }
    }
}
