package br.com.anteros.ejabberd.api.utils;

import javax.net.ssl.X509TrustManager;
import java.security.cert.CertificateException;
import java.security.cert.X509Certificate;

public class TrustEverythingManager implements X509TrustManager {
    public void checkClientTrusted(X509Certificate[] x509Certificates, String s) throws CertificateException {

    }

    public void checkServerTrusted(X509Certificate[] x509Certificates, String s) throws CertificateException {

    }

    public X509Certificate[] getAcceptedIssuers() {
        return new X509Certificate[0];
    }
}
