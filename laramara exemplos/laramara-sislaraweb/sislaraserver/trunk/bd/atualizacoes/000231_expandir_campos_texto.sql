﻿ALTER TABLE AGENDAMENTO ALTER COLUMN JUSTIFICATIVA_CANCELAMENTO TYPE varchar(20000);
ALTER TABLE AGENDAMENTO ALTER COLUMN OBS TYPE varchar(20000);
ALTER TABLE DEMANDA ALTER COLUMN OBS TYPE varchar(20000);
ALTER TABLE ESPERA ALTER COLUMN OBS TYPE varchar(20000);
ALTER TABLE ESPERA ALTER COLUMN JUSTIFICATIVA_CANCELAMENTO TYPE varchar(20000);
ALTER TABLE INSTITUICAO ALTER COLUMN OBS TYPE varchar(20000);
ALTER TABLE MODULO_PRE_CADASTRO ALTER COLUMN OBS TYPE varchar(20000);
ALTER TABLE MODULO_USUARIO ALTER COLUMN OBS TYPE varchar(20000);
ALTER TABLE PRE_CADASTRO ALTER COLUMN OBS TYPE varchar(20000);