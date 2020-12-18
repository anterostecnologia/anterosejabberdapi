package br.com.anteros.ejabberd.api;

public class InvalidEndpointException extends RuntimeException {

    public InvalidEndpointException(String message) {
        super(message);
    }

    public InvalidEndpointException(String message, Throwable throwable) {
        super(message,throwable);
    }

}
