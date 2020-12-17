package ru.ssau.tk.berezinasvetlana.practice.Task1.practice.Number3_;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class Number3_11Test {

    @Test
    public void testNumberOfString() {
        String[] array = new String[]{"Understandble", "have", " a ", "nice ", " day"};
        assertEquals(Number3_11.NumberOfString(array, "h", "e"), 1);
        assertEquals(Number3_11.NumberOfString(array, "d", "y"), 1);
    }
}
