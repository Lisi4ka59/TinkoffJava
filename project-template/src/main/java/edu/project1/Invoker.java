package edu.project1;

import edu.project1.commands.*;

import java.util.HashMap;
import java.util.Map;

public class Invoker {
    public final Map<String, Commands> commandMap = new HashMap<>();

    public Invoker() {
        commandMap.put("!help", new HelpCommand());
        commandMap.put("!exit", new ExitCommand());
        commandMap.put("!add", new AddWordCommand());
        commandMap.put("!dict", new ShowDictionaryCommand());
        commandMap.put("!rem", new RemoveCommand());
    }

    public String run(String commandText) {
        String[] cmdText = commandText.split(" ");
        if (commandMap.containsKey(cmdText[0])) {
            Commands cmd = commandMap.get(cmdText[0]);
            if (cmdText[0].equals("!add") || cmdText[0].equals("!rem")){
                try {
                    return cmd.execute(cmdText[1], Integer.parseInt(cmdText[2]));
                }catch (Exception ex){
                    return String.format("Unknown command \"%s\". Type \"!help\" to see list of commands", ex.getMessage());
                }
            }
            return cmd.execute();
        } else {
            return String.format("Unknown command \"%s\". Type \"!help\" to see list of commands", commandText);
        }
    }
}

