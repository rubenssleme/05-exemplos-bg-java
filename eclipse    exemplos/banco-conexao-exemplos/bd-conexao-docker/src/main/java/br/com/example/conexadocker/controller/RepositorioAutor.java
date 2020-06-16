package br.com.example.conexadocker.controller;

import br.com.example.conexadocker.model.Autor;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;


public class RepositorioAutor extends RepositorioBase implements IRepositorioBase<Autor>{


	public boolean salvar(Autor autor) {
		if (autor != null) {
			//Exibir o valor do objeto Usuario
			//JOptionPane.showMessageDialog(null,usuario.toString());
			System.out.println(autor.toString());
			return true;
		} else {
			System.out.println("Erro ao salvar autor");
			return false;
		}
	}
	public boolean inclui(Autor autor) {
		boolean salvo = false;

		String sqlInsert = "INSERT INTO AUTOR values(? , ?);";
		try {
			Statement stmt = connection.createStatement();
			String sql = "select max(CODIGO_ID_AUT) from AUTOR";
			ResultSet rs = stmt.executeQuery(sql);
			rs.next();
			// Incrementando o ultimo codigo armazenado temos o codigo do novo usuario
			int proximoCodigo = rs.getInt(1) + 1;
			rs.close();
			preparedStatement = connection.prepareStatement(sqlInsert);
			preparedStatement.setInt(1,proximoCodigo);
			preparedStatement.setString(2,autor.getNome());
			preparedStatement.executeUpdate();
			salvo = true;
		} catch (SQLException e) {
			System.out.println("Erro ao salvar no banco de dados: " + e.toString());
		}

		return salvo;
	}

}
