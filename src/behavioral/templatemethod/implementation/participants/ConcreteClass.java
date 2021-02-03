package behavioral.templatemethod.implementation.participants;

public class ConcreteClass extends AbstractClass {
    @Override
    protected void primitiveOperation1() {
        System.out.println("Called \"primitiveOperation1()\" implemented in \"ConcreteClass\".");
    }

    @Override
    protected void primitiveOperation2() {
        System.out.println("Called \"primitiveOperation2()\" implemented in \"ConcreteClass\".");
    }
}
