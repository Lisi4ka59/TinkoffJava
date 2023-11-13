package edu.hw5;

public class Task4 {
    public static boolean regex(String password) {
        return password.matches(".*[~!@#$%^&*|].*");
    }
}
