package edu.project1;

import static edu.project1.Input.input;
import static edu.project1.LoadDictionary.load;

public class HangmanGame {
    public static boolean exitFlag = false;
    public static Dictionary dictionary = new Dictionary();
    public static final String fileName = "dictionary.txt";

    public static void run(){
        load();
        System.out.println("Здравствуйте, Вас приветствует игра виселица!");
        System.out.println("Для того чтобы открыть инструкцию введите \"!help\"");
        System.out.print("""
                Выберете сложность игры (введите число):
                Легкий - "1"
                Средний - "2"
                Сложный - "3"
                NIGHTMARE - "4"
                >\s""");
        String inputGameMode = input();

        System.out.println(inputGameMode);
    }
}
