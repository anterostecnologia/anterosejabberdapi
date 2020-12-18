package br.com.anteros.ejabberd.api.requests;

import com.google.gson.annotations.SerializedName;

public class SetVcard extends UserHostRequest {
    @SerializedName("name") private final String name;
    @SerializedName("content") private final String content;

    public SetVcard(String user, String host, String name, String content) {
        super(user, host);
        this.name = name;
        this.content = content;
    }
}
