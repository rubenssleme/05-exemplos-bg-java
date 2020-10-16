
--CREATE DATABASE db_estudo_java;
-- Table: tb_usuario
-- DROP TABLE tb_usuario;

CREATE TABLE tb_usuario
(
  id_usuario bigserial NOT NULL,
  ds_login character varying(30) NOT NULL,
  ds_senha character varying(30) NOT NULL
)
WITH (
  OIDS=FALSE
);
ALTER TABLE tb_usuario
  OWNER TO postgres;
  


ALTER TABLE tb_pessoa ADD FOREIGN KEY (id_usuario_cadastro) REFERENCES tb_usuario(id_usuario);

INSERT INTO tb_usuario (ds_login,ds_senha) VALUES('a','a');

SELECT * FROM tb_usuario; 






