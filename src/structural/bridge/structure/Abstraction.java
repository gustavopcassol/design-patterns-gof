package structural.bridge.structure;

// TODO: finish structure, is still WIP.
abstract class Abstraction {
    private Implementor imp;

    void operation() {
        imp.operationImp();
    }
}
