package ru.ssau.tk.berezinasvetlana.practice.Task1;

import ru.ssau.tk.berezinasvetlana.practice.Task1.Person;

public class Main {

        public static void main(String[] args) {

            Person berezina = new Person("svetlana","berezina", 1);
            String berezinafirstName = berezina.getFirstName();
            String berezinalastName = berezina.getLastName();
            int berezinapassportId = berezina.getPassportId();

            System.out.println("FirstName: " + berezinafirstName);
            System.out.println("LastName: " + berezinalastName);
            System.out.println("PassportId: " + berezinapassportId);
        }
}

