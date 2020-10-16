-- *****************************************************
-- Tabela..........: USUARIO
-- Elemento do DER.: Entidade Usuario
-- Funï¿½o..........: Usuarios do sistema.
-- *****************************************************
DROP TABLE   tb_usuario;
CREATE TABLE tb_usuario (
  CODIGO    TINYINT NOT NULL  PRIMARY KEY,
  NOME      VARCHAR(50) NOT NULL,
  EMAIL  VARCHAR(35) NOT NULL,
  TIPO  VARCHAR(15) NOT NULL,
  LOGIN  VARCHAR(32),
  SENHA  VARCHAR(8) 
);
CREATE INDEX USNOME ON tb_usuario (NOME);

-- *****************************************************
-- Tabela..........: GRUPOPRODUTO
-- Elemento do DER.: Entidade Grupo Produto
-- Funï¿½o..........: Agrupar produtos semelhantes. Tem
--                   ligaï¿½o direta com a tabela
--                   PRODUTO.
-- *****************************************************
CREATE TABLE GRUPOPRODUTO (
  CODIGO    TINYINT NOT NULL AUTO_INCREMENT PRIMARY KEY,
  DESCRICAO VARCHAR(40) NOT NULL,
  COMISSAO  DECIMAL(3,2) NOT NULL DEFAULT 0.0,
  GRUPOPAI  TINYINT REFERENCES GRUPOPRODUTO (CODIGO)
            MATCH FULL ON UPDATE CASCADE
            ON DELETE RESTRICT
);
CREATE INDEX GPDESCRICAO ON GRUPOPRODUTO (DESCRICAO);
CREATE INDEX GPGRUPOPAI ON GRUPOPRODUTO (GRUPOPAI);

-- *****************************************************
-- Tabela..........: PRODUTO
-- Elemento do DER.: Entidade Produto
-- Funï¿½o..........: Cadastro dos produtos que serï¿½
--                   vendidos pelo sistema
-- *****************************************************
CREATE TABLE PRODUTO (
  CODIGO    INT NOT NULL PRIMARY KEY,
  GRUPO     TINYINT NOT NULL
            REFERENCES GRUPOPRODUTO (CODIGO) MATCH FULL
            ON DELETE RESTRICT ON UPDATE CASCADE,
  DESCRICAO VARCHAR(80) NOT NULL,
  APELIDO   VARCHAR(20) NOT NULL,
  UNIDADE   VARCHAR(3) NOT NULL DEFAULT 'UNI',
  FRACAO    VARCHAR(1) NOT NULL DEFAULT 'N',
  DESCONTO  DECIMAL(10,2) NOT NULL DEFAULT 0.0,
  COMISSAO  DECIMAL(5,2) NOT NULL DEFAULT 0.0,
  SITUACAO  VARCHAR(1) NOT NULL DEFAULT 'A'
);
CREATE INDEX PRGRUPO ON PRODUTO (GRUPO);
CREATE INDEX PRDESCRICAO ON PRODUTO (DESCRICAO);
CREATE INDEX PRAPELIDO ON PRODUTO (APELIDO);

