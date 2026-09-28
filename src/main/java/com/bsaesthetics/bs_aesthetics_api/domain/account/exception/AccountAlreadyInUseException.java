package com.bsaesthetics.bs_aesthetics_api.domain.account.exception;

import java.util.UUID;

public class AccountAlreadyInUseException extends RuntimeException {
    public AccountAlreadyInUseException(UUID id) {
        super("account id not found: " + id);
    }
}
