package structural.adapter.objectadapter.structure;

class Adapter implements Target {
    private Adaptee adaptee;

    @Override
    public void request() {
        adaptee.specificRequest();
    }
}
