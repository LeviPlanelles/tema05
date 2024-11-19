package com.leviplanelles.tema05.Arrays;

import com.leviplanelles.tema05.lib.IO;

import java.util.Scanner;

public class Ejercicio5 {
    /**
     * Método para crear un array de estaturas
     * @param veces la cantidad de elementos que tendra el array
     * @return el array completado con las estaturas
     */
    public static float[] guardarEstaturasPersonas(int veces) {
        Scanner scanner = new Scanner(System.in);
        float[] estaturas = new float[veces];
        for (int i = 0; i < veces; i++) {
            estaturas[i] = Integer.parseInt(scanner.nextLine());
        }
        return estaturas;
    }
    /**
     * Calcula la media de los valores de un array
     * @param estaturas un array de float
     * @return un float con la media de los valores
     */
    public static float mediaEstaturas(float[] estaturas) {
        float suma = 0;
        for (float altura : estaturas) {
            suma += altura;
        }
        return suma / estaturas.length;
    }
    /**
     * Muestra la informacion de que estatura supera la media
     * @param media la media
     * @param estaturas array de estaturas
     */
    public static void mostrarInformacion(float media,float[] estaturas) {
        for (int i = 0; i < estaturas.length; i++) {
            if (estaturas[i] >= media) {
                System.out.printf("La estatura '%.0f cm' supera la media que es %.2f\n", estaturas[i],media);
            }
        }
    }
    public static void main(String[] args) {
        int veces = IO.solicitarInt("Cuantás estaturas quieres introducir:",0,100);
        System.out.println("Introduce las estaturas (en cm) separadas por un 'Enter'");
        float[] estaturas = guardarEstaturasPersonas(veces);
        float mediaEstaturas = mediaEstaturas(estaturas);
        mostrarInformacion(mediaEstaturas,estaturas);
    }
}
