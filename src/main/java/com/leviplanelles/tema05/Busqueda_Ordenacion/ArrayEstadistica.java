package com.leviplanelles.tema05.Busqueda_Ordenacion;

public class ArrayEstadistica {
    private final int[] array;
    private int min;
    private int max;
    public ArrayEstadistica(int[] array) {
        this.array = array;
        min = array[0];
        max = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            } else if (array[i] < min) {
                min = array[i];
            }
        }
    }

    public int[] getArray() {
        return array;
    }

    public int getMax() {
        return max;
    }
    public int getMin() {
        return min;
    }
}
