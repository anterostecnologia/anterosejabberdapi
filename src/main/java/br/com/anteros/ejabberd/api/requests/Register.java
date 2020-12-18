package br.com.anteros.ejabberd.api.requests;

public class Register extends UserHostRequest {
    private final String password;

    public Register(String user, String host, String password) {
        super(user,host);
        this.password = password;
    }
}
