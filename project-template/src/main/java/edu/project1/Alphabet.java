package edu.project1;

import java.util.ArrayList;
import java.util.List;

public class Alphabet {

    public static List<String> alphabet = new ArrayList<>();
    Alphabet() {
    }

    public static void add(String letter){
        if (!alphabet.contains(letter.toUpperCase())) {
            alphabet.add(letter.toUpperCase());
        }
    }
    String show() {
        StringBuilder result = new StringBuilder();
        for (String s : alphabet) {
            result.append(s).append(" ");
        }
        return result.toString();
    }

    public static void clear() {
        alphabet.clear();
    }
}
