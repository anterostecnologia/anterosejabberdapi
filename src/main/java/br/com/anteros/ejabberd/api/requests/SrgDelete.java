package br.com.anteros.ejabberd.api.requests;

import br.com.anteros.ejabberd.api.Request;

public class SrgDelete implements Request {

    private final String host;
    private final String group;

    public SrgDelete(String host, String group) {
        this.host = host;
        this.group = group;
    }
}
