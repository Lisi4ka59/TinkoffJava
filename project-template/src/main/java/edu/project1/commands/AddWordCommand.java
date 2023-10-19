package edu.project1.commands;


import static edu.project1.HangmanGame.dictionary;
import static edu.project1.SaveDictionary.save;

public class AddWordCommand implements Commands{
    @Override
    public String execute(String word, Integer difficult){
        if (dictionary.wordDictionary.isEmpty() || !dictionary.wordDictionary.containsKey(word)){
            dictionary.wordDictionary.put(word, difficult);
            save();
        } else{
            return String.format("Слово \"%s\" уже есть в словаре!", word);
        }
        return String.format("Слово \"%s\" успешно добавлено в словарь!", word);
    }
}