-- *****************************************************
-- Tabela..........: CLIENTE
-- Elemento do DER.: Entidade Cliente
-- Funï¿½o..........: Clientes da empresa - parq quem
--                   serï¿½emitida a venda.
-- *****************************************************
CREATE TABLE CLIENTE (
  CODIGO        SMALLINT NOT NULL AUTO_INCREMENT
                PRIMARY KEY,
  NOME          VARCHAR(80) NOT NULL,
  APELIDO       VARCHAR(50) NOT NULL,
  ENDERECO      VARCHAR(80),
  BAIRRO        VARCHAR(40),
  CIDADE        VARCHAR(30),
  ESTADO        VARCHAR(2),
  CEP           VARCHAR(8),
  TEL1          VARCHAR(10),
  TEL2          VARCHAR(10),
  FAX           VARCHAR(10),
  EMAIL         VARCHAR(80),
  CPF           VARCHAR(11),
  IDENTIDADE    VARCHAR(20),
  CNPJ          VARCHAR(14),
  INSCEST       VARCHAR(20),
  DATACADASTRO  TIMESTAMP NOT NULL,
  TIPO          VARCHAR(20),
  CADASTRO      TINYINT NOT NULL
                REFERENCES USUARIO (CODIGO) MATCH FULL
                ON UPDATE CASCADE ON DELETE RESTRICT,
  VENDEDOR      TINYINT NOT NULL
                REFERENCES USUARIO (CODIGO) MATCH FULL
                ON UPDATE CASCADE ON DELETE RESTRICT,
  SITUACAO      VARCHAR(1) NOT NULL DEFAULT 'V'
);
CREATE INDEX CLNOME ON CLIENTE (NOME);
CREATE INDEX CLAPELIDO ON CLIENTE (APELIDO);
CREATE INDEX CLCPF ON CLIENTE (CPF);
CREATE INDEX CLCNPJ ON CLIENTE (CNPJ);
CREATE INDEX CLCADASTRO ON CLIENTE (CADASTRO);
CREATE INDEX CLVENDEDOR ON CLIENTE (VENDEDOR);

-- *****************************************************
-- Tabela..........: REFERENCIA
-- Elemento do DER.: Entidade Referencia
-- Funï¿½o..........: Referencias de clientes
-- *****************************************************
CREATE TABLE REFERENCIA (
  CODIGO          SMALLINT NOT NULL
                  REFERENCES CLIENTE (CODIGO) MATCH FULL
                  ON UPDATE CASCADE ON DELETE CASCADE,
  NUMERO          TINYINT NOT NULL AUTO_INCREMENT,
  NOME            VARCHAR(40) NOT NULL,
  TELEFONE        VARCHAR(10) NOT NULL,
  CONTATO         VARCHAR(20) NOT NULL,
  DTULTIMACOMPRA  DATE NOT NULL,
  VLULTIMACOMPRA  DECIMAL(10,2) NOT NULL,
  DTMAIORCOMPRA   DATE NOT NULL,
  CLMAIORCOMPRA   DECIMAL(10,2) NOT NULL,
  ANOCADASTRO     SMALLINT,
  CONCEITO        VARCHAR(20),
  OBSERVACAO      VARCHAR(200),
  PRIMARY KEY (CODIGO,NUMERO)
);

-- *****************************************************
-- Tabela..........: FORMAPAGTO
-- Elemento do DER.: Entidade Forma Pagto
-- Funï¿½o..........: Formas de pagamento aceitas na
--                   empresa
-- *****************************************************
CREATE TABLE FORMAPAGTO (
  CODIGO     TINYINT NOT NULL AUTO_INCREMENT PRIMARY KEY,
  DESCRICAO  VARCHAR(30) NOT NULL,
  PRAZO      VARCHAR(1) NOT NULL DEFAULT 'S',
  PESOCOM    DECIMAL(5,2) NOT NULL DEFAULT 1,
  PESODESC   DECIMAL(5,2) NOT NULL DEFAULT 1,
  SITUACAO   VARCHAR(1) DEFAULT 'A'
);
CREATE INDEX FPDESCRICAO ON FORMAPAGTO (DESCRICAO);

