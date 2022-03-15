CREATE TABLE IF NOT EXISTS filiais (
    id INT auto_increment PRIMARY KEY,
    nome VARCHAR(64),
    rua VARCHAR(64),
    numero VARCHAR(8),
    cidade VARCHAR(32),
    estado VARCHAR(2),
    cincoEstrelas BOOLEAN
);
