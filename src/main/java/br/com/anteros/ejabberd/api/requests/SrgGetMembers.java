package br.com.anteros.ejabberd.api.requests;

import br.com.anteros.ejabberd.api.Request;

public class SrgGetMembers implements Request {

    private final String group;
    private final String host;

    public SrgGetMembers(String host, String group) {
        this.group = group;
        this.host = host;
    }
}
