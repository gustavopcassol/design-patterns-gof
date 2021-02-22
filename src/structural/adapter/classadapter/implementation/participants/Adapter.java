package structural.adapter.classadapter.implementation.participants;

import java.util.ArrayList;

public class Adapter extends Adaptee implements Target {
    @Override
    public ArrayList<Character> request() {
        String text = specificRequest();
        ArrayList<Character> characters = new ArrayList<>();
        for (char character : text.toCharArray()) {
            characters.add(character);
        }
        return characters;
    }
}
