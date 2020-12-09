package ru.ssau.tk.berezinasvetlana.practice.Task1.practice.Number3_;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class Number3_5Test {

    @Test
    public void testDifferentStr() {
        String str_1 = "HELLO WORLD";
        String str_2 = "hello world";
        String str_3 = "NO";
        assertTrue(Number3_5.differentStr(str_1, str_2));
        assertFalse(Number3_5.differentStr(str_2, str_2));
        assertFalse(Number3_5.differentStr(str_2, str_3));
        assertFalse(Number3_5.differentStr(null, str_2));
        assertFalse(Number3_5.differentStr(str_1, null));
        assertFalse(Number3_5.differentStr(null, null));
        assertEquals(Number3_5.differentStr(str_1, str_2), true);
        assertEquals(Number3_5.differentStr(str_2, str_3), false);
    }
}
