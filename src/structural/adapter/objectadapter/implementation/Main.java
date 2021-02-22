package structural.adapter.objectadapter.implementation;

import structural.adapter.objectadapter.implementation.participants.Adaptee;
import structural.adapter.objectadapter.implementation.participants.Adapter;
import structural.adapter.objectadapter.implementation.participants.Target;

class Main {
    public static void main(String[] args) {
        Adaptee adaptee = new Adaptee();
        Target target = new Adapter(adaptee);
        Iterable<Character> characters = target.request();
        System.out.println(characters);
    }
}
