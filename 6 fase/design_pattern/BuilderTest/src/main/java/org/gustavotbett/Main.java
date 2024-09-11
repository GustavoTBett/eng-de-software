package org.gustavotbett;

public class Main {
    public static void main(String[] args) {
        BuilderXisEgg builderXisEgg = new BuilderXisEgg();
        BuilderXisSalada builderXisSalada = new BuilderXisSalada();

        DiretorSanduiche diretorSanduiche = new DiretorSanduiche(builderXisSalada);
        diretorSanduiche.criaXis();
        System.out.println(builderXisSalada.geradorSanduiche().toString());
    }
}