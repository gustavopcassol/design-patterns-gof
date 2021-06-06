package behavioral.observer.implementation.participants;

import java.util.ArrayList;
import java.util.Collection;

abstract class Subject {
    private final Collection<Observer> observers = new ArrayList<>();

    void attach(Observer observer) {
        observers.add(observer);
    }

    void detach(Observer observer) {
        observers.remove(observer);
    }

    // The method was renamed from "notify" because Object class has one with that name.
    void notifyObservers() {
        for (Observer observer : observers) {
            observer.update();
        }
    }
}
