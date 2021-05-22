package structural.decorator.implementation.participants;

public class ConcreteDecoratorA extends Decorator {
    private final int addedState;

    public ConcreteDecoratorA(Component component, int addedState) {
        super(component);
        this.addedState = addedState;
    }

    @Override
    public void operation() {
        super.operation();
        addedBehaviour();
    }

    private void addedBehaviour() {
        System.out.println("Called \"addedBehaviour()\" implemented in \"ConcreteDecoratorA\", " +
                "with \"addedState\" as " + addedState + ".");
    }
}
