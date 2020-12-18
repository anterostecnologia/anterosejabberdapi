package br.com.anteros.ejabberd.api.requests;

public class Unregister extends UserHostRequest {
    public Unregister(String user, String host) {
        super(user, host);
    }
}
