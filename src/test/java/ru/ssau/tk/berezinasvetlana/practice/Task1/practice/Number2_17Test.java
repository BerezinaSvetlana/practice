package ru.ssau.tk.berezinasvetlana.practice.Task1.practice;

import org.testng.annotations.Test;
import ru.ssau.tk.berezinasvetlana.practice.Task1.practice.Number2_.Number2_17;

import static org.testng.Assert.*;

public class Number2_17Test {

    @Test
    public void testQuantity() {
        int[] array = new int[10];
        for (int i = 0; i < array.length; i++) {
            array[i] = i;
        }
        assertEquals(Number2_17.Quantity(array), 5);
    }
}