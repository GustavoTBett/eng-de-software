package org.gustavotbett;

import java.util.ArrayList;
import java.util.List;

public abstract class Subject {
    protected List<Observer> observers = new ArrayList<Observer>();

    void registerObserver(Observer observer) {
        observers.add(observer);
    }

    void unregisterObserver(Observer observer) {
        observers.remove(observer);
    }

    abstract void notifyObservers();
}
