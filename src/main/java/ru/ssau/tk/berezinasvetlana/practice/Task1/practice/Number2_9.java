package ru.ssau.tk.berezinasvetlana.practice.Task1.practice;

public class Number2_9 {
    public static int[] function(int first, int delta, int size) {
        int[] array = new int[size];
        array[0] = first;
        for (int i = 1; i < array.length; i++) {
            array[i] = array[i - 1] + delta;
        }
        return array;
    }
}
