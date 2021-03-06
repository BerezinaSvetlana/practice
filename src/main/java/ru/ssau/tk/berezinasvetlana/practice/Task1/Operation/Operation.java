package ru.ssau.tk.berezinasvetlana.practice.Task1.Operation;

public abstract class Operation {
    public abstract double apply(double number);

    public double applyTriple(double number) {
        return apply(apply(apply(number)));
    }

    ;

    public static class IdenticalOperation extends Operation {

        @Override
        public double apply(double number) {
            return number;
        }
    }

    public static class SqrtOperation extends Operation {

        @Override
        public double apply(double number) {
            if (number < 0) {
                return 0;
            } else
                return Math.sqrt(number);
        }
    }

    public static class TangentOperation extends Operation {

        @Override
        public double apply(double number) {
            return Math.tan(number);
        }
    }
}
