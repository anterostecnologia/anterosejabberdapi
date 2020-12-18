package br.com.anteros.ejabberd.api.requests;

import br.com.anteros.ejabberd.api.Request;

public class SendMessage implements Request {

    private final Type type;
    private final String from;
    private final String to;
    private final String subject;
    private final String body;

    public SendMessage(String from, String to, String subject, String body) {
        this(from, to, subject, body, Type.CHAT);
    }

    public SendMessage(String from, String to, String subject, String body, Type type) {
        this.type = type;
        this.from = from;
        this.to = to;
        this.subject = subject;
        this.body = body;
    }
}
