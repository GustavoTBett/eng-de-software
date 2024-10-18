package org.gustavotbett;

public class ValidatorFInal {
    public void validar(Usuario dados) {
        ValidatorNome validatorNome = new ValidatorNome();
        ValidatorEmail validatorEmail = new ValidatorEmail();
        ValidatorSenha validatorSenha = new ValidatorSenha();

        validatorNome.setValidator(validatorEmail);
        validatorEmail.setValidator(validatorSenha);

        try {
            validatorNome.validar(dados);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

        System.out.println("Sucesso");
    }
}
