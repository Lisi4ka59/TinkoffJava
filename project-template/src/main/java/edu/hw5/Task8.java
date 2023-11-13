package edu.hw5;

public class Task8 {
    public static class StringValidator {

        public static boolean validateString(String input) {
            // Регулярные выражения
            String oddLengthRegex = "^(?:[01]{2})*[01]$";
            String startWith0OddLengthOrStartWith1EvenLengthRegex = "^(?:0[01]{2})*$|^1(?:[01]{2})*$";
            String multipleOf3ZerosRegex = "^(1*01*01*01*)*$";
            String not11Or111Regex = "^(?!11$|111$)[01]*$";
            String oddOnesRegex = "^(0*10*10*)*$";
            String atLeastTwoZerosAtMostOneOneRegex = "^(?:1*01*0){2,}$";
            String noConsecutiveOnesRegex = "^(?!.*11).*$";

            // Проверка на соответствие регулярным выражениям
            boolean isOddLength = input.matches(oddLengthRegex);
            boolean isStartWith0OddLengthOrStartWith1EvenLength = input.matches(startWith0OddLengthOrStartWith1EvenLengthRegex);
            boolean isMultipleOf3Zeros = input.matches(multipleOf3ZerosRegex);
            boolean isNot11Or111 = input.matches(not11Or111Regex);
            boolean isOddOnes = input.matches(oddOnesRegex);
            boolean isAtLeastTwoZerosAtMostOneOne = input.matches(atLeastTwoZerosAtMostOneOneRegex);
            boolean isNoConsecutiveOnes = input.matches(noConsecutiveOnesRegex);

            return isOddLength && isStartWith0OddLengthOrStartWith1EvenLength && isMultipleOf3Zeros
                && isNot11Or111 && isOddOnes && isAtLeastTwoZerosAtMostOneOne && isNoConsecutiveOnes;
        }

        public static void main(String[] args) {
            System.out.println(validateString("010101")); // Вернет true
            System.out.println(validateString("")); // Вернет false
            System.out.println(validateString("00")); // Вернет true
        }
    }
}
