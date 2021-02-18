package structural.adapter.implementation.participants;

class Adapter implements Target {
    private Adaptee adaptee;

    @Override
    public void request() {
        adaptee.specificRequest();
    }
}
