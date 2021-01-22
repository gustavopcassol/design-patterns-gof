package behavioral.memento.implementation;

import behavioral.memento.implementation.participants.Caretaker;
import behavioral.memento.implementation.participants.Originator;

class Main {
    public static void main(String[] args) {
        Originator originator = new Originator();
        Caretaker caretaker = new Caretaker(originator);
        caretaker.execute(1);

        caretaker.unexecute();
    }
}
