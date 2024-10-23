package org.gustavotbett;

import java.util.ArrayList;
import java.util.List;

public class AtualizaTemp extends Subject{
    private List<Long> temperatures;

    @Override
    void notifyObservers() {
        for (int i = 0; i < this.observers.size(); i++) {
            for (int j = 0; j < this.temperatures.size(); j++) {
                this.observers.get(i).update(temperatures.get(j));
            }
        }
    }

    void atualiza() {
        this.temperatures = new ArrayList<Long>();
        temperatures.add(36l);

        this.notifyObservers();
    }
}
