package ru.ssau.tk.berezinasvetlana.practice.Task1.practice;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class Number2_16Test {

    @Test
    public void testSetFunction() {
        Integer[] array = new Integer[2];
        array[1] = null;
        array[0] = 1;
        assertTrue(Number2_16.setFunction(array));
    }
}