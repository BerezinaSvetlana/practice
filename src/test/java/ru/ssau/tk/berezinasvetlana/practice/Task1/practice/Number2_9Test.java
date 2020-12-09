package ru.ssau.tk.berezinasvetlana.practice.Task1.practice;

import org.testng.annotations.Test;
import ru.ssau.tk.berezinasvetlana.practice.Task1.practice.Number2_.Number2_9;

import static org.testng.Assert.*;

public class Number2_9Test {

    @Test
    public void testFunction() {
        double DELTA = 0.00001;
        int[] array = Number2_9.function(1, 2, 100);
        assertEquals(array.length, 100);
        assertEquals(array[0], 1, DELTA);
        assertEquals(array[1], 3, DELTA);
        assertEquals(array[2], 5, DELTA);
        assertEquals(array[3], 7, DELTA);
        assertEquals(array[4], 9, DELTA);
        assertEquals(array[5], 11, DELTA);
        assertEquals(array[6], 13, DELTA);
        assertEquals(array[7], 15, DELTA);
        assertEquals(array[8], 17, DELTA);
        assertEquals(array[9], 19, DELTA);
        assertEquals(array[10], 21, DELTA);
        assertEquals(array[11], 23, DELTA);
    }
}