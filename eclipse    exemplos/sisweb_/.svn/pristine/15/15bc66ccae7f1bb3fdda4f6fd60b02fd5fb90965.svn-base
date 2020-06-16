
/* Drop Tables */

DROP TABLE IF EXISTS livro;
DROP TABLE IF EXISTS usuario_sistemas;
DROP TABLE IF EXISTS usuario;




/* Create Tables */

CREATE TABLE livro
(
	id bigserial NOT NULL,
	titulo varchar(100),
	autor varchar(100),
	assunto varchar(100),
	local_armazenado varchar(100),
	aaat varchar(100),
	volume varchar(100),
	tipo varchar(100),
	status boolean DEFAULT 'true',
	PRIMARY KEY (id)
) WITHOUT OIDS;


CREATE TABLE usuario
(
	cpf varchar(11) NOT NULL,
	senha varchar(32) NOT NULL,
	email varchar(200),
	ativo boolean DEFAULT 'true' NOT NULL,
	PRIMARY KEY (cpf)
) WITHOUT OIDS;


CREATE TABLE usuario_sistemas
(
	cpf varchar(11) NOT NULL,
	descricao varchar(100)
) WITHOUT OIDS;



/* Create Foreign Keys */

ALTER TABLE usuario_sistemas
	ADD FOREIGN KEY (cpf)
	REFERENCES usuario (cpf)
	ON UPDATE RESTRICT
	ON DELETE RESTRICT
;



