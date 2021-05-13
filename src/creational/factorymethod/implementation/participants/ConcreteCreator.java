package creational.factorymethod.implementation.participants;

public class ConcreteCreator extends Creator {
    @Override
    ConcreteProduct factoryMethod() {
        return new ConcreteProduct();
    }
}
