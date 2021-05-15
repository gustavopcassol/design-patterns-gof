package behavioral.templatemethod.structure;

abstract class AbstractClass {
    void templateMethod() {
        // ...
        primitiveOperation1();
        // ...
        primitiveOperation2();
        // ...
    }

    abstract void primitiveOperation1();

    abstract void primitiveOperation2();
}
