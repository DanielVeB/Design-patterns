package structural.decorator;

public class SqrtDoubleNumber implements Operation {

    private double val;

    public SqrtDoubleNumber(double val){
        this.val = val;
    }

    @Override
    public double calculate() {
        return Math.sqrt(val);
    }
}
