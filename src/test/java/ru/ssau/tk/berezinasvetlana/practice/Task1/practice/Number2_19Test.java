package ru.ssau.tk.berezinasvetlana.practice.Task1.practice;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class Number2_19Test {

    @Test
    public void testSetArrayEven() {
        int[] array = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 20};
        int[] array_1 = new int[]{100, 500, 2, 2, 8, 1000, 19, 7, 20};
        assertEquals(Number2_19.setArrayEven(array), 25);
        assertEquals(Number2_19.setArrayEven(array_1), 149);
    }
}