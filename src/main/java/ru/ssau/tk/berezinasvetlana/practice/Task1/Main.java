package ru.ssau.tk.berezinasvetlana.practice.Task1;

import ru.ssau.tk.berezinasvetlana.practice.Task1.Person;

public class Main {

        public static void main(String[] args) {

            Person berezina = new Person("svetlana","berezina", -1);
            String berezinafirstName = berezina.getFirstName();
            String berezinalastName = berezina.getLastName();
            berezina.setPassportId(-1);
            int berezinapassportId = berezina.getPassportId();


            Person abrosimova = new Person("Margo","Abrosimova", 3);
            String abrosimovafirstName = abrosimova.getFirstName();
            String abrosimovalastName = abrosimova.getLastName();
            int abrosimovapassportId = abrosimova.getPassportId();

            System.out.println("FirstName: " + berezinafirstName);
            System.out.println("LastName: " + berezinalastName);
            System.out.println("PassportId: " + berezinapassportId);
            System.out.println("FirstName: " + abrosimovafirstName);
            System.out.println("LastName: " + abrosimovalastName);
            System.out.println("PassportId: " + abrosimovapassportId);
        }
}

