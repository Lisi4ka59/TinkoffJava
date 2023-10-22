package edu.project1.commands;

public interface Commands {
    String MESSAGE = "Unknown command!";
    default String execute(String args) {
        return MESSAGE;
    }

    default String execute() {
        return MESSAGE;
    }

    default String execute(String word, Integer difficult) {
        return MESSAGE;
    }
}
