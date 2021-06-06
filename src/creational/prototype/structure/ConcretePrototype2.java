package creational.prototype.structure;

class ConcretePrototype2 implements Prototype {
    @Override
    public ConcretePrototype2 cloneSelf() {
        // Not copying here because the class has no field.
        return new ConcretePrototype2();
    }
}
