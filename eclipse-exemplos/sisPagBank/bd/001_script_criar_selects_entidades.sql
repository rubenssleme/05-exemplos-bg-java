USE teste;

CREATE TABLE USU_TESTE(
NOME VARCHAR(35),
PERFIL VARCHAR(12),
USUARIO VARCHAR(15),
SENHA VARCHAR(8)
);
#   #


SELECT * FROM USU_TESTE;

INSERT INTO USU_TESTE (nome,perfil,senha,usuario) values('Arthur Leme','Admin','a','a');


update USU_TESTE set nome='Arthur Leme1'
where usuario = 'a';
a');