package edu.project1;


import static edu.project1.HangmanGame.exitFlag;

public class HelpThread implements Runnable{
String input;
    public HelpThread(String input){
        this.input = input;
    }
    @Override
    public void run() {
        Invoker invoker = new Invoker();
        System.out.println(invoker.run(input));
        if (exitFlag){
            System.exit(0);
        }
    }
}
