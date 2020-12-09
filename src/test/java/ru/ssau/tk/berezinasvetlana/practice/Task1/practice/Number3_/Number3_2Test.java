package ru.ssau.tk.berezinasvetlana.practice.Task1.practice.Number3_;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class Number3_2Test {

    @Test
    public void testGetStr() {
        String str_1 = "Svetlana";
        String str_2 = "Светалана";
        new Number3_2().getStr(str_1);
        new Number3_2().getStr(str_2);
    }
}
