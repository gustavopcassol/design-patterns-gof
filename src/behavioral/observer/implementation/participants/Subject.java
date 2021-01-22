package behavioral.observer.implementation.participants;

import java.util.ArrayList;
import java.util.Collection;

abstract class Subject {
    private final Collection<Observer> observers = new ArrayList<>();

    void attach(Observer observer) {
    }

    void detach(Observer observer) {
    }

    // The method name was changed from "notify" because "Object" has one with the same name.
    void notifyObservers() {
        for (Observer observer : observers) {
            observer.update();
        }
    }
}
