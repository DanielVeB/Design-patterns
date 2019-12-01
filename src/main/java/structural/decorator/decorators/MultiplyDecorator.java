package structural.decorator.decorators;

import structural.decorator.Operation;

public class MultiplyDecorator extends DoubleDecorator {

    private Operation right;

    public MultiplyDecorator(Operation left, Operation right) {
        super(left);
        this.right = right;
    }

    @Override
    public double calculate() {
        return super.operation.calculate() * right.calculate();
    }
}
