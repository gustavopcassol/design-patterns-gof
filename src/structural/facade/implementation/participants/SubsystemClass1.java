package structural.facade.implementation.participants;

import java.util.Locale;

class SubsystemClass1 {
    String operation(String text) {
        return text.toUpperCase(Locale.ENGLISH);
    }
}
