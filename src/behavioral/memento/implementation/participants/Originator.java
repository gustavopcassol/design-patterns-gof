package behavioral.memento.implementation.participants;

public class Originator {
    private int state;

    int getState() {
        return state;
    }

    void setState(int state) {
        this.state = state;
    }

    void operation() {
        System.out.println(state);
    }

    void setMemento(Memento memento) {
        state = memento.getState();
    }

    Memento createMemento() {
        return new Memento(state);
    }

    static final class Memento {
        private int state;

        private Memento(int state) {
            this.state = state;
        }

        private int getState() {
            return state;
        }

        private void setState(int state) {
            this.state = state;
        }
    }
}
