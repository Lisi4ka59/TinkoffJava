package edu.project1;

import java.util.NoSuchElementException;
import java.util.Scanner;

public class Input {
    public static String input(){
        Scanner scanner = new Scanner(System.in);
        String inputResult = "";
        boolean inputFlag = true;
        while (inputFlag) {
            System.out.print("> ");
            try {
                inputResult = scanner.nextLine().trim();
            } catch (NoSuchElementException ex) {
                System.out.println("Завершение игры, заходите еще!");
                System.exit(0);
            }
            if (inputResult.startsWith("!")) {
                Thread thread = new Thread(new HelpThread(inputResult));
                thread.start();
            } else {
                inputFlag = false;
            }
        }
        return inputResult;
    }
}
