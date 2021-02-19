package structural.adapter.implementation;

import structural.adapter.implementation.participants.Adaptee;
import structural.adapter.implementation.participants.Adapter;
import structural.adapter.implementation.participants.Target;

// todo check correctness
class Main {
    public static void main(String[] args) {
        Adaptee adaptee = new Adaptee();
        Target target = new Adapter(adaptee);
        String text = target.request();
        System.out.println(text);
    }
}
