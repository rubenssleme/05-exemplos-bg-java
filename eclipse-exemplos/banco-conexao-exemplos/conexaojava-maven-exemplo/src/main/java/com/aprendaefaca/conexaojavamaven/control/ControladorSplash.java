package com.aprendaefaca.conexaojavamaven.control;

import java.sql.ResultSet;
import java.sql.SQLException;

import com.aprendaefaca.conexaojavamaven.persistence.ConexaoBD;
import com.aprendaefaca.conexaojavamaven.utilitarios.Criptografia;

public class ControladorSplash extends ConexaoBD {

	private static final String NOME_TABELA_TBLOGIN = "tbLogin";
	private static final String NOME_TABELA_TBPRODUTOS = "tbProdutos";

	private static final String COMANDO_CRIAR_TABELA_TBPRODUTOS = "create table \""
			+ NOME_TABELA_TBPRODUTOS
			+ "\""
			+ "( "
			+ "      id bigserial not null,"
			+ "	     nome varchar(50) not null,"
			+ "	     categoria varchar(100) not null,"
			+ "      preco numeric not null,"
			+ "      constraint pk_id primary key (id)" + "); ";

	private static final String COMANDO_CRIAR_TABELA_TBLOGIN = "create table \""
			+ NOME_TABELA_TBLOGIN
			+ "\""
			+ "( "
			+ "      id bigserial not null,"
			+ "	     usuario varchar(50) not null,"
			+ "      senha varchar(50) not null,"
			+ "      constraint primarykey_id primary key (id)" + "); ";

	private static final String COMANDO_VERIFICAR_ROOT = "SELECT * FROM \""
			+ NOME_TABELA_TBLOGIN + "\" WHERE usuario = 'admin'";
	private static final String COMANDO_INSERIR_ROOT = "INSERT INTO \""
			+ NOME_TABELA_TBLOGIN + "\" VALUES (DEFAULT, 'admin','"
			+ Criptografia.criptografar("1234") + "')";

	public void inicializarBD() {
		StringBuilder sb = new StringBuilder();

		// Inicializacao de Tabelas
		// Tabela tbProdutos
		sb.append(COMANDO_CRIAR_TABELA_TBPRODUTOS);

		// Tabela tbLogin
		sb.append(COMANDO_CRIAR_TABELA_TBLOGIN);

		try {
			getStatement().execute(sb.toString());
			System.out.println("Executado com sucesso");
		} catch (SQLException e) {
			// System.out.println("As tabelas ja existem no banco de dados");
			System.out.println(e);
		}

		// Usuario padr�o
		try {
			ResultSet rs = getStatement().executeQuery(COMANDO_VERIFICAR_ROOT);
			if (!(rs.next())) {
				getStatement().execute(COMANDO_INSERIR_ROOT);
				System.out.println("Inserido com sucesso");
			} else {
				System.out.println("Usuario existente");
			}
		} catch (SQLException e1) {
			e1.printStackTrace();
		}	
		
	}
}
