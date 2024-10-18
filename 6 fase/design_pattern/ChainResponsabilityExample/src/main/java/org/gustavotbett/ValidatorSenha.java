package org.gustavotbett;

public class ValidatorSenha implements Validator {
    private Validator validator;

    @Override
    public void setValidator(Validator validator) {
        this.validator = validator;
    }

    @Override
    public void validar(Usuario dados) throws Exception {
        if (dados.getSenha() != null && dados.getSenha().length() < 8) {
            throw new Exception("Erro ao validar a senha");
        }
        if (validator != null) {
            validator.validar(dados);
        }
    }
}
