package structural.adapter.objectadapter.implementation.participants;

import java.util.ArrayList;

public class Adapter implements Target {
    private final Adaptee adaptee;

    public Adapter(Adaptee adaptee) {
        this.adaptee = adaptee;
    }

    @Override
    public ArrayList<Character> request() {
        String text = adaptee.specificRequest();
        ArrayList<Character> characters = new ArrayList<>();
        for (char character : text.toCharArray()) {
            characters.add(character);
        }
        return characters;
    }
}
