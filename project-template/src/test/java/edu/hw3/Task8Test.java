package edu.hw3;

import edu.hw3.task8.Task8;
import org.junit.jupiter.api.Test;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class Task8Test {

    @Test
    void testIteratorWithEmptyCollection() {
        List<Integer> emptyList = new ArrayList<>();
        Task8<Integer> iterator = new Task8<>(emptyList);

        assertFalse(iterator.hasNext());
    }

    @Test
    void testIteratorWithSingleElementCollection() {
        List<Integer> singletonList = List.of(5);
        Task8<Integer> iterator = new Task8<>(singletonList);

        assertTrue(iterator.hasNext());
        assertEquals(Integer.valueOf(5), iterator.next());
        assertFalse(iterator.hasNext());
    }

    @Test
    void testIteratorWithMultipleElementsCollection() {
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5);
        Task8<Integer> iterator = new Task8<>(list);

        assertTrue(iterator.hasNext());
        assertEquals(Integer.valueOf(5), iterator.next());
        assertTrue(iterator.hasNext());
        assertEquals(Integer.valueOf(4), iterator.next());
        assertTrue(iterator.hasNext());
        assertEquals(Integer.valueOf(3), iterator.next());
        assertTrue(iterator.hasNext());
        assertEquals(Integer.valueOf(2), iterator.next());
        assertTrue(iterator.hasNext());
        assertEquals(Integer.valueOf(1), iterator.next());
        assertFalse(iterator.hasNext());
    }
}
