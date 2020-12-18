package br.com.anteros.ejabberd.api.requests;

import br.com.anteros.ejabberd.api.Request;

public class SrgUserAdd implements Request {
    private final String user;
    private final String host;
    private final String group;
    private final String grouphost;

    public SrgUserAdd(String host, String group, String user, String grouphost) {
        this.user = user;
        this.host = host;
        this.group = group;
        this.grouphost = grouphost;
    }
}
