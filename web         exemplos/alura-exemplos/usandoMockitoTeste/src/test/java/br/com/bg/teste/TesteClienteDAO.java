package br.com.bg.teste;

import static org.junit.Assert.*;

import org.junit.Test;
import org.mockito.Mock;

import br.com.bg.modelo.Cliente;
import br.com.bg.usandomokitoteste.dao.ClienteDAO;

public class TesteClienteDAO {
	
	
	
	
	@Mock
	private ClienteDAO daoMock;
	
	
	
	@Test()
	public void TesteCadastroClienteMock() {
		daoMock = new ClienteDAO();
		Cliente cliente = new Cliente();
		cliente.setNome("rubens");
		cliente.setProfissao("Analista");
		cliente.setEndereco("Rua Guaipa");
		assertEquals("Teste", "sucesso",daoMock.persiste(cliente));
		
	}
	

}
