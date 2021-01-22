package behavioral.observer.implementation.participants;

public class ConcreteObserver implements Observer {
    private ConcreteSubject subject;
    private int observerState;

    public ConcreteObserver(ConcreteSubject subject) {
        this.subject = subject;
        subject.attach(this);
    }

    @Override
    public void update() {
        observerState = subject.getState();
    }
}
