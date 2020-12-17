package ru.ssau.tk.berezinasvetlana.practice.Task1.practice.Number3_;

public class Number3_11 {
    static int NumberOfString(String[] array, String prefix, String postfix) {
        int number = 0;
        for (int i = 0; i < array.length; i++) {
            array[i] = array[i].trim();
        }
        for (String str : array) {
            if (str.startsWith(prefix) && str.endsWith(postfix)) {
                number++;
            }
        }
        return number;
    }
}
