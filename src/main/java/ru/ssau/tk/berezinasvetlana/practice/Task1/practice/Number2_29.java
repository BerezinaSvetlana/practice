package ru.ssau.tk.berezinasvetlana.practice.Task1.practice;

public class Number2_29 {
    static int[] getArray(int size, int index) {
        if (index >= size) {
            return null;
        } else {
            int[] result = new int[size];
            for (int i = 0; i < size; i++) {
                result[i + index - (i + index >= size ? size : 0)] = i + 1;
            }
            return result;
        }
    }
}
