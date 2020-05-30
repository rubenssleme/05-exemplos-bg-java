package br.com.carloskafka.sishibernatecommons.dtos.cliente;

import br.com.carloskafka.sishibernatecommons.dtos.ResultadoDTO;

public class ResultadoEdicaoClienteDTO extends ResultadoDTO {

	private static final long serialVersionUID = 3569479888192117969L;

	public void efetuadoComSucesso(ClienteDTO objetoDtoEditado) {
		efetuadoComSucesso(DADOS_ARMAZENADOS_COM_SUCESSO, objetoDtoEditado);
	}
}
