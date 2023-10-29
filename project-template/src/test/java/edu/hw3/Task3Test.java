package edu.hw3;

import edu.hw3.task3.Task3;
import org.junit.jupiter.api.Test;
import java.util.List;
import java.util.Map;
import static org.junit.jupiter.api.Assertions.assertEquals;

class Task3Test {
    @Test
    void testFreqDictString() {
        List<String> lst1 = List.of("a", "bb", "a", "bb");
        Map<String, Integer> result1 = Task3.freqDict(lst1);
        Map<String, Integer> expected1 = Map.of("a", 2, "bb", 2);
        assertEquals(expected1, result1);

        List<String> lst2 = List.of("this", "and", "that", "and");
        Map<String, Integer> result2 = Task3.freqDict(lst2);
        Map<String, Integer> expected2 = Map.of("this", 1, "and", 2, "that", 1);
        assertEquals(expected2, result2);

        List<String> lst3 = List.of("код", "код", "код", "bug");
        Map<String, Integer> result3 = Task3.freqDict(lst3);
        Map<String, Integer> expected3 = Map.of("код", 3, "bug", 1);
        assertEquals(expected3, result3);
    }

    @Test
    void testFreqDictInteger() {
        List<Integer> lst1 = List.of(1, 1, 2, 2);
        Map<Integer, Integer> result1 = Task3.freqDict(lst1);
        Map<Integer, Integer> expected1 = Map.of(1, 2, 2, 2);
        assertEquals(expected1, result1);
    }
}
