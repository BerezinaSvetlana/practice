package ru.ssau.tk.berezinasvetlana.practice.Task1.Person;

public class Person {
    public static void main(String[] args) {
        Person grandfather = new Person();
        grandfather.setLastName("Berezin");
        grandfather.setFirstName("Vasilij");
        grandfather.setPassportId(1);

        Person grandmother = new Person();
        grandmother.setLastName("Berezina");
        grandmother.setFirstName("Nina");
        grandmother.setPassportId(2);

        Person brother_1 = new Person();
        grandmother.setLastName("Berezin");
        grandmother.setFirstName("Anton");
        grandmother.setPassportId(3);

        Person brother_2 = new Person();
        grandmother.setLastName("Vaxlanov");
        grandmother.setFirstName("Bogdan");
        grandmother.setPassportId(4);

        System.out.println(grandfather.getFirstName() + ' ' + grandfather.getLastName() + ' ' + grandfather.getPassportId());
        System.out.println(grandmother.getFirstName() + ' ' + grandmother.getLastName() + ' ' + grandmother.getPassportId());
        System.out.println(brother_1.getFirstName() + ' ' + brother_1.getLastName() + ' ' + brother_1.getPassportId());
        System.out.println(brother_2.getFirstName() + ' ' + brother_2.getLastName() + ' ' + brother_2.getPassportId());
    }

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
