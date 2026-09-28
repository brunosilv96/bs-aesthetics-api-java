package com.bsaesthetics.bs_aesthetics_api.domain.account.exception;

public class EmailAlreadyInUseException extends RuntimeException {
    public EmailAlreadyInUseException(String email) {
        super("email is already in use: " + email);
    }
}
