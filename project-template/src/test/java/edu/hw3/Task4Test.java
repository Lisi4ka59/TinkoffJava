package edu.hw3;

import edu.hw3.task4.Task4;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

class Task4Test {
    @Test
    void testConvertToRoman() {
        assertEquals("II", Task4.convertToRoman(2));
        assertEquals("XII", Task4.convertToRoman(12));
        assertEquals("XVI", Task4.convertToRoman(16));
        assertEquals("IV", Task4.convertToRoman(4));
        assertEquals("IX", Task4.convertToRoman(9));
        assertEquals("XXXIX", Task4.convertToRoman(39));
        assertEquals("XLV", Task4.convertToRoman(45));
        assertEquals("LXIX", Task4.convertToRoman(69));
        assertEquals("XCIX", Task4.convertToRoman(99));
        assertEquals("CD", Task4.convertToRoman(400));
        assertEquals("DXL", Task4.convertToRoman(540));
        assertEquals("MCMXCIX", Task4.convertToRoman(1999));
        assertEquals("MMMMCMXCIX", Task4.convertToRoman(4999));
    }
}

