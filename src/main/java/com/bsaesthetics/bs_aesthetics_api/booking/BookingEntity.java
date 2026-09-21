package com.bsaesthetics.bs_aesthetics_api.booking;

import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.UUID;

import org.hibernate.annotations.ColumnDefault;
import org.hibernate.annotations.Generated;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;
import org.hibernate.generator.EventType;

import jakarta.persistence.Column;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.Id;

public class BookingEntity {
    @Id
    @Column(name = "id")
    @ColumnDefault("generate_uuid_v7()")
    @Generated(event = EventType.INSERT)
    private UUID ID;

    @Column(name = "procedure_id", nullable = false)
    private UUID procedureID;

    @Column(name = "start_time", nullable = false)
    private LocalTime startTime;

    @Column(name = "end_time", nullable = false)
    private LocalTime endTime;

    @Column(nullable = false)
    @Enumerated(EnumType.STRING)
    private BookingStatus status;

    @CreationTimestamp
    @Column(name = "created_at")
    private LocalDateTime createdAt;

    @UpdateTimestamp
    @Column(name = "updated_at")
    private LocalDateTime updatedAt;

    @Column(name = "deleted_at")
    private LocalDateTime deletedAt;
}

enum BookingStatus {
    CONFIRMED,
    PENDING,
    IN_PROGRESS,
    COMPLETED,
    CANCELED,
    NO_SHOW,
    REJECTED,
    RESCHEDULED
}