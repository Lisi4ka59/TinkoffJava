package edu.hw3.task5;

public class Contact {
    String firstName;
    String lastName;

    public Contact(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String getFullName() {
        if (lastName == null || lastName.isEmpty()) {
            return firstName;
        } else {
            return firstName + " " + lastName;
        }
    }

    public String getLastName() {
        return lastName;
    }

    public String getFirstName() {
        return firstName;
    }
}

