package ru.ssau.tk.berezinasvetlana.practice.Task1.practice;

import org.testng.annotations.Test;
import ru.ssau.tk.berezinasvetlana.practice.Task1.practice.Number2_.Number2_21;

import static org.testng.Assert.*;

public class Number2_21Test {

    @Test
    public void testGetNumber() {
        int[] array = new int[]{1,2,3,3,2,1,3};
        assertEquals(Number2_21.getNumber(array),3);
        int[] temp = new int[]{1,1,1,1,0,0,0,-1};
        assertEquals(Number2_21.getNumber(temp),1);
    }
}