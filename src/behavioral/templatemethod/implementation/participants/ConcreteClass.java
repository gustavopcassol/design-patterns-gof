package behavioral.templatemethod.implementation.participants;

public class ConcreteClass extends AbstractClass {
    @Override
    void primitiveOperation1() {
        System.out.println("Called \"primitiveOperation1()\" implemented in \"ConcreteClass\".");
    }

    @Override
    void primitiveOperation2() {
        System.out.println("Called \"primitiveOperation2()\" implemented in \"ConcreteClass\".");
    }
}
