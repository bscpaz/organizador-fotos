package br.com.bscpaz.organizador.exceptions;

public class DataNaoEncontradaException extends Exception {

    private static final long serialVersionUID = 1L;

    public DataNaoEncontradaException(String arquivo) {
        super("Arquivo '" + arquivo + "' não possui data da foto.");
    }

}
