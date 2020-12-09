package ru.ssau.tk.berezinasvetlana.practice.Task1.practice.Number3_;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class Number3_9Test {

    @Test
    public void testGetIndexOf() {
        assertEquals(Number3_9.getIndexOf("abcabcabc", "ca"), 2);
        assertEquals(Number3_9.getIndexOf("oop", "p"), -1);
        assertEquals(Number3_9.getIndexOf("Abracadabra", "da"), -1);
        assertEquals(Number3_9.getIndexOf("berezina", "svetlana"), -1);
    }
}