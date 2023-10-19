package edu.hw1.tasks;

import static edu.hw1.Config.TEN;

public final class Task2 {
    private Task2() {
    }

    public static Integer task2(String inputs) {
        long input = Math.abs(Long.parseLong(inputs.replaceFirst("\\.", "")));
        int res = 0;
        if (input == 0) {
            return 1;
        }
        while (input != 0) {
            input = input / TEN;
            res++;
        }
        return res;
    }
}
