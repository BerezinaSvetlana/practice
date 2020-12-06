package ru.ssau.tk.berezinasvetlana.practice.Task1.practice;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class Number2_6Test {

    @Test
    public void testNumber() {
        int[] array = Number2_6.Number(100);
        assertEquals(array.length,100);
        assertEquals(array[1],1);
        assertEquals(array[10],100);
        assertEquals(array[99],9801);
        assertEquals(array[76],5776);
        assertEquals(array[0],1);
        assertNotEquals(array[38],81);
        assertNotEquals(array[52],9);
        assertNotEquals(array[64],81);
    }
}