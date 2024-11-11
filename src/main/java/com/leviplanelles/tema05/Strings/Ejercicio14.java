package com.leviplanelles.tema05.Strings;

import com.leviplanelles.tema05.lib.IO;

import java.util.Scanner;

public class Ejercicio14 {
    /**
     * Método que imprime por pantalla una especie de contador raro
     * @param num el numero que se sustituira por la letra
     * @param letra la letra que va a sustituir al número
     */
    public static void contador(int num, char letra) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i <= 9; i++) {
            for (int j = 0; j <= 9; j++) {
                for (int k = 0; k <= 9; k++) {
                    for (int l = 0; l <= 9; l++) {

                        sb.append(i).append("-").append(j).append("-").append(k).append("-").append(l);
                        System.out.printf("%s\n", sb.toString().replace(String.valueOf(num),String.valueOf(letra)));
                        sb.setLength(0);
                    }
                }
            }
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numero = IO.solicitarInt("Ingresa un número:",0,100);
        System.out.println("Ingresa un carácter:");
        char c = scanner.next().charAt(0);
        contador(numero,c);
    }
}
