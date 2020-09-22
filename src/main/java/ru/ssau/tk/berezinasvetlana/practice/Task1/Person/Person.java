package ru.ssau.tk.berezinasvetlana.practice.Task1.Person;

public class Person {

    private String firstName;
    private String lastName;
    private int passportId;

    public Person(String firstName, String lastName, int passportId) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.passportId = passportId;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getPassportId() {
            return passportId;
    }

    public void setPassportId(int passportId) {
        if (passportId >= 0) {
            this.passportId = passportId;
        }
        else {
            System.out.println("Ошибка! PassportId не может быть отрицательным числом!");
        }
    }

}

