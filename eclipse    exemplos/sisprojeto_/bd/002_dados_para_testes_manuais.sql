/*Usuario: usuario - Senha - 1234
 Sites para gerar Md5 : md5 generator
http://www.miraclesalad.com/webtools/md5.php
http://www.md5.cz/
http://www.md5.net/md5-generator/

*/
INSERT INTO conta_acesso(usuario, senha) VALUES ('a', '81dc9bdb52d04dc20036dbd8313ed055');

UPDATE  conta_acesso SET usuario = 'a', senha = '0cc175b9c0f1b6a831c399e269772661' ;

DROP TABLE tbLogin;

SELECT * FROM  cliente;
SELECT * FROM  conta_acesso;


            