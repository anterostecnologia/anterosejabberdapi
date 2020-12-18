package br.com.anteros.ejabberd.api.requests;

import br.com.anteros.ejabberd.api.Request;

public class SrgGetInfo implements Request {

    private final String group;
    private final String host;

    public SrgGetInfo(String host, String group) {
        this.group = group;
        this.host = host;
    }
}
