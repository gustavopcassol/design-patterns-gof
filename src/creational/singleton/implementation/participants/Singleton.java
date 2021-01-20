package creational.singleton.implementation.participants;

public final class Singleton {
    private static Singleton uniqueInstance;
    private int singletonData;

    private Singleton() {
    }

    public static Singleton instance() {
        if (uniqueInstance == null) {
            uniqueInstance = new Singleton();
        }
        return uniqueInstance;
    }

    public void singletonOperation(int data) {
        singletonData = data;
    }

    public int getSingletonData() {
        return singletonData;
    }
}
