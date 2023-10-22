package edu.hw2.task3;

public class ConnectionException extends RuntimeException {
    public ConnectionException(Exception cause) {
        super(cause);
    }

    public ConnectionException(String cause) {
        super(cause);
    }
}
