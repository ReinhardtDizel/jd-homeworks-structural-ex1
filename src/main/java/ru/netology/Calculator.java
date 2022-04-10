package ru.netology;

public class Calculator {
    public Formula newFormula() {
        return new Formula();
    }

    public static class Formula {
        protected Double a, b, result;

        protected Formula() {
        }

        public Formula addOperand(double operand) {
            if (a == null) {
                a = operand;
            } else if (b == null) {
                b = operand;
            } else {
                throw new IllegalStateException("Formula is full of operands");
            }
            return this;
        }

        public Formula sum() {
            if (a == null || b == null)
                throw new IllegalStateException("Not enough operands!");
            result = a + b;
            return this;
        }

        public Formula mult() {
            if (a == null || b == null)
                throw new IllegalStateException("Not enough operands!");
            result = a * b;
            return this;
        }

        public Formula pow() {
            if (a == null || b == null)
                throw new IllegalStateException("Not enough operands!");
            result = Math.pow(a, b);
            return this;
        }

        public Formula div() {
            if (a == null || b == null)
                throw new IllegalStateException("Not enough operands!");
            result = a / b;
            return this;
        }

        public Formula sub() {
            if (a == null || b == null)
                throw new IllegalStateException("Not enough operands!");
            result = a - b;
            return this;
        }

        public double result() {
            if (result == null)
                throw new IllegalStateException("Formula is not computed!");
            return result;
        }

    }
}
