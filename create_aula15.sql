DROP TABLE IF EXISTS enderecos;
CREATE TABLE IF NOT EXISTS enderecos (
    id INT AUTO_INCREMENT PRIMARY KEY,
    rua VARCHAR(64),
    numero VARCHAR(8),
    cidade VARCHAR(32),
    bairro VARCHAR(32)
);

DROP TABLE IF EXISTS pacientes;
CREATE TABLE IF NOT EXISTS pacientes (
    id INT AUTO_INCREMENT PRIMARY KEY,
    nome VARCHAR(32),
    sobrenome VARCHAR(32),
    rg VARCHAR(10),
    data_cadastro VARCHAR(10),
    id_endereco INT,
    FOREIGN KEY (id_endereco) REFERENCES enderecos(id)
);