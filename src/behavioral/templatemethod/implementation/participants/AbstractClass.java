package behavioral.templatemethod.implementation.participants;

abstract class AbstractClass {
    public final void templateMethod() {
        primitiveOperation1();
        primitiveOperation2();
    }

    protected abstract void primitiveOperation1();

    protected abstract void primitiveOperation2();
}
