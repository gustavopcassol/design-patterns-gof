package structural.adapter.classadapter.implementation;

import structural.adapter.classadapter.implementation.participants.Adapter;
import structural.adapter.classadapter.implementation.participants.Target;

// todo check correctness
class Main {
    public static void main(String[] args) {
        Target target = new Adapter();
        Iterable<Character> characters = target.request();
        System.out.println(characters);
    }
}
