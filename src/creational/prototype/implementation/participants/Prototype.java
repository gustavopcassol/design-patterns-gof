package creational.prototype.implementation.participants;

interface Prototype {
    // The method was renamed from "clone" because Object class has one with that name.
    Prototype cloneSelf();
}
