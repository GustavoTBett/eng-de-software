package org.gustavotbett;

public class Main {
    public static void main(String[] args) {
        AtualizaTemp atualizaTemp = new AtualizaTemp();

        DisplayCelular displayCelular = new DisplayCelular(atualizaTemp);
        DisplayPainel dIsplayPainel = new DisplayPainel(atualizaTemp);

        atualizaTemp.registerObserver(displayCelular);
        atualizaTemp.registerObserver(dIsplayPainel);

        atualizaTemp.atualiza();
    }
}