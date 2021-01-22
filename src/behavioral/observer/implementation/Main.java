package behavioral.observer.implementation;

import behavioral.observer.implementation.participants.ConcreteObserver;
import behavioral.observer.implementation.participants.ConcreteSubject;

class Main { // todo finish all in this package
    public static void main(String[] args) {
        ConcreteSubject concreteSubject = new ConcreteSubject();
        ConcreteObserver concreteObserver = new ConcreteObserver(concreteSubject);
    }
}
