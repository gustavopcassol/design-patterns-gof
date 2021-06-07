package creational.prototype.implementation.participants;

public class ConcretePrototype implements Prototype {
    private final int state;

    public ConcretePrototype(int state) {
        this.state = state;
    }

    public int getState() {
        return state;
    }

    @Override
    public ConcretePrototype cloneSelf() {
        return new ConcretePrototype(this.state);
    }
}
