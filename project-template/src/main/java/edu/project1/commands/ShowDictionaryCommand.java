package edu.project1.commands;


import java.util.Map;

import static edu.project1.HangmanGame.dictionary;

public class ShowDictionaryCommand implements Commands{
    @Override
    public String execute(){
        StringBuilder result = new StringBuilder();
        result.append("Word: difficult\n");
        for (Map.Entry<String, Integer> entry : dictionary.wordDictionary.entrySet()) {
            String key = entry.getKey();
            Integer value = entry.getValue();
            result.append("\n").append(key).append(": ").append(value);
        }
        return result.toString();
    }
}
