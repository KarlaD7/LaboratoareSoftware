package ro.ulbs.proiectaresoftware.advanced;

public abstract class ACalculator {
    protected Object  state;
    public Object result() {
        return state;
    }

    public ACalculator clear() {
        this.init();
        return this;
    }

    protected abstract void init();
}


class NewIntCalculator extends ACalculator {
    public NewIntCalculator(int initialValue) {
        this.state = initialValue;
    }

    @Override
    protected void init() { this.state = 0; }

    public NewIntCalculator add(int val) {
        this.state = (Integer) this.state + val;
        return this;
    }
    public NewIntCalculator subtract(int val) {
        this.state = (Integer) this.state - val;
        return this;
    }
    public NewIntCalculator multiply(int val) {
        this.state = (Integer) this.state * val;
        return this;
    }
}

class DoubleCalculator extends ACalculator {
    public DoubleCalculator(double initialValue) {
        this.state = initialValue;
    }

    @Override
    protected void init() { this.state = 0.0; }

    public DoubleCalculator add(double val) {
        this.state = (Double) this.state + val;
        return this;
    }
    public DoubleCalculator subtract(double val) {
        this.state = (Double) this.state - val;
        return this;
    }
    public DoubleCalculator multiply(double val) {
        this.state = (Double) this.state * val;
        return this;
    }
}