package br.com.anteros.ejabberd.api.requests;

public class CheckAccount extends UserHostRequest {

    public CheckAccount(String user, String host) {
        super(user, host);
    }
}
