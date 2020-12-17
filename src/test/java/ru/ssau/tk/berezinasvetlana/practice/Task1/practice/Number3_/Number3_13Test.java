package ru.ssau.tk.berezinasvetlana.practice.Task1.practice.Number3_;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class Number3_13Test {

    @Test
    public void testGetStringOfIndex() {
        String str = "Understandable have a nice day";
        int maxSizeStr = str.length();
        assertEquals(Number3_13.getStringOfIndex(str, -2, maxSizeStr), str);
        assertEquals(Number3_13.getStringOfIndex(str, 2, maxSizeStr), str.substring(2));
        assertEquals(Number3_13.getStringOfIndex(str, -2, 14), str.substring(0, 14));
        assertEquals(Number3_13.getStringOfIndex(str, 2, 14), str.substring(2, 14));
    }
}