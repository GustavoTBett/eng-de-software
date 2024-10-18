package org.gustavotbett;

public class ValidatorEmail implements Validator {
    private Validator validator;

    @Override
    public void setValidator(Validator validator) {
        this.validator = validator;
    }

    @Override
    public void validar(Usuario dados) throws Exception {
        if (dados.getEmail() != null && !dados.getEmail().contains("@")) {
            throw new Exception("Erro ao validar email");
        }
        if (validator != null) {
            validator.validar(dados);
        }
    }
}
