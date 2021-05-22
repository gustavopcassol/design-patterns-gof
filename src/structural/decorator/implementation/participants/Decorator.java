package structural.decorator.implementation.participants;

abstract class Decorator implements Component {
    private final Component component;

    Decorator(Component component) {
        this.component = component;
    }

    @Override
    public void operation() {
        component.operation();
    }
}
