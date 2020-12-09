package ru.ssau.tk.berezinasvetlana.practice.Task1.practice.Number3_;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class Number3_1Test {

    @Test
    public void testSetString() {
        String arrayStr = new String("str1, str2");
        String arrayStr_1 = new String("svetlana, berezina");
        String arrayStr_2 = new String("jjjjjjj, skdjfbs");
        new Number3_1().setString(arrayStr);
        new Number3_1().setString(arrayStr_1);
        new Number3_1().setString(arrayStr_2);
    }
}