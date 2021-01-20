package com.company.behavioral.memento.implementation.participants;

public class Caretaker {
    private Originator.Memento memento;
    private final Originator originator;

    public Caretaker(Originator originator) {
        this.originator = originator;
    }

    public void execute(int newState) {
        memento = originator.createMemento();
        originator.setState(newState);
        originator.operation();
    }

    // Causes "NullPointerException" if "memento" is "null".
    public void unexecute() {
        originator.setMemento(memento);
        originator.operation();
    }
}
