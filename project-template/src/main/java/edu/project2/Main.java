package edu.project2;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class Main {
    private int width;
    private int height;
    private int[][] maze;
    private Random random;

    public Main(int width, int height) {
        this.width = width;
        this.height = height;
        this.maze = new int[height][width];
        this.random = new Random();
    }

    public void generateMaze() {
        // Initialize maze with walls
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++) {
                maze[i][j] = 1;
            }
        }

        // Generate maze starting from the top left corner
        generateMazeRecursive(0, 0);

        // Set the entrance and exit of the maze
        maze[0][0] = 0;
        maze[height - 1][width - 1] = 0;
    }

    private void generateMazeRecursive(int row, int col) {
        // Create a list of directions
        List<Integer> directions = Arrays.asList(1, 2, 3, 4);
        Collections.shuffle(directions, random);

        for (int direction : directions) {
            int newRow = row;
            int newCol = col;

            // Move to the next cell based on the selected direction
            if (direction == 1 && row > 1) {
                newRow -= 2;
            } else if (direction == 2 && col < width - 2) {
                newCol += 2;
            } else if (direction == 3 && row < height - 2) {
                newRow += 2;
            } else if (direction == 4 && col > 1) {
                newCol -= 2;
            }

            // Check if the new cell is valid
            if (newRow >= 0 && newRow < height && newCol >= 0 && newCol < width && maze[newRow][newCol] == 1) {
                // Remove the wall between the current cell and the new cell
                maze[newRow][newCol] = 0;
                maze[(row + newRow) / 2][(col + newCol) / 2] = 0;

                // Recursively generate the maze from the new cell
                generateMazeRecursive(newRow, newCol);
            }
        }
    }

    public void printMaze() {
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++) {
                if (maze[i][j] == 0) {
                    System.out.print("  "); // Empty space
                } else {
                    System.out.print("██"); // Wall
                }
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int width = 10;
        int height = 10;

        Main mazeGenerator = new Main(width, height);
        mazeGenerator.generateMaze();
        mazeGenerator.printMaze();
    }
}
