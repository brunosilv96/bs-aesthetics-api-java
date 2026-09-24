package com.bsaesthetics.bs_aesthetics_api.domain.account;

import org.springframework.stereotype.Service;

import com.bsaesthetics.bs_aesthetics_api.domain.account.dto.RegisterAccountRequest;
import com.bsaesthetics.bs_aesthetics_api.domain.account.dto.AccountResponse;

import jakarta.transaction.Transactional;

@Service
public class AccountService {
    private AccountRepository repository;

    public AccountService(AccountRepository repository) {
        this.repository = repository;
    }

    @Transactional
    public AccountResponse register(RegisterAccountRequest payload) {
        // if (condition) {

        // }

        return new AccountResponse();
    }
}
