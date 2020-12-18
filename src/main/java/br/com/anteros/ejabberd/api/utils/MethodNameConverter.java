package br.com.anteros.ejabberd.api.utils;

import java.util.Locale;

import br.com.anteros.ejabberd.api.Request;

public class MethodNameConverter {

    public static String convert(Request request) {
       return String.join("_",request.getClass().getSimpleName().split("(?=\\p{Lu})")).toLowerCase(Locale.ENGLISH);
    }
}
