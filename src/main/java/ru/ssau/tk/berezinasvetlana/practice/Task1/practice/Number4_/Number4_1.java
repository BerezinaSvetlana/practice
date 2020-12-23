package ru.ssau.tk.berezinasvetlana.practice.Task1.practice.Number4_;

import ru.ssau.tk.berezinasvetlana.practice.Task1.Person.Person;

public class Number4_1 {
    public static String getObjectPerson(Person obj) {
        if (obj.getFirstName() == null || obj.getLastName() == null) {
            throw new NullPointerException();
        }
        return obj.toString();
    }
}
