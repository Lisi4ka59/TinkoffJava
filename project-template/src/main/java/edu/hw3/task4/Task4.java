package edu.hw3.task4;


public abstract class Task4 {
    private static final int NUM_1 = 1;
    private static final int NUM_4 = 4;
    private static final int NUM_5 = 5;
    private static final int NUM_9 = 9;
    private static final int NUM_10 = 10;
    private static final int NUM_40 = 40;
    private static final int NUM_50 = 50;
    private static final int NUM_90 = 90;
    private static final int NUM_100 = 100;
    private static final int NUM_400 = 400;
    private static final int NUM_500 = 500;
    private static final int NUM_900 = 900;
    private static final int NUM_1000 = 1000;


    public static String convertToRoman(int oldNumber) {
        int number = oldNumber;
        int[] arabicValues = {NUM_1000, NUM_900, NUM_500, NUM_400, NUM_100, NUM_90, NUM_50, NUM_40,
            NUM_10, NUM_9, NUM_5, NUM_4, NUM_1};
        String[] romanSymbols = {"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};

        StringBuilder romanNumber = new StringBuilder();
        int index = 0;

        while (number > 0) {
            if (number >= arabicValues[index]) {
                romanNumber.append(romanSymbols[index]);
                number -= arabicValues[index];
            } else {
                index++;
            }
        }

        return romanNumber.toString();
    }
}
