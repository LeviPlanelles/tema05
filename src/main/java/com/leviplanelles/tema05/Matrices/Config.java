package com.leviplanelles.tema05.Matrices;

public class Config {
    // Constantes de configurarión general
    public static final int FILAS = 8;
    public static final int COLUMNAS = FILAS * 4;
    public static final int USOS_PICO = 3;
    public static final int CANTIDAD_OBSTACULOS = FILAS - 1;
    public static final int CANTIDAD_NPC = Math.max(4,(FILAS * COLUMNAS) / 30);
    public static final int CANTIDAD_HABILIDADES = CANTIDAD_NPC;

    // Constantes para Sprites

    public static final String SPRITE_JUGADOR = "ß";
    public static final String SPRITE_OBSTACULO = "▓";
    public static final String SPRITE_NPC = "N";
    public static final String SPRITE_TESORO = "¤";
    public static final String SPRITE_VACIA = " ";
    public static final String SPRITE_EXCAVADA = "░";
    public static final String SPRITE_HABILIDAD = "↑";



}
