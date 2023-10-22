package edu.project1.commands;

import static edu.project1.HangmanGame.exitFlag;

public class ExitCommand implements Commands {
    @Override
public String execute() {
        exitFlag = true;
        return "exit";
    }
}
