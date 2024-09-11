package org.gustavotbett;

public class DiretorSanduiche {
    private BuilderSanduiche builderSanduiche;

    public DiretorSanduiche(BuilderSanduiche builderSanduiche) {
        this.builderSanduiche = builderSanduiche;
    }

    public void setBuilderSanduiche(BuilderSanduiche builderSanduiche) {
        this.builderSanduiche = builderSanduiche;
    }

    void criaXis() {
        this.builderSanduiche.setPao();
        this.builderSanduiche.setCarne();
        this.builderSanduiche.setSalada();
        this.builderSanduiche.setCondimentos();
    }

    void criaXisSemSalada() {
        this.builderSanduiche.setPao();
        this.builderSanduiche.setCarne();
        this.builderSanduiche.setCondimentos();
    }

    void criaXisSemCondimentos() {
        this.builderSanduiche.setPao();
        this.builderSanduiche.setCarne();
        this.builderSanduiche.setSalada();
    }
}
