package edu.hw3.task5;

import java.util.Arrays;
import java.util.Comparator;

public abstract class Task5 {
    public static Contact[] parseContacts(String[] names, String sortOrder) {
        if (names == null) {
            return new Contact[0];
        }

        Contact[] contacts = new Contact[names.length];
        for (int i = 0; i < names.length; i++) {
            String fullName = names[i];
            String[] nameParts = fullName.split(" ", 2);
            String firstName = nameParts[0];
            String lastName = nameParts.length > 1 ? nameParts[1] : "";

            contacts[i] = new Contact(firstName, lastName);
        }

        Comparator<Contact> comparator;
        if (sortOrder.equalsIgnoreCase("ASC")) {
            comparator = Comparator.comparing(Contact::getLastName).thenComparing(Contact::getFirstName);
        } else {
            comparator = Comparator.comparing(Contact::getLastName).reversed().thenComparing(Contact::getFirstName);
        }

        Arrays.sort(contacts, comparator);

        return contacts;
    }
}
