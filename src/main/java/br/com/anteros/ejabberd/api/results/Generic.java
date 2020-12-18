package br.com.anteros.ejabberd.api.results;

import com.google.gson.annotations.SerializedName;

public class Generic {
    private Status status;
    private int code;
    private String message;

    public Status getStatus() {
        return status;
    }

    public int getCode() {
        return code;
    }

    public String getMessage() {
        return message;
    }

    public enum Status {
        @SerializedName("error") ERROR
    }
}
