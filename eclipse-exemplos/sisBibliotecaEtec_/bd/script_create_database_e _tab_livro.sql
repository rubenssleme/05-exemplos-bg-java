*********** POSTGRESQL *******************

OBS: Os comandos podem ser diferentes no Postgresql!


CREATE DATABASE biblioteca_development;


CREATE TABLE livros
(
id BIGSERIAL NOT NULL,
codigo character varying(15),
genero character varying(20),
isbn character varying(50),
titulo character varying(50),
autor character varying(50),
editora character varying(50),
tema character varying(100),
anopublicacao character varying(4),
ativo character(1),
status character(1),
PRIMARY KEY (id));