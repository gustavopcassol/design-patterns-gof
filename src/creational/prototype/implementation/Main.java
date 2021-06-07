package creational.prototype.implementation;

import creational.prototype.implementation.participants.ConcretePrototype;

class Main {
    public static void main(String[] args) {
        ConcretePrototype concretePrototype = new ConcretePrototype(1);
        ConcretePrototype clone = concretePrototype.cloneSelf();
        System.out.println("The object \"concretePrototype\" has \"state\" equal to: " + concretePrototype.getState());
        System.out.println("The object \"clone\" has \"state\" equal to: " + clone.getState());
    }
}
