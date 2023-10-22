package edu.hw2.task1;

public class Task1 {
    public interface Expr {
        double evaluate();
    }

    public final record Constant(double value) implements Expr {
        @Override
        public double evaluate() {
            return value;
        }
    }

    public final record Negate(Expr operand) implements Expr {
        @Override
        public double evaluate() {
            return -operand.evaluate();
        }
    }

    public final record Exponent(Expr base, double exponent) implements Expr {
        @Override
        public double evaluate() {
            return Math.pow(base.evaluate(), exponent);
        }
    }

    public final record Addition(Expr left, Expr right) implements Expr {
        @Override
        public double evaluate() {
            return left.evaluate() + right.evaluate();
        }
    }

    public final record Multiplication(Expr left, Expr right) implements Expr {
        @Override
        public double evaluate() {
            return left.evaluate() * right.evaluate();
        }
    }
}
