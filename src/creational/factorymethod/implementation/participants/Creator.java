package creational.factorymethod.implementation.participants;

public abstract class Creator {
    abstract Product factoryMethod();

    public void anOperation() {
        Product product = factoryMethod();
        product.operation();
    }
}
