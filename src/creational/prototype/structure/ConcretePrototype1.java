package creational.prototype.structure;

class ConcretePrototype1 implements Prototype {
    @Override
    public ConcretePrototype1 cloneSelf() {
        // Not copying here because the class has no field.
        return new ConcretePrototype1();
    }
}
