package edu.hw3;

import edu.hw3.task1.Task1;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

class Task1Test {
    @Test
    void testTask1WithLowercaseLetters() {
        String input = "abcdefghijklmnopqrstuvwxyz";
        String expected = "zyxwvutsrqponmlkjihgfedcba";
        String result = Task1.task1(input);
        assertEquals(expected, result);
    }

    @Test
    void testTask1WithUppercaseLetters() {
        String input = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String expected = "ZYXWVUTSRQPONMLKJIHGFEDCBA";
        String result = Task1.task1(input);
        assertEquals(expected, result);
    }

    @Test
    void testTask1WithMixedCaseLetters() {
        String input = "aBcDeFgHiJkLmNoPqRsTuVwXyZ";
        String expected = "zYxWvUtSrQpOnMlKjIhGfEdCbA";
        String result = Task1.task1(input);
        assertEquals(expected, result);
    }

    @Test
    void testTask1WithNonAlphabeticCharacters() {
        String input = "123!@#$%^&*()";
        String expected = "123!@#$%^&*()";
        String result = Task1.task1(input);
        assertEquals(expected, result);
    }
}
