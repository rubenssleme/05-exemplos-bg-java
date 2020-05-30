-- *****************************************************
-- Tabela..........: USUARIOS
-- Elemento do DER.: Entidade Usuario
-- Funï¿½o..........: Usuarios do sistema.
-- *****************************************************

CREATE DATABASE dbusuario;

USE dbusuario;

DROP TABLE   usuario;

CREATE TABLE IF NOT EXISTS usuarios(
usuario_id INT AUTO_INCREMENT,
nome VARCHAR(50) NOT NULL,   
email  VARCHAR(35) NOT NULL,
tipo  VARCHAR(15) NOT NULL,
login  VARCHAR(32),
senha  VARCHAR(8), 
primary key (usuario_id)
)ENGINE=INNODB;
CREATE INDEX USNOME ON usuarios (nome);
