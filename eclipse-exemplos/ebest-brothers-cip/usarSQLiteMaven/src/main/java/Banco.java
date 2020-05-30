import java.sql.*;

public class Banco {
	static Statement statement = null;
	static Connection connection = null;

	// Métodos conectar
	public static Statement conectar(String dataBase) {
		try {
			connection = DriverManager.getConnection("jdbc:sqlite:"+dataBase +".db");
			System.out.println("Conexão com banco realizada com sucesso!");
			statement = connection.createStatement();
		} catch (SQLException e) {
			System.out.println(e.getMessage());
		}
		return statement;
	}

	// criando uma tabela
	public static void criarTabela(String sql) {
		try {
			// criando uma tabela
			statement.execute(sql);  //"CREATE TABLE IF NOT EXISTS RC_TEST( ID INTEGER, NOME VARCHAR )"
		} catch (SQLException e) {
			System.out.println(e.getMessage());
		}
	}

	// inserindo registros
	public static void inserirRegistro(String sql) {
		try {
			// inserindo registros
			statement.execute(sql);
		} catch (SQLException e) {
			System.out.println(e.getMessage());
		}
	}

	// lendo os registros
	public static void lendoRegistro(String sql) {
		try {
			// lendo os registros
			PreparedStatement stmt = connection.prepareStatement(sql);
			ResultSet resultSet = stmt.executeQuery();

			while (resultSet.next()) {
				Integer id = resultSet.getInt("ID");
				String nome = resultSet.getString("NOME");
				System.out.println(id + " - " + nome);
			}

		} catch (SQLException e) {
			System.out.println(e.getMessage());
		}
	}

}
