package com.bsaesthetics.bs_aesthetics_api.domain.account;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AccountRepository extends JpaRepository<AccountEntity, UUID> {
    boolean existsByEmail(String email);
}
