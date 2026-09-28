package com.bsaesthetics.bs_aesthetics_api.domain.account;

import org.springframework.stereotype.Service;

import com.bsaesthetics.bs_aesthetics_api.domain.account.dto.RegisterAccountRequest;
import com.bsaesthetics.bs_aesthetics_api.domain.account.exception.EmailAlreadyInUseException;
import com.bsaesthetics.bs_aesthetics_api.config.SecurityConfig;
import com.bsaesthetics.bs_aesthetics_api.domain.account.dto.AccountResponse;

import jakarta.transaction.Transactional;

@Service
public class AccountService {
    private final AccountRepository repository;
    private final SecurityConfig security;

    public AccountService(AccountRepository repository, SecurityConfig security) {
        this.repository = repository;
        this.security = security;
    }

    @Transactional
    public AccountResponse register(RegisterAccountRequest payload) {
        if (repository.existsByEmail(payload.email)) {
            throw new EmailAlreadyInUseException(payload.email);
        }

        AccountEntity account = new AccountEntity(
                payload.name,
                payload.email,
                security.passwordEncoder().encode(payload.password),
                payload.phone,
                payload.birthdate,
                payload.role);

        AccountEntity saved = repository.save(account);

        return AccountResponse.fromEntity(saved);
    }
}
