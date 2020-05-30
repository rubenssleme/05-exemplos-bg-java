package br.com.conexao.persistence;

import java.io.FileInputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.Statement;
import java.util.Properties;

public class Conexao {

	// Conexão
	private Connection connection;
	private Statement statement;
	private String connectionString;
	private String driverjdbc;

	// Informações do Banco
	private String local;
	private String usuario;
	private String senha;
	private String tipoBD;
	private String porta;
	private String nomeBD;

	// Getters e Setters

	public Connection getConnection() {
		return connection;
	}

	public void setConnection(Connection connection) {
		this.connection = connection;
	}

	public Statement getStatement() {
		return statement;
	}

	public void setStatement(Statement statement) {
		this.statement = statement;
	}

	public String getConnectionString() {
		return connectionString;
	}

	public void setConnectionString(String connectionString) {
		this.connectionString = connectionString;
	}

	public String getDriverjdbc() {
		return driverjdbc;
	}

	public void setDriverjdbc(String driverjdbc) {
		this.driverjdbc = driverjdbc;
	}

	public String getLocal() {
		return local;
	}

	public void setLocal(String local) {
		this.local = local;
	}

	public String getUsuario() {
		return usuario;
	}

	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	public String getTipoBD() {
		return tipoBD;
	}

	public void setTipoBD(String tipoBD) {
		this.tipoBD = tipoBD;
	}

	public String getPorta() {
		return porta;
	}

	public void setPorta(String porta) {
		this.porta = porta;
	}

	public String getNomeBD() {
		return nomeBD;
	}

	public void setNomeBD(String nomeBD) {
		this.nomeBD = nomeBD;
	}

	public void inicializarBancoDeDados() {
		try {
			setLocal(ler("local.db"));
			setUsuario(ler("usuario.db"));
			setSenha(ler("senha.db"));

			setTipoBD(ler("tipo.db"));

			setNomeBD(ler("tipo.db"));

			setPorta(ler("porta.db"));

			setNomeBD(ler("nome.db"));

			setBancoDeDados(ler("nome.db"));

		} catch (IOException e) {
		}

		if (getTipoBD().toLowerCase().equals("postgresql")) {
			setConnectionString("jdbc:postgresql://" + getLocal() + ":"
					+ getPorta() + "/" + getNomeBD());
			setDriverjdbc("org.postgresql.Driver");
		} else {
			if (getTipoBD().toLowerCase().equals("mysql")) {
				setConnectionString("jdbc:mysql://" + getLocal() + ":"
						+ getPorta() + "/" + getNomeBD());
				setDriverjdbc("com.mysql.jdbc.Driver");
			} else {
				if (getTipoBD().toLowerCase().equals("sqlserver")) {
					setConnectionString("jdbc:jtds:sqlserver://" + getLocal()
							+ ":" + getPorta() + "/" + getNomeBD());
					setDriverjdbc("net.sourceforge.jtds.jdbc.Driver");
				}
			}
		}
	}
	
	private void setBancoDeDados(String ler) {
		// TODO Auto-generated method stub
		
	}

	public String ler(String nome_da_propriedade)
			throws IOException {
		Properties propriedade = new Properties();
		FileInputStream arquivo = new FileInputStream("application.properties");

		propriedade.load(arquivo);
		String ret = propriedade.getProperty(nome_da_propriedade);
		return ret.toString().replaceAll("\"", "");
	}
}
