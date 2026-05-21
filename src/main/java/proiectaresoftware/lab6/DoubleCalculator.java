package proiectaresoftware.lab6;

public class DoubleCalculator extends ACalculator<Double> {
    @Override
    public DoubleCalculator init() {
        state = 0.0;
        return this;
    }

    public DoubleCalculator add(Double a) {
        state = (Double)state + a;
        return this;
    }

    public DoubleCalculator subtract(Double a) {
        state = (Double)state - a;
        return this;
    }

    public DoubleCalculator multiply(Double a) {
        state = (Double)state * a;
        return this;
    }

    public DoubleCalculator divide(Double a) {
        if (a == 0.0) {
            throw new ArithmeticException("Cannot divide by zero");
        }
        state = (Double)state / a;
        return this;
    }
}