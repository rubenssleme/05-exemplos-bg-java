﻿CREATE TABLE EMPRESA
(
	ID BIGSERIAL NOT NULL,
	NOME VARCHAR(100),
	PRIMARY KEY (ID)
) WITHOUT OIDS;

CREATE TABLE PATROCINIO
(
	ID BIGSERIAL NOT NULL,
	ID_EMPRESA BIGINT NOT NULL,
	VALOR DECIMAL NOT NULL,
	PRIMARY KEY (ID)
) WITHOUT OIDS;

CREATE TABLE PROJETO_PATROCINIO
(
	ID_PROJETO BIGINT NOT NULL,
	ID_PATROCINIO BIGINT NOT NULL
) WITHOUT OIDS;

ALTER TABLE PATROCINIO
	ADD FOREIGN KEY (ID_EMPRESA)
	REFERENCES EMPRESA (ID)
	ON UPDATE RESTRICT
	ON DELETE RESTRICT
;

ALTER TABLE PROJETO_PATROCINIO
	ADD FOREIGN KEY (ID_PATROCINIO)
	REFERENCES PATROCINIO (ID)
	ON UPDATE RESTRICT
	ON DELETE RESTRICT
;

ALTER TABLE PROJETO_PATROCINIO
	ADD FOREIGN KEY (ID_PROJETO)
	REFERENCES PROJETO (ID)
	ON UPDATE RESTRICT
	ON DELETE RESTRICT
;