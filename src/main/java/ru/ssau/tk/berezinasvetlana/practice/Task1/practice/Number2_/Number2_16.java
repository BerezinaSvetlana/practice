package ru.ssau.tk.berezinasvetlana.practice.Task1.practice.Number2_;

public class Number2_16 {
    static boolean setFunction(Integer[] array) {
        for (int i : array) {
            if (array[i] == null) {
                return true;
            }
        }
        return false;
    }
}
