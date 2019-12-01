package decorator;

public class DoubleNumber implements Operation {

    private double val;

    public DoubleNumber(double val){
        this.val = val;
    }

    @Override
    public double calculate() {
        return val;
    }
}
