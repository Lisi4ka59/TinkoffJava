package edu.hw5;

public abstract class Task5 {
    public static boolean regex(String number) {
        return number.matches("^[АВЕКМНОРСТУХ]{1}\\d{3}[АВЕКМНОРСТУХ]{2}\\d{2,3}$");
    }
}

