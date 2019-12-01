package structural.decorator.decorators;

import structural.decorator.Operation;

public abstract class DoubleDecorator implements Operation {

    protected Operation operation;

    public DoubleDecorator(Operation operation){
        this.operation = operation;
    }
}
