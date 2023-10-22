package edu.hw2.task3;

public class StableConnection implements Connection {
    @Override
    @SuppressWarnings("RegexpSinglelineJava")
    public void execute(String command) {
        System.out.println("Executing command on stable connection: " + command);
    }

    @Override
    public void close() {
    }
}
