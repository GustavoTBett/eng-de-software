package org.gustavotbett;

public class DisplayPainel extends Observer{
    public DisplayPainel(Subject subject) {
        super(subject);
    }

    @Override
    void update(Long temperatura) {
        System.out.println("Temperatura: " + temperatura);
    }
}
