package edu.project1.commands;

import static edu.project1.HangmanGame.dictionary;

public class RemoveCommand implements Commands {
    @Override
    public String execute(String removeWord) {
        try {
            dictionary.wordDictionary.remove(removeWord);
        } catch (NullPointerException ex) {
            return String.format("Слова \"%s\" нет в словаре!", removeWord);
        }
        return String.format("Слово \"%s\" удалено из словаря!", removeWord);
    }
}
