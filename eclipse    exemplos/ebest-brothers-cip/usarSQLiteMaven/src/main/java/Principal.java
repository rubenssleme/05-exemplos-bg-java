public class Principal {
	public static void main(String[] args) {
		Banco.conectar("banco");
		Banco.criarTabela("CREATE TABLE IF NOT EXISTS RC_TEST( ID INTEGER, NOME VARCHAR )");
		Banco.inserirRegistro("INSERT INTO RC_TEST( ID, NOME) VALUES (1, 'Rubens-1'), (3, 'Rubenito-1')");
		Banco.lendoRegistro("select * from RC_TEST");
	}

}
