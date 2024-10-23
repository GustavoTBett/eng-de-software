package org.gustavotbett;

public abstract class Observer {
    protected Subject subject;

    public Observer(Subject subject) {
        this.subject = subject;
    }

    abstract void update(Long temperatura);
}
