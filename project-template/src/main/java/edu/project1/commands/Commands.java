package edu.project1.commands;

public interface Commands {
    default String execute(String args) {
        return "Unknown command!";
    }

    default String execute() {
        return "Unknown commands!";
    }

    default String execute(String word, Integer difficult) {
        return "Users not support!";
    }
}
