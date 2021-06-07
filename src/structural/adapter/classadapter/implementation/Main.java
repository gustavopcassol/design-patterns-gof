package structural.adapter.classadapter.implementation;

import structural.adapter.classadapter.implementation.participants.Adapter;
import structural.adapter.classadapter.implementation.participants.Target;

class Main {
    public static void main(String[] args) {
        Target adapter = new Adapter();
        Iterable<Character> characters = adapter.request();
        System.out.println(characters);
    }
}
