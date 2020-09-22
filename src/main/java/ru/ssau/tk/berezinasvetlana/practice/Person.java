package ru.ssau.tk.berezinasvetlana.practice;

public class Person {

    private String firstName;
    private String lastName;
    private int passportId;

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
        this.passportId = passportId;
    }
}

public class Main {

    public static void main(String[] args) {

        Person berezina = new Person("Светлана", "Березина", 3614111111);
        String berezinafirstName = berezina.getFirstName();
        String berezinalastName = berezina.getLastName();
        int berezinapassportId = berezina.getPassportId();

        System.out.println("FirstName: " + berezinafirstName);
        System.out.println("LastName: " + berezinalastName);
        System.out.println("PassportId: " + berezinapassportId);
    }
}
