package br.com.carloskafka.sishibernateserver.fachadas;

import javax.inject.Inject;

import org.springframework.stereotype.Component;

import br.com.carloskafka.sishibernatecommons.dtos.cliente.ClienteDTO;
import br.com.carloskafka.sishibernatecommons.dtos.cliente.ResultadoEdicaoClienteDTO;
import br.com.carloskafka.sishibernatecommons.dtos.cliente.ResultadoListagemClienteDTO;
import br.com.carloskafka.sishibernateserver.dominio.cliente.Cliente;
import br.com.carloskafka.sishibernateserver.fabricas.FabricaCliente;
import br.com.carloskafka.sishibernateserver.repositorio.RepositorioCliente;

@Component
public class FachadaCliente extends Fachada {
	@Inject
	private RepositorioCliente repositorioCliente;

	public synchronized ResultadoEdicaoClienteDTO editarCliente(
			ClienteDTO clienteDto) {
		Cliente cliente = new FabricaCliente().converterParaDominio(clienteDto);
		cliente.validarObrigatoriedadeETamanhoMaximoDeDados();

		ResultadoEdicaoClienteDTO resultado = new ResultadoEdicaoClienteDTO();
		if (clienteDto.getVersao().equals(cliente.getVersao())) {
			if (cliente.validado()) {
				Cliente clienteSalvo = repositorioCliente.salvar(cliente);
				resultado.efetuadoComSucesso(new FabricaCliente()
						.converterParaDTO(clienteSalvo));
			} else {
				resultado.adicionarErro(cliente.obterDescricaoErros());
			}
		} else {
			logger.error(Fachada.MENSAGEM_DADOS_DESATUALIZADOS);
			resultado.adicionarErro(Fachada.MENSAGEM_DADOS_DESATUALIZADOS);
		}
		return resultado;
	}

	public ResultadoListagemClienteDTO obterListagemClientes() {
		return (ResultadoListagemClienteDTO) obterListagem(
				repositorioCliente.obterTodos(), new FabricaCliente(),
				"Clientes", new ResultadoListagemClienteDTO());
	}

}
