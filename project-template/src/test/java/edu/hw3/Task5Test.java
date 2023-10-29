package edu.hw3;

import edu.hw3.task5.Contact;
import edu.hw3.task5.Task5;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

class Task5Test {

    @Test
    void testSortContactsAscending() {
        String[] names = { "John Locke", "Thomas Aquinas", "David Hume", "Rene Descartes" };
        String sortOrder = "ASC";

        Contact[] sortedContacts = Task5.sortContacts(names, sortOrder);

        assertEquals("Thomas Aquinas", sortedContacts[0].toString());
        assertEquals("Rene Descartes", sortedContacts[1].toString());
        assertEquals("David Hume", sortedContacts[2].toString());
        assertEquals("John Locke", sortedContacts[3].toString());
    }

    @Test
    void testSortContactsDescending() {
        String[] names = { "Paul Erdos", "Leonhard Euler", "Carl Gauss" };
        String sortOrder = "DESC";

        Contact[] sortedContacts = Task5.sortContacts(names, sortOrder);

        assertEquals("Carl Gauss", sortedContacts[0].toString());
        assertEquals("Leonhard Euler", sortedContacts[1].toString());
        assertEquals("Paul Erdos", sortedContacts[2].toString());
    }

    @Test
    void testSortContactsEmptyArray() {
        String[] names = {};
        String sortOrder = "DESC";

        Contact[] sortedContacts = Task5.sortContacts(names, sortOrder);

        assertEquals(0, sortedContacts.length);
    }

    @Test
    void testSortContactsNullArray() {
        String[] names = null;
        String sortOrder = "DESC";

        Contact[] sortedContacts = Task5.sortContacts(names, sortOrder);

        assertEquals(0, sortedContacts.length);
    }
}
