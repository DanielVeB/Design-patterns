package structural.decorator.decorators;

import structural.decorator.Operation;

public class SubstractDecorator extends DoubleDecorator {

    private Operation right;

    public SubstractDecorator(Operation left, Operation right) {
        super(left);
        this.right = right;
    }

    @Override
    public double calculate() {
        return super.operation.calculate() - this.right.calculate();
    }
}
