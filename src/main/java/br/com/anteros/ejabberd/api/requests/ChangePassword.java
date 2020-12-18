package br.com.anteros.ejabberd.api.requests;

import com.google.gson.annotations.SerializedName;

public class ChangePassword extends UserHostRequest {
    @SerializedName("newpass") private final String newPassword;

    public ChangePassword(String user, String host, String newPassword) {
        super(user, host);
        this.newPassword = newPassword;
    }
}
