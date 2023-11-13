package edu.hw5;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task6 {
    public static class SubsequenceChecker {
        public static boolean isSubsequence(String s, String t) {
            StringBuilder patternBuilder = new StringBuilder(".*");
            for (char c : s.toCharArray()) {
                patternBuilder.append(c).append(".*");
            }
            String pattern = patternBuilder.toString();

            Pattern p = Pattern.compile(pattern);
            Matcher m = p.matcher(t);

            return m.matches();
        }

        public static void main(String[] args) {
            String s = "abc";
            String t = "achfdbaabgabcaabg";
            boolean result = isSubsequence(s, t);
            System.out.println(result); // Выведет true, так как "abc" является подпоследовательностью "achfdbaabgabcaabg"
        }
    }
}
