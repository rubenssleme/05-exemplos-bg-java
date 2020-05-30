/* Drop Tables */

DROP TABLE IF EXISTS cliente;
/* Create Tables */

CREATE TABLE cliente
(
	id integer identity NOT NULL,
	nome varchar (100),
	cpf varchar(12),
	email varchar(100),
	telefone varchar(100),
	PRIMARY KEY (id)
);

SELECT * FROM CLIENTE;