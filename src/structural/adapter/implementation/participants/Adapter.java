package structural.adapter.implementation.participants;

import java.util.Locale;

public class Adapter implements Target {
    private final Adaptee adaptee;

    public Adapter(Adaptee adaptee) {
        this.adaptee = adaptee;
    }

    @Override
    public String request() {
        String text = adaptee.specificRequest();
        return text.toUpperCase(Locale.ENGLISH);
    }
}
