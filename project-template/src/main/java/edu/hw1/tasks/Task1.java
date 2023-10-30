package edu.hw1.tasks;

import static edu.hw1.Config.SIXTY;

public final class Task1 {
    private Task1() {
    }

    public static Integer task1(String inputs) {
        int sixty = SIXTY;
        String[] input = inputs.split(":");
        int minutes = Integer.parseInt(input[0]) * sixty;
        int seconds = Integer.parseInt(input[1]);
        if (seconds >= 0 && seconds <= sixty && minutes >= 0) {
            return minutes + seconds;
        }
        return -1;
    }
}
