package com.company.creational.singleton.structure;

class Singleton {
    private static Singleton uniqueInstance;
    private int singletonData;

    static Singleton instance() {
        return uniqueInstance;
    }

    void singletonOperation() {
    }

    int getSingletonData() {
        return singletonData;
    }
}
