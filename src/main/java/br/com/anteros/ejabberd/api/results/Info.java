package br.com.anteros.ejabberd.api.results;

public class Info {

    private String key;
    private String value;

    public String getKey() {
        return key;
    }

    public String getValue() {
        return value;
    }

    @Override
    public String toString() {
        return "["+key+":"+value+"]";
    }

}
