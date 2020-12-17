package ru.ssau.tk.berezinasvetlana.practice.Task1.practice.Number3_;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class Number3_20Test {

    @Test
    public void testGetStr() {
        String[] str = {"Прекрасный", "день", "чтобы", "сдать", "долги"};
        assertEquals(Number3_20.getStr(str), "Прекрасный, день, чтобы, сдать, долги");
        String[] str_1 = {"Замечательный", "день", "чтобы", "сдать", "долги"};
        assertNotEquals(Number3_20.getStr(str_1), "Прекрасный, день, чтобы, сдать, долги");
    }
}