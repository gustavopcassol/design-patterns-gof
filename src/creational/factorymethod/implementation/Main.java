package creational.factorymethod.implementation;

import creational.factorymethod.implementation.participants.ConcreteCreator;
import creational.factorymethod.implementation.participants.Creator;

class Main {
    public static void main(String[] args) {
        Creator concreteCreator = new ConcreteCreator();
        concreteCreator.anOperation();
    }
}
