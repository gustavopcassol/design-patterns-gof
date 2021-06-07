package behavioral.templatemethod.implementation;

import behavioral.templatemethod.implementation.participants.AbstractClass;
import behavioral.templatemethod.implementation.participants.ConcreteClass;

class Main {
    public static void main(String[] args) {
        AbstractClass concreteClass = new ConcreteClass();
        concreteClass.templateMethod();
    }
}
