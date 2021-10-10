/* Create Tables */
CREATE TABLE conta_acesso(
	id INT IDENTITY NOT NULL,
	usuario VARCHAR(100) NOT NULL,
	senha VARCHAR(100) NOT NULL,
	primary key (id)
);

CREATE TABLE cliente
(
	id INT IDENTITY NOT NULL,
	nome VARCHAR(100),
	cnpj VARCHAR(100),
	razao_social VARCHAR(100),
	email VARCHAR(100),
	telefone VARCHAR(100),
	PRIMARY KEY (id)
);

CREATE TABLE fornecedor
(
	id INT IDENTITY NOT NULL,
	nome VARCHAR(100),
	nome_fantasia VARCHAR(100),
	cnpj VARCHAR(100),
	PRIMARY KEY (id)
);
