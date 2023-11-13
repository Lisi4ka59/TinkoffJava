package edu.hw5;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task7 {
    public static class StringValidator {

        public static boolean validateString(String input) {
            String[] patterns = {
                "^(?:[01]*0){2}[01]*$",
                "^(0[01]*0|1[01]*1|[01])$",
                "^[01]{1,3}$"
            };

            for (String pattern : patterns) {
                if (input.matches(pattern)) {
                    return true;
                }
            }
            return false;
        }
    }
}
