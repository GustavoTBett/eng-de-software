package org.gustavotbett;

public class GeradorSanduiche {
    protected String pao;
    protected String carne;
    protected String[] salada;
    protected String[] condimentos;

    public String getPao() {
        return pao;
    }

    public void setPao(String pao) {
        this.pao = pao;
    }

    public String getCarne() {
        return carne;
    }

    public void setCarne(String carne) {
        this.carne = carne;
    }

    public String[] getSalada() {
        return salada;
    }

    public void setSalada(String[] salada) {
        this.salada = salada;
    }

    public String[] getCondimentos() {
        return condimentos;
    }

    public void setCondimentos(String[] condimentos) {
        this.condimentos = condimentos;
    }
}
