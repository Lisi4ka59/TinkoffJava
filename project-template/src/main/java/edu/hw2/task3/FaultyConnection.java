package edu.hw2.task3;

import java.util.Random;

public class FaultyConnection implements Connection {
    private static final double FAILURE_PROBABILITY = 0.3;

    @Override
    @SuppressWarnings("RegexpSinglelineJava")
    public void execute(String command) {
        if (shouldFail()) {
            throw new ConnectionException("Connection exception occurred while executing command: " + command);
        }
        System.out.println("Executing command on faulty connection: " + command);
    }

    @Override
    public void close() {
    }

    private boolean shouldFail() {
        Random random = new Random();
        return random.nextDouble() < FAILURE_PROBABILITY;
    }
}
