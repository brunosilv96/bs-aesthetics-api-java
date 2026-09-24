package com.bsaesthetics.bs_aesthetics_api.domain.enterprise;

import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.UUID;

import org.hibernate.annotations.ColumnDefault;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.Generated;
import org.hibernate.annotations.UpdateTimestamp;
import org.hibernate.generator.EventType;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "enterprise")
public class EnterpriseEntity {
    @Id
    @Column(name = "id")
    @ColumnDefault("generate_uuid_v7()")
    @Generated(event = EventType.INSERT)
    private UUID ID;

    @Column(name = "trade_name", nullable = false)
    private String tradeName;

    @Column(name = "cnpj", nullable = false, unique = true, length = 14)
    private String CNPJ;

    @Column(name = "opening_time", nullable = false)
    private LocalTime openingTime;

    @Column(name = "closing_time", nullable = false)
    private LocalTime closingTime;

    @CreationTimestamp
    @Column(name = "created_at")
    private LocalDateTime createdAt;

    @UpdateTimestamp
    @Column(name = "updated_at")
    private LocalDateTime updatedAt;
}
