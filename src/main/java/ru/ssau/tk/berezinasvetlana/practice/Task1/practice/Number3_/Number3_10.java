package ru.ssau.tk.berezinasvetlana.practice.Task1.practice.Number3_;

public class Number3_10 {
    static int setString(String[] array, String prefix, String postfix) {
        int count = 0;
        for (String str : array) {
            if (str.startsWith(prefix) && str.endsWith(postfix)) {
                count++;
            }
        }
        return count;
    }
}
