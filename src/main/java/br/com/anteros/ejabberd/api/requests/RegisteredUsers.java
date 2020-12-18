package br.com.anteros.ejabberd.api.requests;

import br.com.anteros.ejabberd.api.Request;

public class RegisteredUsers implements Request {
    private final String host;

    public RegisteredUsers(String host) {
        this.host = host;
    }
}
