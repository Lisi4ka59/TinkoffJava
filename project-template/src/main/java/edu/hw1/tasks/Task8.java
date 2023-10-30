package edu.hw1.tasks;

import static edu.hw1.Config.NUM_8;

public final class Task8 {
    private Task8() {
    }

    @SuppressWarnings("CyclomaticComplexity")
    public static Boolean task8(String inputs) {
        String[] horizontal = inputs.split(":");
        boolean res = true;
        int[][] board = new int[NUM_8][NUM_8];
        for (int i = 0; i < NUM_8; i++) {
            String[] horizontalSplit = horizontal[i].split(" ");
            for (int j = 0; j < NUM_8; j++) {
                board[i][j] = Integer.parseInt(horizontalSplit[j]);
            }
        }
        for (int i = 0; i < NUM_8; i++) {
            for (int j = 0; j < NUM_8; j++) {
                if (board[i][j] == 0) {
                    continue;
                }
                try {
                    if (board[i + 2][j + 1] == 1) {
                        res = false;
                    }
                } catch (ArrayIndexOutOfBoundsException ignored) {
                }
                try {
                    if (board[i + 2][j - 1] == 1) {
                        res = false;
                    }
                } catch (ArrayIndexOutOfBoundsException ignored) {
                }
                try {
                    if (board[i + 1][j + 2] == 1) {
                        res = false;
                    }
                } catch (ArrayIndexOutOfBoundsException ignored) {
                }
                try {
                    if (board[i + 1][j - 2] == 1) {
                        res = false;
                    }
                } catch (ArrayIndexOutOfBoundsException ignored) {
                }
                try {
                    if (board[i - 1][j + 2] == 1) {
                        res = false;
                    }
                } catch (ArrayIndexOutOfBoundsException ignored) {
                }
                try {
                    if (board[i - 1][j - 2] == 1) {
                        res = false;
                    }
                } catch (ArrayIndexOutOfBoundsException ignored) {
                }
                try {
                    if (board[i - 2][j + 1] == 1) {
                        res = false;
                    }
                } catch (ArrayIndexOutOfBoundsException ignored) {
                }
                try {
                    if (board[i - 2][j - 1] == 1) {
                        res = false;
                    }
                } catch (ArrayIndexOutOfBoundsException ignored) {
                }
            }
        }
        return res;
    }
}
