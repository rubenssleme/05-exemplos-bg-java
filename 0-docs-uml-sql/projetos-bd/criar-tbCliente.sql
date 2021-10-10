-- Table: "tbCliente"

-- DROP TABLE "tbCliente";

CREATE TABLE "tbCliente"
(
  id bigserial NOT NULL,
  nome character varying(35),
  cpf character varying(14),
  endereco character varying(35),
  CONSTRAINT "tbCliente_pkey" PRIMARY KEY (id)
)
WITH (
  OIDS=FALSE
);
ALTER TABLE "tbCliente"
  OWNER TO postgres;
