package br.com.infnet.exception;

public class HeroiInvalidoException extends RuntimeException {
    public HeroiInvalidoException (String message){
        super(message);
    }
}
