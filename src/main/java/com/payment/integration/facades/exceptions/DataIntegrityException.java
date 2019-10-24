package com.payment.integration.facades.exceptions;

public class DataIntegrityException extends RuntimeException {

    public DataIntegrityException(String s) {
        super(s);
    }

    public DataIntegrityException(String s, Throwable throwable) {
        super(s, throwable);
    }
}
