package structural.decorator.structure;

class ConcreteDecoratorB extends Decorator {
    @Override
    public void operation() {
        super.operation();
        addedBehaviour();
    }

    void addedBehaviour() {
    }
}
