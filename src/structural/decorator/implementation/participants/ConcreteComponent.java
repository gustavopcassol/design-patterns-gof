package structural.decorator.implementation.participants;

public class ConcreteComponent implements Component {
    @Override
    public void operation() {
        System.out.println("Called \"operation()\" implemented in \"ConcreteComponent\".");
    }
}
