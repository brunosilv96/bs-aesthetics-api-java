CREATE TABLE enterprise (
    id UUID PRIMARY KEY DEFAULT generate_uuid_v7(),
    trade_name VARCHAR(255) NOT NULL,
    cnpj VARCHAR(255) NOT NULL,
    opening_time TIME NOT NULL,
    closing_time TIME NOT NULL,
    created_at TIMESTAMP NOT NULL DEFAULT now(),
    updated_at TIMESTAMP,

    CONSTRAINT uk_enterprise_cnpj UNIQUE (cnpj)
);