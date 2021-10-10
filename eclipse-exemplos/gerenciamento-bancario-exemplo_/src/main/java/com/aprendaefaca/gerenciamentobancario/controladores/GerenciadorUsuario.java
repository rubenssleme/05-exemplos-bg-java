package com.aprendaefaca.gerenciamentobancario.controladores;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import com.aprendaefaca.gerenciamentobancario.modelos.Usuario;
import com.aprendaefaca.gerenciamentobancario.persistencia.AcessoBD;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;


/* 
 * Todos os atributos e metodos dessa classe s�o estaticos para poderem ser utilizados 
 * em qualquer parte do projeto sem a necessidade de instanciar um objeto do tipo GerenciadorUsuario
 */

public class GerenciadorUsuario {
		
	// Declara��o de um array do tipo ArrayList como atributo da classe
	private static ArrayList<Usuario> vetorUsuarios = new ArrayList<Usuario>();
	
	
	// get e set do atributo vetorUsuarios
	public static ArrayList<Usuario> getVetorUsuarios() {
		return vetorUsuarios;
	}

	public static void setVetorUsuarios(ArrayList<Usuario> vetorUsuarios) {
		GerenciadorUsuario.vetorUsuarios = vetorUsuarios;
	}

	
	// Metodos de manipula��o do array
	
	public static void incluirUsuario(Usuario usu){
		vetorUsuarios.add(usu);
	}
	
	public static void alterarUsuario(Usuario usu, int indice){
		vetorUsuarios.set(indice, usu);
	}
	
	public static void excluirUsuario(int indice){
		vetorUsuarios.remove(indice);
	}
	
	
	public static void consultarUsuario(){

		// Declara uma String para listar os usuarios 
		String relacao = "Rela��o de usuarios Cadastrados\n";
                AcessoBD connBD = new AcessoBD(); 
		Connection con = null;
		
		// Declara e inicializa um contador
		int cont = 0;
                con =  connBD.Conecta();//DriverManager.getConnection(urlBanco, usuarioBanco, senhaBanco);

		// Percorre o array e monta a String com seus dados
		while (cont < vetorUsuarios.size()) {
			relacao = relacao + "\n" + cont + " - " + vetorUsuarios.get(cont).getNome() + " - " + vetorUsuarios.get(cont).getLogin() + " - " + vetorUsuarios.get(cont).getSenha();
			cont++;
		}
		
		// Apresenta os usuarios armazenados no array
		JOptionPane.showMessageDialog(null, relacao + "\n");

	}
        
        
   
        
        
        // *** Metodo de inclusao de usuarios
	public void Incluir(Usuario usu) {
                
            // Objeto usr do tipo Usuario para armazenar os dados lidos da tela
	
	
	// Objeto usrBD do tipo UsuarioBD para persistencia no banco
	
                AcessoBD connBD = new AcessoBD(); 
		Connection con = null;
		PreparedStatement ps = null;

		try {
			//Class.forName(servidor);
			con =  connBD.Conecta();//DriverManager.getConnection(urlBanco, usuarioBanco, senhaBanco);

			// O campo usuCod na tabela usuarios eh do tipo int. 
			// Para inserir um novo usuario eh necessario obter o proximo codigo
			// A funcao max() retorna o maior valor da coluna especificada
			// (nesse caso o ultimo codigo armazenado)
			Statement stmt = con.createStatement();
			String sql = "select max(usuCod) from usuarios";
			ResultSet rs = stmt.executeQuery(sql);
			rs.next();
			// Incrementando o ultimo codigo armazenado temos o codigo do novo usuario
			int proximoCodigo = rs.getInt(1) + 1;
			rs.close();

			// Aqui utilizamos a classe PreparedStatement que permite a insercao de 
			// parametros (?) na construcao da string de SQL
			String sqlInsert = "insert into usuarios values(?, ?, ?, ?, ?, ?);";	

			ps = con.prepareStatement(sqlInsert);				
			ps.setInt(1, proximoCodigo);
			ps.setString(2, usu.getNome());				
			ps.setString(3, usu.getEmail());
			ps.setString(4, usu.getTipo());
			ps.setString(5, usu.getLogin());
			ps.setString(6, usu.getSenha());
			ps.executeUpdate();


		
		} catch (Exception e) {
			e.printStackTrace();

		} finally{

			try{
				ps.close();
				con.close();

			}catch(Exception e){
				e.printStackTrace();
			}

		}

	}  
        

        public void Consulta(){
                 AcessoBD connBD = new AcessoBD(); 
		Connection con = null;
                //usu.setCodigo(Integer.parseInt(txtCodigo.getText()));
               

		//Connection con = null;

		try {
			con =  connBD.Conecta();//DriverManager.getConnection(urlBanco, usuarioBanco, senhaBanco);
                        // Class.forName(servidor);
			//con = DriverManager.getConnection(urlBanco, usuarioBanco, senhaBanco);

			Statement stmt = con.createStatement();
			//String sql = strSQL;
                        String sql = "select * from usuarios where usuCod > 0" ;//+ //usu.getCodigo();

			//A classe ResultSet permite colher os resultados da execucao de uma query no banco de dados. 
			//Esta classe apresenta uma serie de metodos para prover o acesso aos dados
			ResultSet rs = stmt.executeQuery(sql);

			String relacao = "Relação de usuarios cadastrados \n";		
			while (rs.next()) {
				// A rs tem o formato de uma matriz onde o retorno de uma consulta pode ser tratado 
				// como muma tabela. O metodo next pula para a proxima linha.
				// Os metodos de acesso aos dados contidos na rs sao gets especificos para o tipo de dado armazenado. 
				// Identifica-se o campo desejado pelo seu referente indice (coluna) na linha acessada
				relacao = relacao + "\n Cod: " + rs.getString(1).toString() + " - Nome: " + rs.getString(2) + " - Email: " + rs.getString(3) + " - Tipo: " + rs.getString(4) + " - Login: " + rs.getString(5) + " - Senha: " + rs.getString(6);
				// Observe que rs.getString(1) equivale ao codigo que por sua vez eh int, mas, como a intencao 
				// eh montar uma String de mensagem o dados pode ser recuperado ja com seu tipo convertido
			}
			rs.close();
			// Apresenta o resultado da consulta
			JOptionPane.showMessageDialog(null, relacao + "\n");			

		
		} catch (SQLException e) {
			e.printStackTrace();

			/*	
		Eh importante liberar os recursos alocados pelo banco de dados para a execucao da manipulacao dos dados. 
		Podemos fazer isso fechando o Statement, que libera os recursos associados a execucao desta consulta 
		mas deixa a conexao aberta para a execucao de uma proxima consulta, ou fechando diretamente a conexao, 
		que encerra a comunicacao com o banco de dados. 
		Para termos certeza de que vamos encerrar esta conexao mesmo que uma excecao ocorra, 
		reservamos o fechamento para a clausula finally() do tratamento de excecoes.
			 */	

		} finally{

			try{
				con.close();

			}catch(Exception e){
				e.printStackTrace();
			}

		}

        }
        
        
        
        
}
