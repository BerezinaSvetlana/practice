package ru.ssau.tk.berezinasvetlana.practice.Task1.practice.Number3_;

public class Number3_4 {
    static boolean checkPalindrome(String str){
        return str.equals(new StringBuilder(str).reverse().toString());
    }
}
