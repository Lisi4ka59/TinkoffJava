package edu.project1.commands;


import static edu.project1.HangmanGame.dictionary;
import static edu.project1.SaveDictionary.save;

public class AddWordCommand implements Commands{
    @Override
    public String execute(String word, Integer difficult){
        if (word.matches("[а-яА-Я]+") && (difficult == 1 || difficult == 2 || difficult == 3 || difficult == 4)) {
            word = word.toLowerCase();
            if (dictionary.wordDictionary.isEmpty() || !dictionary.wordDictionary.containsKey(word)) {
                dictionary.wordDictionary.put(word, difficult);
                save();
            } else {
                return String.format("Слово \"%s\" уже есть в словаре!", word);
            }
            return String.format("Слово \"%s\" успешно добавлено в словарь!", word);
        } else {
            return "Некорректные значения! Слово должно состоять только из букв русского алфавита! Сложность должна быть целым числом от 1 до 4!";
        }
    }
}
