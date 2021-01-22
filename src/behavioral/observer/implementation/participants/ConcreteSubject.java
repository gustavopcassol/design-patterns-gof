package behavioral.observer.implementation.participants;

public class ConcreteSubject extends Subject {
    private int subjectState;

    public int getState() {
        return subjectState;
    }

    public void setState(int subjectState) {
        this.subjectState = subjectState;
        notifyObservers();
    }
}
