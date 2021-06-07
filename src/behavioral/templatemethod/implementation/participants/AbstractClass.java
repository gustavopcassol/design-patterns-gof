package behavioral.templatemethod.implementation.participants;

public abstract class AbstractClass {
    public final void templateMethod() {
        primitiveOperation1();
        primitiveOperation2();
    }

    abstract void primitiveOperation1();

    abstract void primitiveOperation2();
}
