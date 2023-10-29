package edu.hw3;


import edu.hw3.task2.Task2;
import org.junit.jupiter.api.Test;
import java.util.List;
import static org.junit.jupiter.api.Assertions.assertEquals;

class Task2Test {
    @Test
    void testClusterize() {
        String str1 = "()()()";
        List<String> result1 = Task2.clasterize(str1);
        List<String> expected1 = List.of("()", "()", "()");
        assertEquals(expected1, result1);

        String str2 = "((()))";
        List<String> result2 = Task2.clasterize(str2);
        List<String> expected2 = List.of("((()))");
        assertEquals(expected2, result2);

        String str3 = "((()))(())()()(()())";
        List<String> result3 = Task2.clasterize(str3);
        List<String> expected3 = List.of("((()))", "(())", "()", "()", "(()())");
        assertEquals(expected3, result3);

        String str4 = "((())())(()(()()))";
        List<String> result4 = Task2.clasterize(str4);
        List<String> expected4 = List.of("((())())", "(()(()()))");
        assertEquals(expected4, result4);
    }
}
