package structural.decorator.structure;

abstract class Decorator implements Component {
    private Component component;

    @Override
    public void operation() {
        component.operation();
    }
}
