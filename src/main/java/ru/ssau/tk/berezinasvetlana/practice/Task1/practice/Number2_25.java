package ru.ssau.tk.berezinasvetlana.practice.Task1.practice;

public class Number2_25 {
    static int[] setArray(int[] _1array) {
        int[] _2array = new int[_1array.length];
        for (int i = 0; i < _2array.length; i++) {
            _2array[i] = _1array[i];
        }
        for (int i = 0; i < _2array.length; i++) {
            _2array[i] = ~_2array[i];
        }
        return _2array;
    }
}
