package br.com.bg.conexaoJavaMysqlDocker.persistencia;

import java.io.FileInputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.Statement;
import java.util.Properties;

public class Conexao {

	// Conex�o
	private Connection connection;
	private Statement statement;
	private String connectionString;
	private String driverjdbc;

	// Informa��es do Banco
	private String local;
	private String usuario;
	private String senha;
	private String nomeBD;
	private String porta;
	private String bancodedados;

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

	public String getNomeBD() {
		return nomeBD;
	}

	public void setNomeBD(String nomeBD) {
		this.nomeBD = nomeBD;
	}

	public String getPorta() {
		return porta;
	}

	public void setPorta(String porta) {
		this.porta = porta;
	}

	public String getBancoDeDados() {
		return bancodedados;
	}

	public void setBancoDeDados(String bancodedados) {
		this.bancodedados = bancodedados;
	}

	public void inicializarBancoDeDados() {
		try {
			setLocal(ler("local.db"));
			setUsuario(ler("usuario.db"));
			setSenha(ler("senha.db"));
			setNomeBD(ler("tipo.db"));
			setPorta(ler("porta.db"));
			setBancoDeDados(ler("nome.db"));
		} catch (IOException e) {
		}

		if (getNomeBD().toLowerCase().equals("postgresql")) {
			setConnectionString("jdbc:postgresql://" + getLocal() + ":"
					+ getPorta() + "/" + getBancoDeDados());
			setDriverjdbc("org.postgresql.Driver");
		} else {
			if (getNomeBD().toLowerCase().equals("mysql")) {
				setConnectionString("jdbc:mysql://" + getLocal() + ":"
						+ getPorta() + "/" + getBancoDeDados());
				setDriverjdbc("com.mysql.jdbc.Driver");
			} else {
				if (getNomeBD().toLowerCase().equals("sqlserver")) {
					setConnectionString("jdbc:jtds:sqlserver://" + getLocal()
							+ ":" + getPorta() + "/" + getBancoDeDados());
					setDriverjdbc("net.sourceforge.jtds.jdbc.Driver");
				}
			}
		}

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