-- *****************************************************
-- Tabela..........: VENDA
-- Elemento do DER.: Entidade Venda
-- Funï¿½o..........: Registro de vendas de produtos
-- *****************************************************
CREATE TABLE VENDA (
  NUMERO        INT NOT NULL AUTO_INCREMENT PRIMARY KEY,
  DATA          TIMESTAMP NOT NULL,
  VENDEDOR      TINYINT NOT NULL
                REFERENCES USUARIO (CODIGO) MATCH FULL
                ON UPDATE CASCADE ON DELETE RESTRICT,
  CLIENTE       SMALLINT NOT NULL
                REFERENCES CLIENTE (CODIGO) MATCH FULL
                ON UPDATE CASCADE ON DELETE RESTRICT,
  TIPOPAGTO     VARCHAR(1) NOT NULL DEFAULT 'V',
  TIPODOCUMENTO VARCHAR(1) NOT NULL DEFAULT 'O',
  INFORMACOES   VARCHAR(100),
  VENDAFINAL    INT REFERENCES VENDA (NUMERO) MATCH FULL
                ON UPDATE CASCADE ON DELETE SET NULL,
  USREGISTRO    TINYINT NOT NULL
                REFERENCES USUARIO (CODIGO) MATCH FULL
                ON UPDATE CASCADE ON DELETE RESTRICT,
  DTESTORNO     DATETIME,
  USESTORNO     TINYINT
                REFERENCES USUARIO (CODIGO) MATCH FULL
                ON UPDATE CASCADE ON DELETE SET NULL,
  MOTIVOESTORNO VARCHAR(100)
);
CREATE INDEX VEDATA ON VENDA (DATA);
CREATE INDEX VEVENDEDOR ON VENDA (VENDEDOR);
CREATE INDEX VECLIENTE ON VENDA (CLIENTE);
CREATE INDEX VEVENDAFINAL ON VENDA (VENDAFINAL);
CREATE INDEX VEUSREGISTRO ON VENDA (USREGISTRO);
CREATE INDEX VEDTESTORNO ON VENDA (DTESTORNO);
CREATE INDEX VEUSESTORNO ON VENDA (USESTORNO);

-- *****************************************************
-- Tabela..........: ITEMVENDA
-- Elemento do DER.: Relacionamento Estï¿½entre as
--                   entidades Venda e Produto.
-- Funï¿½o..........: Itens vendidos
-- *****************************************************
CREATE TABLE ITEMVENDA (
  VENDA       INT NOT NULL
              REFERENCES VENDA (NUMERO) MATCH FULL
              ON UPDATE CASCADE ON DELETE CASCADE,
  SEQUENCIA   TINYINT NOT NULL AUTO_INCREMENT,
  PRODUTO     INT NOT NULL
              REFERENCES PRODUTO (CODIGO) MATCH FULL
              ON UPDATE CASCADE ON DELETE RESTRICT,
  QUANTIDADE  DECIMAL(10,2) NOT NULL DEFAULT 1.0,
  PRECOVENDA  DECIMAL(10,2) NOT NULL,
  PRECOLISTA  DECIMAL(10,2) NOT NULL,
  PRIMARY KEY (VENDA,SEQUENCIA)
);
CREATE INDEX IVPRODUTO ON ITEMVENDA (PRODUTO);

-- *****************************************************
-- Tabela..........: PAGAMENTO
-- Elemento do DER.: Relacionamento Paga entre Venda e
--                   Forma Pagto
-- Funï¿½o..........: Registra o pagamento da venda
-- *****************************************************
CREATE TABLE PAGAMENTO (
  VENDA       INT NOT NULL
              REFERENCES VENDA (NUMERO) MATCH FULL
              ON UPDATE CASCADE ON DELETE CASCADE,
  SEQUENCIA   TINYINT NOT NULL AUTO_INCREMENT,
  FORMAPAGTO  TINYINT NOT NULL
              REFERENCES FORMAPAGTO (CODIGO) MATCH FULL
              ON UPDATE CASCADE ON DELETE RESTRICT,
  VENCIMENTO  DATE NOT NULL,
  VALOR       DECIMAL(10,2) NOT NULL,
  PRIMARY KEY (VENDA,SEQUENCIA)
);
CREATE INDEX PGFORMAPAGTO ON PAGAMENTO (FORMAPAGTO);
CREATE INDEX PGVENCIMENTO ON PAGAMENTO (VENCIMENTO);
