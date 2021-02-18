package structural.adapter.structure;

class Adapter implements Target {
    private Adaptee adaptee;

    @Override
    public void request() {
        adaptee.specificRequest();
    }
}
