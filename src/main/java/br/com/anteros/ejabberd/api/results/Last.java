package br.com.anteros.ejabberd.api.results;

import java.time.Instant;

public class Last {

    private Instant timestamp;
    private String status;

    public Instant getTimestamp() {
        return timestamp;
    }

    public String getStatus() {
        return status;
    }
}
