package ru.ssau.tk.berezinasvetlana.practice.Task1.practice;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class Number2_5Test {

    @Test
    public void testNumber() {
        int[] arr = Number2_5.Number(10);
        assertEquals(arr[0],0);
        assertEquals(arr[1],1);
        assertEquals(arr[2],1);
        assertEquals(arr[3],2);
        assertEquals(arr[4],3);
        assertEquals(arr[5],5);
        assertEquals(arr[6],8);
        assertEquals(arr[7],13);
        assertEquals(arr[8],21);
        assertEquals(arr[9],34);
        assertNotEquals(arr[7],1);
        assertNotEquals(arr[8],2);
        assertNotEquals(arr[9],3);
    }
}