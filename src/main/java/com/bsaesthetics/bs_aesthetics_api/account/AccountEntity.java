package com.bsaesthetics.bs_aesthetics_api.account;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.UUID;

import org.hibernate.annotations.ColumnDefault;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.Generated;
import org.hibernate.annotations.UpdateTimestamp;
import org.hibernate.generator.EventType;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "account")
public class AccountEntity {
    @Id
    @Column(name = "id")
    @ColumnDefault("generate_uuid_v7()")
    @Generated(event = EventType.INSERT)
    private UUID ID;

    @Column(nullable = false)
    private String name;

    @Column(nullable = false, unique = true)
    private String email;

    @Column(nullable = false)
    private String password;

    @Column(nullable = false)
    private String phone;

    @Column(nullable = false)
    private LocalDate birthdate;

    @Column(nullable = false)
    @Enumerated(EnumType.STRING)
    private Role role;

    @CreationTimestamp
    @Column(name = "created_at")
    private LocalDateTime createdAt;

    @UpdateTimestamp
    @Column(name = "updated_at")
    private LocalDateTime updatedAt;

    @Column(name = "deleted_at")
    private LocalDateTime deletedAt;

    public AccountEntity() {
    };

    public AccountEntity(UUID iD, String name, String email, String password, String phone, LocalDate birthdate,
            Role role, LocalDateTime createdAt, LocalDateTime updatedAt, LocalDateTime deletedAt) {
        ID = iD;
        this.name = name;
        this.email = email;
        this.password = password;
        this.phone = phone;
        this.birthdate = birthdate;
        this.role = role;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
        this.deletedAt = deletedAt;
    }
}

enum Role {
    ADMIN,
    CLIENT
}
