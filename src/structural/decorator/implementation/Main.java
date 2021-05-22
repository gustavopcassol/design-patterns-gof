package structural.decorator.implementation;

import structural.decorator.implementation.participants.Component;
import structural.decorator.implementation.participants.ConcreteComponent;
import structural.decorator.implementation.participants.ConcreteDecoratorA;
import structural.decorator.implementation.participants.ConcreteDecoratorB;


class Main {
    public static void main(String[] args) {
        Component concreteComponent = new ConcreteComponent();

        Component concreteDecoratorA = new ConcreteDecoratorA(concreteComponent, 1);
        concreteDecoratorA.operation();

        Component concreteDecoratorB = new ConcreteDecoratorB(concreteComponent);
        concreteDecoratorB.operation();
    }
}
