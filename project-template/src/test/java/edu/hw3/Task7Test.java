package edu.hw3;

import edu.hw3.task7.Task7;
import org.junit.jupiter.api.Test;
import java.util.TreeMap;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class Task7Test {

    @Test
    void testNullComparison() {
        TreeMap<String, String> tree = new TreeMap<>(new Task7.NullComparator());
        tree.put(null, "test");

        assertTrue(tree.containsKey(null));
    }

    @Test
    void testNonNullComparison() {
        TreeMap<String, String> tree = new TreeMap<>(new Task7.NullComparator());
        tree.put("key1", "value1");
        tree.put("key2", "value2");

        assertFalse(tree.containsKey(null));
    }

    @Test
    void testMixedComparison() {
        TreeMap<String, String> tree = new TreeMap<>(new Task7.NullComparator());
        tree.put(null, "test");
        tree.put("key1", "value1");

        assertTrue(tree.containsKey(null));
        assertTrue(tree.containsKey("key1"));
    }
}
