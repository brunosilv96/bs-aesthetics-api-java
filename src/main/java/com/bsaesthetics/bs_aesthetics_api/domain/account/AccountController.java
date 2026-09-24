package com.bsaesthetics.bs_aesthetics_api.domain.account;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bsaesthetics.bs_aesthetics_api.domain.account.dto.AccountResponse;
import com.bsaesthetics.bs_aesthetics_api.domain.account.dto.RegisterAccountRequest;

import jakarta.validation.Valid;

@RestController
@RequestMapping("/account")
public class AccountController {
    private AccountService service;

    private AccountController(AccountService service) {
        this.service = service;
    }

    @PostMapping("/")
    public ResponseEntity<AccountResponse> register(@Valid @RequestBody RegisterAccountRequest body) {

    }
}
