package ru.ssau.tk.berezinasvetlana.practice.Task1.practice;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class Number2_2Test {

    @Test
    public void testNumber() {
        int[] array = new Number2_2().Number(1000);
        assertEquals(array.length, 1000);
        assertEquals(array[0], 2);
        assertEquals(array[6], 1);
        assertEquals(array[16], 1);
        assertEquals(array[62], 1);
        assertEquals(array[76], 1);
        assertEquals(array[96], 1);
        assertEquals(array[68], 1);
        assertEquals(array[666], 1);
        assertEquals(array[569], 1);
        assertEquals(array[996], 1);
        assertEquals(array[999], 2);
        assertNotEquals(array[111], 2);
        assertNotEquals(array[166], 2);
    }
}
