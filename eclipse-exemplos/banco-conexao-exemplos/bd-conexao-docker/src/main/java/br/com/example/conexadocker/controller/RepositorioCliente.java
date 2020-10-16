package br.com.example.conexadocker.controller;

import br.com.example.conexadocker.model.Cliente;
import br.com.example.conexadocker.model.Usuario;

import java.sql.SQLException;
import java.util.List;

public class RepositorioCliente extends RepositorioBase implements IRepositorioBase<Cliente> {



	public boolean salvar(Cliente cliente) {
		if (cliente != null) {
			//Exibir o valor do objeto Usuario
			//JOptionPane.showMessageDialog(null,usuario.toString());
			System.out.println(cliente.toString());
			return true;
		} else {
			return false;
		}

	}

	public boolean inclui(Cliente cliente) {
		boolean salvo = false;

		String sqlInsert = "INSERT INTO CLIENTE values(?, ?, ?, ?, ?, ?, ?, ?, ?, ?);";
		try {
			preparedStatement = connection.prepareStatement(sqlInsert);
			preparedStatement.setString(1,cliente.getLogin());
			preparedStatement.setString(2,cliente.getSenha());
			preparedStatement.setString(3,cliente.getNome());
			preparedStatement.setString(3,cliente.getTelefone());
			preparedStatement.setString(4,cliente.getCpf());
			preparedStatement.setString(5,cliente.geteMail());
			preparedStatement.setString(6,cliente.getEndereco());
			preparedStatement.setString(7,cliente.getBairro());
			preparedStatement.setString(8,cliente.getCidade());
			preparedStatement.setString(9,cliente.getUf());
			preparedStatement.setString(10,cliente.getCep());
			preparedStatement.executeUpdate();
		} catch (SQLException e) {
			System.out.println("Erro ao salvar no banco de dados: " + e.toString());
		}

		return salvo;
	}



	public boolean altera(Cliente entidade) {
		// TODO Auto-generated method stub
		return false;
	}

	public boolean excluir(Long id) {
		// TODO Auto-generated method stub
		return false;
	}

	public List<Usuario> obterTodos() {
		// TODO Auto-generated method stub
		return null;
	}

	public Usuario obterPorId(Long id) {
		// TODO Auto-generated method stub
		return null;
	}
}
