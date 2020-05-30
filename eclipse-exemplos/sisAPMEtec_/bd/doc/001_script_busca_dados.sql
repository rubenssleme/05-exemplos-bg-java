/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 * Author:  m7
 * Created: Dec 15, 2016
 */

SELECT  *  FROM TB_FUNCIONARIOS;
SELECT  *  FROM TB_ALUNOS;
SELECT  *  FROM TB_USUARIOS;
SELECT  *  FROM TB_CONTRIBUICOES;
SELECT  *  FROM TB_PRODUTOS;
SELECT  *  FROM TB_VENDAS;
SELECT  *  FROM TB_DESPESAS;
SELECT  *  FROM TB_ITENS;
SELECT  *  FROM TB_CAIXA;


-- Inserts de teste
-- ALUNOS
INSERT INTO TB_ALUNOS(RA_ALUNO, NOME, DATA_NASCIMENTO, IDADE, SEXO, CURSO, PERIODO, MODULO, TELEFONE, E_MAIL, ATIVO)
VALUES(11110, 'José Figueredo', '06/06/1996', 20, 'M', 'Informática', 'Noite', '3º', '3333-3333', 'josef@gmeil.com.br', 1);

INSERT INTO TB_ALUNOS(RA_ALUNO, NOME, DATA_NASCIMENTO, IDADE, SEXO, CURSO, PERIODO, MODULO, TELEFONE, E_MAIL, ATIVO)
VALUES(11111, 'Ana Lisa Dados', '04/04/1994', 22, 'F', 'Administração', 'Manhã', '1º', '4444-4444', 'analize@hotimeil.com', 1);

-- FUNCIONARIOS
INSERT INTO TB_FUNCIONARIOS (NOME, CARGO, SALARIO, DATA_ADMISSAO, CPF, RG, E_MAIL, RUA, NUMERO, CEP, BAIRRO, CIDADE, ESTADO) 
VALUES('Wellington Cidade', 'Coordenador', 50000.00, '11/01/1950', '123.456.789-01', '12.345.678-9', 'well@megahair.com', 'rua', 'numero', '01234-567', 'bairro', 'cidade', 'SP');

INSERT INTO TB_FUNCIONARIOS (NOME, CARGO, SALARIO, DATA_ADMISSAO, CPF, RG, E_MAIL, RUA, NUMERO, CEP, BAIRRO, CIDADE, ESTADO) 
VALUES('João Augusto', 'Atendente', 1000.00, '11/11/2016', '234.345.678-90', '01.234.567-8', 'johnstar@uau.com', 'rua', 'numero', '01234-567', 'bairro', 'cidade', 'SP');

-- USUARIOS
INSERT INTO TB_USUARIOS (NOME, USUARIO, SENHA, PERFIL) 
VALUES ('Administrador', 'admin', 'admin', 'admin');

INSERT INTO TB_USUARIOS (NOME, USUARIO, SENHA, PERFIL) 
VALUES ('Usuário comum', 'user', '123', 'user');

INSERT INTO TB_USUARIOS (NOME, USUARIO, SENHA, PERFIL) 
VALUES ('Wellington Cidade', 'well', '123456', 'admin');

INSERT INTO TB_USUARIOS (NOME, USUARIO, SENHA, PERFIL) 
VALUES ('João Augusto', 'joao', '123', 'user');

-- PRODUTOS
INSERT INTO TB_PRODUTOS(NOME, VALOR, DESCRICAO)
VALUES ('Camiseta', 20.00, 'Camiseta do uniforme do BG');

INSERT INTO TB_PRODUTOS(NOME, VALOR, DESCRICAO)
VALUES ('Jaleco', 40.00, 'Jaleco de Mecânica');

INSERT INTO TB_PRODUTOS(NOME, VALOR, DESCRICAO)
VALUES ('Carteirinha', 20.00, 'Carteirinha de identificação do BG');

INSERT INTO TB_PRODUTOS(NOME, VALOR, DESCRICAO)
VALUES ('Óculos', 10.00, 'Óculos de proteção para oficina de mecânica');

-- CAIXA
INSERT INTO TB_CAIXA(SALDO, DATA, MOVIMENTO, TIPO, DESCRICAO) VALUES (0.00, CURRENT_TIMESTAMP, 0.0, 'Início', 'Abertura do caixa');


-- CRIAR O BANCO - FIM

