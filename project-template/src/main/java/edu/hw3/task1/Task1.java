package edu.hw3.task1;

public abstract class Task1 {
    private static final int NUM_65 = 65;
    private static final int NUM_90 = 90;
    private static final int NUM_97 = 97;
    private static final int NUM_122 = 122;

    public static String task1(String input) {
        String[] inputMassive = input.split("");
        StringBuilder result = new StringBuilder();
        for (String prom:inputMassive) {
            if (prom.matches("[a-z]")) {
                result.append(newSymbol(prom, NUM_97, NUM_122));
            } else if (prom.matches("[A-Z]")) {
                result.append(newSymbol(prom, NUM_65, NUM_90));
            } else {
                result.append(prom);
            }
        }
        return result.toString();
    }

    public static char newSymbol(String prom, int firstSymbol, int lastSymbol) {
        int code = prom.charAt(0);
        code = lastSymbol - (code - firstSymbol);
        return (char) code;
    }
}
