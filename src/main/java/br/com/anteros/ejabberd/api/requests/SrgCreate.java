package br.com.anteros.ejabberd.api.requests;

import br.com.anteros.ejabberd.api.Request;

public class SrgCreate implements Request {

    private final String group;
    private final String host;
    private final String name;
    private final String description;
    private final String display;

    public SrgCreate(String host, String group, String name) {
        this(host, group, name, group, name);
    }

    public SrgCreate(String host, String group, String name, String display, String description) {
        this.group = group;
        this.host = host;
        this.name = name;
        this.description = description;
        this.display = display;
    }
}
