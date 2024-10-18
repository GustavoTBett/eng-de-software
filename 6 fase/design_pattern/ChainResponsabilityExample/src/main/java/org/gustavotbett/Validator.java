package org.gustavotbett;

public interface Validator {

    void setValidator(Validator validator);

    void validar(Usuario dados) throws Exception;
}
