package ru.ssau.tk.berezinasvetlana.practice.Task1.practice.Number3_;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class Number3_10Test {

    @Test
    public void testSetString() {
        String[] array = new String[]{"apple", "anna", "anastasia", "angel", "day"};
        assertEquals(Number3_10.setString(array, "a", "a"), 2);
        assertEquals(Number3_10.setString(array, "a", "e"), 1);
    }
}