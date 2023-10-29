package edu.hw3;

import edu.hw3.task5.Contact;
import edu.hw3.task5.Task5;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class Task5Test {

    @Test
    void testParseContactsAscendingOrder() {
        String[] names = { "John Locke", "Thomas Aquinas", "David Hume", "Rene Descartes" };
        Contact[] expected = {
            new Contact("Thomas", "Aquinas"),
            new Contact("Rene", "Descartes"),
            new Contact("David", "Hume"),
            new Contact("John", "Locke")
        };

        Contact[] actual = Task5.parseContacts(names, "ASC");

        assertArrayEquals(expected, actual);
    }

    @Test
    void testParseContactsDescendingOrder() {
        String[] names = { "Paul Erdos", "Leonhard Euler", "Carl Gauss" };
        Contact[] expected = {
            new Contact("Carl", "Gauss"),
            new Contact("Leonhard", "Euler"),
            new Contact("Paul", "Erdos")
        };

        Contact[] actual = Task5.parseContacts(names, "DESC");

        assertArrayEquals(expected, actual);
    }

    @Test
    void testParseContactsEmptyArray() {
        String[] names = {};
        Contact[] expected = {};

        Contact[] actual = Task5.parseContacts(names, "ASC");

        assertArrayEquals(expected, actual);
    }

    @Test
    void testParseContactsNullArray() {
        String[] names = null;
        Contact[] expected = {};

        Contact[] actual = Task5.parseContacts(names, "ASC");

        assertArrayEquals(expected, actual);
    }
}
