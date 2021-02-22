package structural.adapter.classadapter.structure;

class Adapter extends Adaptee implements Target {
    @Override
    public void request() {
        specificRequest();
    }
}
