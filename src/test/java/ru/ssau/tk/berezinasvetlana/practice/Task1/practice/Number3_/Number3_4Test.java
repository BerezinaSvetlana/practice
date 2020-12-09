package ru.ssau.tk.berezinasvetlana.practice.Task1.practice.Number3_;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class Number3_4Test {

    @Test
    public void testCheckPalindrome() {
        assertEquals(Number3_4.checkPalindrome("salas"),true);
        assertEquals(Number3_4.checkPalindrome("vlad"),false);
        assertEquals(Number3_4.checkPalindrome("iiiii"),true);
        assertEquals(Number3_4.checkPalindrome("anna"),true);
        assertEquals(Number3_4.checkPalindrome("sveta"),false);
        assertEquals(Number3_4.checkPalindrome("abcba"),true);
    }
}