CREATE TABLE IF NOT EXISTS client(
    id SERIAL PRIMARY KEY,
    name varchar(200) NOT NULL CHECK (length(name) >= 3 and length(name <= 500))
);

CREATE TABLE IF NOT EXISTS planet(
    id varchar(200) PRIMARY KEY NOT NULL CHECK (length(name) >= 1)  CONSTRAINT id_format_check CHECK (id ~ '^[A-Z0-9]+$'),
    name varchar(500) NOT NULL CHECK (length(name) >= 1 and length(name <= 500))
);

CREATE TABLE IF NOT EXISTS ticket(
    id SERIAL PRIMARY KEY,
    create_at TIMESTAMP WITH TIME ZONE DEFAULT CURRENT_TIMESTAMP,
    client_id BIGINT REFERENCES client(id),
    from_planet VARCHAR(200) references planet(id),
    to_planet varchar(200) references planet(id)
);