package edu.hw3.task2;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public abstract class Task2 {
    private static final String ERROR = "Unbalanced brackets!";

    public static List<String> clasterize(String input) {
        List<String> clusters = new ArrayList<>();
        Stack<Integer> stack = new Stack<>();
        int start = 0;
        for (int i = 0; i < input.length(); i++) {
            char c = input.charAt(i);

            if (c == '(') {
                stack.push(i);
            } else if (c == ')' && !stack.isEmpty()) {
                int top = stack.pop();
                if (stack.isEmpty()) {
                    clusters.add(input.substring(top, i + 1));
                    start = i + 1;
                }
            }
        }
        if (!stack.isEmpty()) {
            throw new IllegalArgumentException(ERROR);
        }
        if (start < input.length()) {
            throw new IllegalArgumentException(ERROR);
        }
        return clusters;
    }
}

