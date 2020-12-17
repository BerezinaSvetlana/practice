package ru.ssau.tk.berezinasvetlana.practice.Task1.practice.Number3_;

public class Number3_12 {
    static String Strings(String str_1, String str_2, String str_3) {
        for (int i = 0; i < 100 && str_1.contains(str_2); i++) {
            str_1 = str_1.replaceAll(str_2, str_3);
        }
        return str_1;
    }
}
