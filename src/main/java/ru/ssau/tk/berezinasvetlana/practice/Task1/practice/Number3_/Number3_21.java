package ru.ssau.tk.berezinasvetlana.practice.Task1.practice.Number3_;

public class Number3_21 {
    public static void main(String[] args) {
        String str = "svetlana";
        /* 0v2t4a6a
           a6a4t2v0
        */
        StringBuilder strBldr = new StringBuilder(str);
        for (int i = 0; i < str.length(); i++) {
            if (i % 2 == 0) {
                strBldr.replace(i, i + 1, i + "");
            }
        }
        strBldr.reverse();
        System.out.println(strBldr.toString());
    }
}
