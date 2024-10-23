package org.gustavotbett;

public class DisplayCelular extends Observer {
    public DisplayCelular(Subject subject) {
        super(subject);
    }

    @Override
    void update(Long temperatura) {
        System.out.println("Temperatura: " + temperatura);
    }
}
