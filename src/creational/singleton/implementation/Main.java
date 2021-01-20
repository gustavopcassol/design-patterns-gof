package creational.singleton.implementation;

import creational.singleton.implementation.participants.Singleton;

class Main {
    public static void main(String[] args) {
        Singleton singleton = Singleton.instance();
        singleton.singletonOperation(1);
        System.out.println(singleton.getSingletonData());
    }
}
