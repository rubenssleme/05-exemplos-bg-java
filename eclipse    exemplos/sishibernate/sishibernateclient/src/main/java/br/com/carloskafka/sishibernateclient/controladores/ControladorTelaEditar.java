package br.com.carloskafka.sishibernateclient.controladores;

import java.awt.Window;

import br.com.carloskafka.sishibernateclient.utilitarios.ClonadorUtils;
import br.com.carloskafka.sishibernatecommons.dtos.ModeloDTO;

public class ControladorTelaEditar extends ControladorTela {
	protected ModeloDTO objetoDto;

	public ControladorTelaEditar(Window telaPai, ModeloDTO objetoReferenciaDto) {
		super(telaPai);
		this.objetoDto = (ModeloDTO) ClonadorUtils.copiar(objetoReferenciaDto);
	}

}
