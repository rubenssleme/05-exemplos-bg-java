﻿
/* Drop Table */
DROP TABLE IF EXISTS PESSOA_EXEMPLO;





SELECT * FROM PESSOA_EXEMPLO;


/*Create Tables */
CREATE TABLE PESSOA_EXEMPLO
(
ID BIGSERIAL NOT NULL,
NOME VARCHAR(100) NOT NULL,
DATA_NASC TIMESTAMP NOT NULL,
EMAIL VARCHAR(150) NULL,
PRIMARY KEY (ID)
)WITHOUT OIDS;


