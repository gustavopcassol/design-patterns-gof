package structural.facade.implementation.participants;

public class Facade {
    public void operation(String text) {
        SubsystemClass1 subsystemClass1 = new SubsystemClass1();
        String operationResult = subsystemClass1.operation(text);
        SubsystemClass2 subsystemClass2 = new SubsystemClass2();
        subsystemClass2.operation(operationResult);
    }
}
