package edu.project1;

import edu.project1.commands.AddWordCommand;
import edu.project1.commands.Commands;
import edu.project1.commands.ExitCommand;
import edu.project1.commands.HelpCommand;
import edu.project1.commands.RemoveCommand;
import edu.project1.commands.ShowDictionaryCommand;
import java.util.HashMap;
import java.util.Map;

public class Invoker {
    public final Map<String, Commands> commandMap = new HashMap<>();
    private final String help = "!help";
    private final String exit = "!exit";
    private final String add = "!add";
    private final String dict = "!dict";
    private final String rem = "!rem";


    public Invoker() {
        commandMap.put(help, new HelpCommand());
        commandMap.put(exit, new ExitCommand());
        commandMap.put(add, new AddWordCommand());
        commandMap.put(dict, new ShowDictionaryCommand());
        commandMap.put(rem, new RemoveCommand());
    }

    public String run(String commandText) {
        String[] cmdText = commandText.split(" ");
        if (commandMap.containsKey(cmdText[0])) {
            Commands cmd = commandMap.get(cmdText[0]);
            if (cmdText[0].equals(add) || cmdText[0].equals(rem)) {
                try {
                    return cmd.execute(cmdText[1], Integer.parseInt(cmdText[2]));
                } catch (Exception ex) {
                    return String.format("Ошибка при выполнении команды \"%s\"!", ex.getMessage());
                }
            }
            return cmd.execute();
        } else {
            return String.format("Неизвестная команда \"%s\". Введите \"!help\" "
                + "чтобы увидеть список команд", commandText);
        }
    }
}

