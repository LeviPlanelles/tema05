package com.leviplanelles.tema05.Arrays;

import com.leviplanelles.tema05.lib.IO;

import java.util.Arrays;

public class Ejercicio9 {
    private static boolean rellenado = false;
    public static void crearArray(int[] array) {
        if (!rellenado) {
            System.out.println("¡Array rellenado!");
            rellenado = true;
        }else {
            System.out.println("El array ya esta rellendado, cierra el programa y ábrelo de nuevo para crear un nuevo array.");
        }
    }
    public static void visualizarArray(int[] array) {
        System.out.println(Arrays.toString(array));
    }
    public static void visualizarPares(int[] array) {
        int[] arrPares = Ejercicio7.arrayMultiplosDeNum(array,2);
        System.out.println(Arrays.toString(arrPares));
    }
    public static void visualizarMultiplos3(int[] array) {
        int[] arr = Ejercicio7.arrayMultiplosDeNum(array,3);
        System.out.println(Arrays.toString(arr));
    }
    public static int menuPrincipal() {
        System.out.println("MENÚ PRINCIPAL");
        System.out.println("==============");
        System.out.println("1.- Rellenar array");
        System.out.println("2.- Visualizar contenido del array");
        System.out.println("3.- Visualizar contenido par");
        System.out.println("4.- Visualizar contenido múltiplo de 3");
        System.out.println("0.- Salir del menú");
        System.out.println("Selecciona una opcion");
        return IO.solicitarInt("",0,4);

    }
    public static void main(String[] args) {
        int [] arr = IO.crearArrayEnteros(10,50);
        int choice;
        do {
            choice = menuPrincipal();
            switch (choice) {
                case 1 -> crearArray(arr);
                case 2 -> {
                    if (!rellenado) {
                        System.err.println("¡Error, array no rellenado!");
                    } else {
                        visualizarArray(arr);
                    }
                }
                case 3 -> {
                    if (!rellenado) {
                        System.err.println("¡Error, array no rellenado!");
                    } else {
                        visualizarPares(arr);
                    }
                }
                case 4 -> {
                    if (!rellenado) {
                        System.err.println("¡Error, array no rellenado!");
                    } else {
                        visualizarMultiplos3(arr);
                    }
                }
            }

        }while (choice != 0);
    }
}
