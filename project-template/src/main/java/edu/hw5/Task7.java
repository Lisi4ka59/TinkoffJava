package edu.hw5;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task7 {
    public static class StringValidator {

        public static boolean validateString(String input) {
            // Проверка на содержание не менее 3 символов, включая 0 на третьей позиции
            Pattern pattern1 = Pattern.compile("^(1*0){2,}[01]*$");
            Matcher matcher1 = pattern1.matcher(input);

            // Проверка на начале и окончание строки одним и тем же символом
            Pattern pattern2 = Pattern.compile("^(0|1)(1|0)*\\1$");
            Matcher matcher2 = pattern2.matcher(input);

            // Проверка на длину строки от 1 до 3 символов
            Pattern pattern3 = Pattern.compile("^[01]{1,3}$");
            Matcher matcher3 = pattern3.matcher(input);

            return matcher1.matches() && matcher2.matches() && matcher3.matches();
        }
    }
}
