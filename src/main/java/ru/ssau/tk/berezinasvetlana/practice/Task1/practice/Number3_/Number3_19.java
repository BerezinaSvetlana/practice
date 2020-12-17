package ru.ssau.tk.berezinasvetlana.practice.Task1.practice.Number3_;

import java.util.Arrays;

public class Number3_19 {
    static String[] parseStringOnArray(String str) {
        String[] arrayStr = str.split(" ");
        return Arrays.stream(arrayStr)
                .filter(s -> !s.isEmpty())
                .map(s -> s.replace(
                        String.valueOf(s.charAt(0)),
                        String.valueOf(s.charAt(0)).toUpperCase()
                ))
                .toArray(String[]::new);
    }
}
