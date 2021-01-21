package behavioral.observer.structure;

class ConcreteSubject extends Subject {
    private int subjectState;

    int getState() {
        return subjectState;
    }

    void setState(int subjectState) {
        this.subjectState = subjectState;
        notifyObservers();
    }
}
