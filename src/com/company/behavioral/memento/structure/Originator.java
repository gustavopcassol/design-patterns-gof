package com.company.behavioral.memento.structure;

class Originator {
    private int state;

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
