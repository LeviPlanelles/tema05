/*package com.leviplanelles.tema05.Matrices;

import com.leviplanelles.tema05.lib.IO;

public class Ejercicio3 {

    public enum Ficha {
        O, X,
    }
    public enum Jugador {
        PLAYER1, PLAYER2
    }
    public static Ficha[][] crearTablero() {
        Ficha[][] tablero = new Ficha[3][3];
        for (int i = 0; i < tablero.length; i++) {
            for (int j = 0; j < tablero[i].length; j++) {
                tablero[i][j] = null;
            }
        }
        return tablero;
    }
    public static String tableroToString(Ficha[][] tablero) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < tablero.length; i++) {
            for (int j = 0; j < tablero[i].length; j++) {
                sb.append(tablero[i][j]).append(" ");
            }
            sb.append("\n");
        }
        return sb.toString();
    }
    public static void reset() {
        crearTablero();
        Jugador turnoActual = Jugador.PLAYER1;
    }
    public static Jugador cambiarTurno(Jugador jugador) {
        if (jugador.equals(Jugador.PLAYER1)) {
            jugador = Jugador.PLAYER2;
        }else {
            jugador = Jugador.PLAYER1;
        }
        return jugador;
    }

    public static boolean play(int[][]arr) {
        int fila = IO.solicitarInt("Introduce la fila:",0,3);
        int columna = IO.solicitarInt("Introduce la columna:",0,3);
        return esJugadaValida(fila,columna,arr);
    }
    public static boolean esJugadaValida(int fila, int columna, int[][] arr) {
        if (arr[fila][columna] ) {

        }
        return true;
    }
    public static boolean esJugadaGanadora() {

    }
    public static void main(String[] args) {
        Ficha[][] tablero = crearTablero();
        System.out.println(tableroToString(tablero));
        System.out.println("*****************************");
        System.out.println("** BIENVENIDO AL 3 EN RAYA **");
        System.out.println("*****************************");
        do {
            reset();
            do {
                play();

            }while (!esJugadaGanadora());
        }while ();


    }
}*/
