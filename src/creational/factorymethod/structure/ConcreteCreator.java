package creational.factorymethod.structure;

class ConcreteCreator extends Creator {
    @Override
    ConcreteProduct factoryMethod() {
        return new ConcreteProduct();
    }
}
