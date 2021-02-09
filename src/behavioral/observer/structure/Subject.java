package behavioral.observer.structure;

import java.util.ArrayList;
import java.util.Collection;

abstract class Subject {
    private final Collection<Observer> observers = new ArrayList<>();

    void attach(Observer observer) {
    }

    void detach(Observer observer) {
    }

    // The method name was originally "notify", but was changed because "Object" has a method with that same name.
    void notifyObservers() {
        for (Observer observer : observers) {
            observer.update();
        }
    }
}
