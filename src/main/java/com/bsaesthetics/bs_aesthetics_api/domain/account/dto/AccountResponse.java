package com.bsaesthetics.bs_aesthetics_api.domain.account.dto;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.UUID;

import com.bsaesthetics.bs_aesthetics_api.domain.account.AccountEntity;
import com.bsaesthetics.bs_aesthetics_api.domain.account.RoleEnum;

public record AccountResponse(
        UUID id,
        String name,
        String email,
        String phone,
        LocalDate birthdate,
        RoleEnum role,
        LocalDateTime createdAt,
        LocalDateTime updatedAt,
        LocalDateTime deletedAt) {
    public static AccountResponse fromEntity(AccountEntity account) {
        return new AccountResponse(
                account.getId(),
                account.getName(),
                account.getEmail(),
                account.getPhone(),
                account.getBirthdate(),
                account.getRole(),
                account.getCreatedAt(),
                account.getUpdatedAt(),
                account.getDeletedAt());
    }
}
