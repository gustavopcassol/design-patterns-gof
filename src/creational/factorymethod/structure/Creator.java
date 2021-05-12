package creational.factorymethod.structure;

abstract class Creator {
    abstract Product factoryMethod();

    void anOperation() {
        // ...
        Product product = factoryMethod();
        // ...
    }
}
