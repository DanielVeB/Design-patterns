package decorator.decorators;

import decorator.Operation;

public class AddDecorator extends DoubleDecorator {

    private Operation right;

    public AddDecorator(Operation left, Operation right) {
        super(left);
        this.right = right;
    }

    @Override
    public double calculate() {
        return super.operation.calculate() + this.right.calculate();
    }
}
