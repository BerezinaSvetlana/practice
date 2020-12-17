package ru.ssau.tk.berezinasvetlana.practice.Task1.practice.Number3_;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class Number3_19Test {

    @Test
    public void testParseStringOnArray() {
        String str = "Никогда не делает ошибок только тот, кто не пробует ничего нового";
        String str_1 = "Неудача – это просто возможность начать снова, но уже более мудро";
        String[] arrayStr = Number3_19.parseStringOnArray(str);
        String[] arrayStr_1 = Number3_19.parseStringOnArray(str_1);
        for (String string : arrayStr) {
            System.out.println(string);
        }
        for (String string : arrayStr_1) {
            System.out.println(string);
        }
    }
}