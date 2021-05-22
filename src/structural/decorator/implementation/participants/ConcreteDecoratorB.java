package structural.decorator.implementation.participants;

public class ConcreteDecoratorB extends Decorator {
    public ConcreteDecoratorB(Component component) {
        super(component);
    }

    @Override
    public void operation() {
        super.operation();
        addedBehaviour();
    }

    private void addedBehaviour() {
        System.out.println("Called \"addedBehaviour()\" implemented in \"ConcreteDecoratorB\".");
    }
}
