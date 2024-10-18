package org.gustavotbett;

public class Main {
    public static void main(String[] args) {

        Usuario usuario = new Usuario("joao", "joao@email.com", "12345678");
        ValidatorFInal val = new ValidatorFInal();

        val.validar(usuario);
    }
}