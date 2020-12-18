package br.com.anteros.ejabberd.api;

public class RequestFailedException extends Exception {

    private int code;

    RequestFailedException(String message, Throwable throwable) {
        super(message,throwable);
    }

    RequestFailedException(Throwable throwable) {
        super(throwable);
    }

    RequestFailedException(String message) {
        super(message);
    }

    RequestFailedException(String message, int code) {
        super(message);
        this.code = code;
    }

    public int getCode() {
        return code;
    }
}
