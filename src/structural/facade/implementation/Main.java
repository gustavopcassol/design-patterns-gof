package structural.facade.implementation;

import structural.facade.implementation.participants.Facade;

class Main {
    public static void main(String[] args) {
        Facade facade = new Facade();
        facade.operation("test");
    }
}
