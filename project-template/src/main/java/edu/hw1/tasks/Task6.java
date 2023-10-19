package edu.hw1.tasks;

import java.util.Collections;
import java.util.LinkedList;
import static edu.hw1.Config.FOUR_1;
import static edu.hw1.Config.FOUR_2;
import static edu.hw1.Config.FOUR_3;
import static edu.hw1.Config.FOUR_4;
import static edu.hw1.Config.FOUR_5;
import static edu.hw1.Config.FOUR_6;
import static edu.hw1.Config.FOUR_7;
import static edu.hw1.Config.FOUR_8;
import static edu.hw1.Config.FOUR_9;
import static edu.hw1.Config.NUM_6174;
import static edu.hw1.Config.TEN;
import static edu.hw1.Config.THOUSAND;

public final class Task6 {
    private Task6() {
    }

    @SuppressWarnings("ParameterAssignment")
    public static Integer task6(String inputs) {
        int input = Integer.parseInt(inputs);
        if (!(input > THOUSAND && input < FOUR_9) || input == FOUR_1 || input == FOUR_2 || input == FOUR_3
            || input == FOUR_4
            || input == FOUR_5 || input == FOUR_6 || input == FOUR_7 || input == FOUR_8) {
            throw new NumberFormatException();
        }
        int count = 0;
        while (input != NUM_6174) {
            String[] prom = inputs.split("");
            LinkedList<Integer> list = new LinkedList<>();
            for (int i = 0; i < inputs.length(); i++) {
                list.add(Integer.parseInt(prom[i]));
            }
            Collections.sort(list);
            int down = make(list);
            list.sort(Collections.reverseOrder());
            int up = make(list);
            input = down - up;
            inputs = String.valueOf(input);
            if (input < THOUSAND) {
                inputs = "0" + inputs;
            }
            count++;
        }
        return count;
    }

    private static int make(LinkedList<Integer> input) {
        int res = 0;
        for (int i = 0; i < input.size(); i++) {
            res = res + ((int) Math.pow(TEN, i)) * input.get(i);
        }
        return res;
    }
}
