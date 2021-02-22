package structural.adapter.classadapter.implementation.participants;

class Adapter extends Adaptee implements Target {
    @Override
    public void request() {
        specificRequest();
    }
}
