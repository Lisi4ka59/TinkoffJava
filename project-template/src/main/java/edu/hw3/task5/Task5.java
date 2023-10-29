package edu.hw3.task5;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public abstract class Task5 {
    public static Contact[] sortContacts(String[] names, String sortOrder) {
        if (names == null || names.length == 0) {
            return new Contact[0];
        }

        List<Contact> contacts = createContactList(names);
        Comparator<Contact> comparator = getComparator(sortOrder);

        contacts.sort(comparator);

        return contacts.toArray(new Contact[0]);
    }

    private static List<Contact> createContactList(String[] names) {
        return Arrays.stream(names)
            .map(name -> {
                String[] nameParts = name.split(" ");
                String firstName = nameParts[0];
                String lastName = nameParts.length > 1 ? nameParts[1] : nameParts[0];
                return new Contact(firstName, lastName);
            }).collect(Collectors.toList());
    }

    private static Comparator<Contact> getComparator(String sortOrder) {
        if (sortOrder.equalsIgnoreCase("DESC")) {
            return Comparator.comparing(Contact::getLastName).reversed();
        } else {
            return Comparator.comparing(Contact::getLastName);
        }
    }
}
