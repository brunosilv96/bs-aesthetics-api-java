CREATE TABLE procedure (
    id UUID PRIMARY KEY DEFAULT generate_uuid_v7(),
    name VARCHAR(255) NOT NULL,
    registered_by UUID NOT NULL,
    description TEXT NOT NULL,
    banner_url VARCHAR(2048),
    price NUMERIC(10,2) NOT NULL,
    duration_minutes INTEGER NOT NULL,
    available BOOLEAN NOT NULL DEFAULT TRUE,
    created_at TIMESTAMP NOT NULL DEFAULT now(),
    updated_at TIMESTAMP,
    deleted_at TIMESTAMP,

    CONSTRAINT ck_procedure_price    CHECK (price >= 0),
    CONSTRAINT ck_procedure_duration CHECK (duration_minutes > 0),
    CONSTRAINT fk_procedure_registered_by FOREIGN KEY (registered_by) REFERENCES account (id)
);

CREATE INDEX idx_procedure_registered_by ON procedure (registered_by);