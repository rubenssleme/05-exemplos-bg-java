﻿CREATE TABLE AREA_FORMACAO
(
	ID BIGSERIAL NOT NULL,
	NOME VARCHAR(100) NOT NULL,
	PRIMARY KEY (ID)
) WITHOUT OIDS;


CREATE TABLE CARGO
(
	ID BIGSERIAL NOT NULL,
	NOME VARCHAR(100) NOT NULL,
	PRIMARY KEY (ID)
) WITHOUT OIDS;

ALTER TABLE INFORMACAO_EDUCACIONAL ADD COLUMN ID_AREA_FORMACAO BIGINT;

CREATE TABLE INFORMACAO_TRABALHO_COMPLETA
(
	ID BIGSERIAL NOT NULL,
	ID_LOCAL_TRABALHO BIGINT NOT NULL,
	ID_CARGO BIGINT NOT NULL,
	DATA_INICIAL_VIGENCIA TIMESTAMP NOT NULL,
	DATA_FINAL_VIGENCIA TIMESTAMP,
	VOLUNTARIO VARCHAR(5),
	ENCAMINHADO_POR_LARAMARA VARCHAR(5),
	PRIMARY KEY (ID)
) WITHOUT OIDS;

CREATE TABLE LOCAL_TRABALHO
(
	ID BIGSERIAL NOT NULL,
	NOME VARCHAR(100) NOT NULL,
	PRIMARY KEY (ID)
) WITHOUT OIDS;

ALTER TABLE USUARIO ADD COLUMN TIPO_LEITURA VARCHAR(25);
ALTER TABLE USUARIO ADD COLUMN TAMANHO_FONTE VARCHAR(100);
ALTER TABLE USUARIO ADD COLUMN ATUALMENTE_TRABALHANDO VARCHAR(5);

CREATE TABLE USUARIO_INFORMACAO_TRABALHO_COMPLETA
(
	ID_INFORMACAO_TRABALHO_COMPLETA BIGINT NOT NULL,
	ID_USUARIO BIGINT NOT NULL
) WITHOUT OIDS;

CREATE TABLE USUARIO_RECURSO
(
	ID_RECURSO BIGINT NOT NULL,
	ID_USUARIO BIGINT NOT NULL
) WITHOUT OIDS;


ALTER TABLE INFORMACAO_EDUCACIONAL
	ADD FOREIGN KEY (ID_AREA_FORMACAO)
	REFERENCES AREA_FORMACAO (ID)
	ON UPDATE RESTRICT
	ON DELETE RESTRICT
;

ALTER TABLE INFORMACAO_TRABALHO_COMPLETA
	ADD FOREIGN KEY (ID_CARGO)
	REFERENCES CARGO (ID)
	ON UPDATE RESTRICT
	ON DELETE RESTRICT
;

ALTER TABLE USUARIO_INFORMACAO_TRABALHO_COMPLETA
	ADD FOREIGN KEY (ID_INFORMACAO_TRABALHO_COMPLETA)
	REFERENCES INFORMACAO_TRABALHO_COMPLETA (ID)
	ON UPDATE RESTRICT
	ON DELETE RESTRICT
;

ALTER TABLE INFORMACAO_TRABALHO_COMPLETA
	ADD FOREIGN KEY (ID_LOCAL_TRABALHO)
	REFERENCES LOCAL_TRABALHO (ID)
	ON UPDATE RESTRICT
	ON DELETE RESTRICT
;

ALTER TABLE USUARIO_RECURSO
	ADD FOREIGN KEY (ID_RECURSO)
	REFERENCES RECURSO (ID)
	ON UPDATE RESTRICT
	ON DELETE RESTRICT
;

ALTER TABLE USUARIO_INFORMACAO_TRABALHO_COMPLETA
	ADD FOREIGN KEY (ID_USUARIO)
	REFERENCES USUARIO (ID)
	ON UPDATE RESTRICT
	ON DELETE RESTRICT
;

ALTER TABLE USUARIO_RECURSO
	ADD FOREIGN KEY (ID_USUARIO)
	REFERENCES USUARIO (ID)
	ON UPDATE RESTRICT
	ON DELETE RESTRICT
;