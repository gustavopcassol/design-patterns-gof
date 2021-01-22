package behavioral.observer.implementation;

import behavioral.observer.implementation.participants.ConcreteObserver;
import behavioral.observer.implementation.participants.ConcreteSubject;

class Main {
    public static void main(String[] args) {
        ConcreteSubject concreteSubject = new ConcreteSubject();
        ConcreteObserver concreteObserver = new ConcreteObserver(concreteSubject);
        concreteSubject.setState(1);
        System.out.println(concreteSubject.getState());
        System.out.println(concreteObserver.getState());

        concreteObserver.detach();
    }
}
