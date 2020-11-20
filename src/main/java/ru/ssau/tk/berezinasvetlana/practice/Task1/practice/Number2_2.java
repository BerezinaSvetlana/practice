package ru.ssau.tk.berezinasvetlana.practice.Task1.practice;

public class Number2_2 {
    public int[] Number(int size) {
        int[] array = new int[size];
        array[0] = 2;
        array[size - 1] = 2;
        for (int i = 1; i < array.length - 1; i++) {
            array[i] = 1;
        }
        return array;
    }
}
