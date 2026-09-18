CREATE TABLE account (
    id UUID PRIMARY KEY DEFAULT generate_uuid_v7(),
    name VARCHAR(255) NOT NULL,
    email VARCHAR(255) NOT NULL,
    password VARCHAR(255) NOT NULL,    
    phone VARCHAR(20) NOT NULL,
    birthdate DATE NOT NULL,
    role VARCHAR(20) NOT NULL,
    created_at TIMESTAMP NOT NULL DEFAULT now(),
    updated_at TIMESTAMP,
    deleted_at TIMESTAMP,

    CONSTRAINT uq_account_email UNIQUE (email),
    CONSTRAINT chk_account_role CHECK (role IN ('ADMIN', 'CLIENT'))
);

CREATE INDEX idx_account_email ON account (email);
CREATE INDEX idx_account_deleted_at ON account (deleted_at) WHERE deleted_at IS NULL;