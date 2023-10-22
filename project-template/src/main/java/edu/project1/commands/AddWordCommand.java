package edu.project1.commands;


import static edu.project1.Config.NUMB_3;
import static edu.project1.Config.NUMB_4;
import static edu.project1.HangmanGame.dictionary;
import static edu.project1.SaveDictionary.save;

public class AddWordCommand implements Commands {
    @Override
    public String execute(String word, Integer difficult) {
        if (word.matches("[а-яА-Я]+") && (difficult == 1 || difficult == 2 || difficult == NUMB_3
            || difficult == NUMB_4)) {
            String word1 = word.toLowerCase();
            if (dictionary.wordDictionary.isEmpty() || !dictionary.wordDictionary.containsKey(word1)) {
                dictionary.wordDictionary.put(word1, difficult);
                save();
            } else {
                return String.format("Слово \"%s\" уже есть в словаре!", word1);
            }
            return String.format("Слово \"%s\" успешно добавлено в словарь!", word1);
        } else {
            return "Некорректные значения! Слово должно состоять только из букв русского алфавита! Сложность должна"
                + " быть целым числом от 1 до 4!";
        }
    }
}
