package behavioral.observer.implementation.participants;

public class ConcreteObserver implements Observer {
    private ConcreteSubject subject;
    private int observerState;

    public ConcreteObserver(ConcreteSubject subject) {
        this.subject = subject;
        this.subject.attach(this);
    }

    // In some languages this method should be a destructor.
    public void detach() {
        subject.detach(this);
        subject = null;
    }

    @Override
    public void update() {
        observerState = subject.getState();
    }

    public int getState() {
        return observerState;
    }
}
