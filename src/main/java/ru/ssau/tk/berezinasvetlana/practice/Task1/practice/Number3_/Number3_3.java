package ru.ssau.tk.berezinasvetlana.practice.Task1.practice.Number3_;

public class Number3_3 {
    public static void main(String[] args) {
        String str = "Hello world";
        String str1 = new String(str);
        String str2 = "Hello world";
        if(str==str2){
            System.out.println("str==str2");
        }
        if (str == str1) {
            System.out.println("str==str1");
        }
        if (str.equals(str1)) {
            System.out.println("str.equals(str1)");
        }
    }
}
