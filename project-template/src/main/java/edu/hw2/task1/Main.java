package edu.hw2.task1;

public final class Main {

    private Main() {

    }

    @SuppressWarnings("RegexpSinglelineJava")
    public static void main(String[] args) {
        var two = new Task1.Constant(2);
        @SuppressWarnings("MagicNumber")
        var four = new Task1.Constant(4);
        var negOne = new Task1.Negate(new Task1.Constant(1));
        var sumTwoFour = new Task1.Addition(two, four);
        var mult = new Task1.Multiplication(sumTwoFour, negOne);
        var exp = new Task1.Exponent(mult, 2);
        var res = new Task1.Addition(exp, new Task1.Constant(1));

        System.out.println(res + " = " + res.evaluate());
    }
}
