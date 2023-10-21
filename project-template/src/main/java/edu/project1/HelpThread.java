package edu.project1;


public class HelpThread implements Runnable{
String input;
    public HelpThread(String input){
        this.input = input;
    }
    @Override
    public void run() {
        Invoker invoker = new Invoker();
        System.out.println(invoker.run(input));
    }
}
