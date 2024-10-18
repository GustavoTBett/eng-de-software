package org.gustavotbett;

public class ValidatorNome implements Validator {
    private Validator validator;

    @Override
    public void setValidator(Validator validator) {
        this.validator = validator;
    }

    @Override
    public void validar(Usuario dados) throws Exception {
        if (dados.getNome() != null && dados.getNome().length() < 3) {
            throw new Exception("Erro ao validar nome");
        }
        if (validator != null) {
            validator.validar(dados);
        }
    }
}
