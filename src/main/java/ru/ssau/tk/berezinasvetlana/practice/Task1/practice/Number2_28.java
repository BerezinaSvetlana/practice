package ru.ssau.tk.berezinasvetlana.practice.Task1.practice;

public class Number2_28 {
    static int[] longToInt(long number) {
        return new int[]{(int) (number >>> 32), (int) (number)};
    }

    static long intToLong(int[] number) {
        return ((long) number[0] << 32) | ((long) number[1] & 4294967295L);
    }
}