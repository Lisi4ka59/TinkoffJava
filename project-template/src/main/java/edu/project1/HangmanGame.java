package edu.project1;

import java.util.Random;

import static edu.project1.Input.input;
import static edu.project1.LoadDictionary.load;

public class HangmanGame {
    public static boolean exitFlag = false;
    public static Dictionary dictionary = new Dictionary();
    public static final String fileName = "dictionary.txt";
    public static boolean lose = false;
    public static boolean win = false;
    public static Random rand = new Random();

    public static void run() {
        load();
        System.out.println("Здравствуйте, Вас приветствует игра виселица!");
        while (!exitFlag) {

            System.out.println("Для того чтобы открыть инструкцию введите \"!help\"");
            System.out.print("""
                Выберете сложность игры (введите число):
                Легкий - "1"
                Средний - "2"
                Сложный - "3"
                NIGHTMARE - "4"
                """);
            int inputGameMode;
            while (true) {
                try {
                    inputGameMode = Integer.parseInt(input());
                    if (!(inputGameMode == 1 || inputGameMode == 2 || inputGameMode == 3 || inputGameMode == 4)) {
                        throw new IllegalArgumentException();
                    }
                } catch (IllegalArgumentException ex) {
                    System.out.println("Неправильно выбрана сложность игры! Попробуйте еще раз.");
                    continue;
                }
                break;
            }
            GameMode gameMode = new GameMode(inputGameMode);
            if (!gameMode.isWord) {
                continue;
            }
            System.out.printf("Мы загадали слово из %d букв!\n", gameMode.countLetter);
            System.out.println("Попробуйте его отгадать! Вы можете вводить одну букву, или все слово сразу.");
            Alphabet alphabet = new Alphabet();
            String letter;
            while (!(win || lose)) {
                System.out.println(gameMode.hiddenWord);
                System.out.printf("У вас осталось %d жизней.\n", gameMode.life);
                System.out.printf("Вы уже ввели буквы: %s\n", alphabet.show());
                while (true) {
                    letter = input();
                    if (letter.matches("[а-яА-Я]+")) {
                        letter = letter.toLowerCase();
                        break;
                    }
                    System.out.println("Вы ввели некорректное значение, попробуйте еще раз!");
                }
                gameMode.changeWord(letter);
            }
            if (win) {
                System.out.println("Наши поздравления! Вы победили!");
            } else {
                System.out.println("К сожалению в этот раз Вы проиграли! Попробуйте выбрать другую сложность слова!");
            }
            System.out.println("Хотите ли вы сыграть еще одну игру? (\"y\" - yes, \"n\" - no)");
            while (true) {
                if ("n".equalsIgnoreCase(input())) {
                    exitFlag = true;
                    break;
                } else if ("y".equalsIgnoreCase(input())) {
                    break;
                }
            }
            win = false;
            lose = false;
            alphabet.clear();
        }
    }
}
