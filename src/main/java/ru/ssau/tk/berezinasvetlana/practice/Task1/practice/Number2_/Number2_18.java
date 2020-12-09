package ru.ssau.tk.berezinasvetlana.practice.Task1.practice.Number2_;

public class Number2_18 {
    static Integer Maxvalue(int[] array) {
        if (array.length == 0) {
            return null;
        }
        int temp = 0;
        for (int i : array) {
            if (array[i + 1] > array[i]) {
                temp = array[i + 1];
            }
        }
        return temp;
    }
}
