package org.gustavotbett;

import java.sql.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class BuilderXisEgg implements BuilderSanduiche {
    private GeradorSanduiche geradorSanduiche;

    public BuilderXisEgg() {
        this.geradorSanduiche = new GeradorSanduiche();
    }

    @Override
    public GeradorSanduiche geradorSanduiche() {
        return null;
    }

    @Override
    public void setPao() {
        this.geradorSanduiche.setPao("hamburguer");
    }

    @Override
    public void setCarne() {
        this.geradorSanduiche.setCarne("boi");
    }

    @Override
    public void setSalada() {
        String[] salada = {"alface", "tomate"};
        this.geradorSanduiche.setSalada(salada);
    }

    @Override
    public void setCondimentos() {
        String[] condimentos = {"ketchup", "mostarda"};
        this.geradorSanduiche.setCondimentos(condimentos);
    }
}
