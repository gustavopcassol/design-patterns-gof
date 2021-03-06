package behavioral.observer.structure;

class ConcreteObserver implements Observer {
    private ConcreteSubject subject;
    private int observerState;

    ConcreteObserver(ConcreteSubject subject) {
        this.subject = subject;
    }

    @Override
    public void update() {
        observerState = subject.getState();
    }
}
