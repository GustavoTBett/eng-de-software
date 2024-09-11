package org.gustavotbett;

public class BuilderXisSalada implements BuilderSanduiche {
    private GeradorSanduiche geradorSanduiche;

    public BuilderXisSalada() {
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

