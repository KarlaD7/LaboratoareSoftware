package proiectaresoftware.lab5;

class IntCalculator{
    protected int state;
    public IntCalculator(int state) {
        this.state = state;
    }

    public IntCalculator add(int value) {
        this.state += value;
        return this;
    }

    public IntCalculator substract(int value) {
        this.state -= value;
        return this;
    }
    public IntCalculator multiply(int value) {
        this.state *= value;
        return this;
    }

    public int result() {
        return this.state;
    }

    public IntCalculator clear() {
        this.state = 0;
        return this;
    }

}

class AdvancedCalculator extends IntCalculator{
    public AdvancedCalculator(int state){
        super(state);
    }
    public AdvancedCalculator divide(int value){
        if(value !=0){
            this.state /= value;
        }
        return this;
    }

    public AdvancedCalculator power(int exponent){
        this.state=(int) Math.pow(this.state,exponent);
        return this;
    }
    public AdvancedCalculator root(int n){
        this.state=(int) Math.pow(this.state, 1.0);
        return this;
    }
    @Override
    public AdvancedCalculator add(int value){
        super.add(value);
        return this;
    }
    @Override
    public AdvancedCalculator substract(int value){
        super.substract(value);
        return this;
    }
    @Override
    public AdvancedCalculator multiply(int value){
        super.multiply(value);
        return this;
    }
}

public class AppLab5 {
    public static void main(String[] args){
      //a):
    IntCalculator calculator=new IntCalculator(10);
int result=calculator.add(5).substract(3).multiply(2).result();
        System.out.println("a)"+result);

        //b):
        AdvancedCalculator advancedCalculator = new AdvancedCalculator(10);
        int result2 = advancedCalculator.divide(4).power(2).root(2).result();
        System.out.println("b) " + result2);
    }
}
