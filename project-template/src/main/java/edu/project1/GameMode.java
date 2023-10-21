package edu.project1;

import java.util.ArrayList;
import java.util.Set;
import static edu.project1.HangmanGame.dictionary;
import static edu.project1.HangmanGame.rand;

public class GameMode {
    public int mode;
    public String word;
    public String hiddenWord;
    public int countLetter;
    public int life;
    public boolean isWord;

    GameMode(int mode) {
        this.mode = mode;
        isWord = gameChoose();
        this.hiddenWord = word.replaceAll("[а-яА-Я]", "*");
        this.countLetter = word.length();
        if (mode == 1 || mode == 2) {
            this.life = 5;
        }
        if (mode == 3) {
            this.life = 4;
        }
        if (mode == 4) {
            this.life = 3;
        }
    }

    void changeWord(String letter) {
        if (letter.length() == 1) {
            Alphabet.add(letter);
            if (word.contains(letter)) {
                System.out.println("Правильно!");
                this.word = word.replaceAll(letter.toLowerCase(), letter.toUpperCase());
                this.hiddenWord = word.replaceAll("[а-я]", "*");
                if (!hiddenWord.contains("*")) {
                    HangmanGame.win = true;
                }
            } else {
                System.out.println("Неправильно!");
                life--;
                if (life == 0) {
                    HangmanGame.lose = true;
                }
            }
        } else {
            if (word.equals(letter)) {
                System.out.println("Правильно!");
                HangmanGame.win = true;
            } else {
                System.out.println("Неправильно!");
                life--;
                if (life == 0) {
                    HangmanGame.lose = true;
                }
            }
        }
    }

    boolean gameChoose() {
        ArrayList<String> dict = new ArrayList<>();
        Set<String> words = dictionary.wordDictionary.keySet();
        for (String s : words) {
            if (dictionary.wordDictionary.get(s) == mode) {
                dict.add(s);
            }
        }
        if (dict.isEmpty()) {
            System.out.println("В словаре нет слов с заданной сложностью! Добавьте слова или выберете другую сложность!");
            this.word = "";
            return false;
        }
        int index = rand.nextInt(dict.size());
        this.word = dict.get(index);
        return true;
    }

}
