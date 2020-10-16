package br.com.carloskafka.sishibernateserver.fachadas;

import java.util.List;

import org.apache.log4j.Logger;

import br.com.carloskafka.sishibernatecommons.dtos.ModeloDTO;
import br.com.carloskafka.sishibernatecommons.dtos.ResultadoDTO;
import br.com.carloskafka.sishibernatecommons.dtos.ResultadoListagemDTO;
import br.com.carloskafka.sishibernateserver.dominio.ValidavelObrigatoriedadeETamanhoMaximo;
import br.com.carloskafka.sishibernateserver.fabricas.FabricaBase;

public abstract class Fachada {

	protected final Logger logger;
	public final static String MENSAGEM_DADOS_DESATUALIZADOS = "Os dados foram alterados por outro usuário do sistema. Por favor, tente novamente.";

	protected Fachada() {
		this.logger = Logger.getLogger(getClass());
	}

	@SuppressWarnings({ "rawtypes", "unchecked" })
	protected ResultadoDTO efetuarValidacao(ModeloDTO objetoDto,
			FabricaBase fabrica, String descricaoObjeto,
			ResultadoDTO objetoResultado) {

		ResultadoDTO resultado = objetoResultado;
		try {
			ValidavelObrigatoriedadeETamanhoMaximo objetoDominioValidavel = (ValidavelObrigatoriedadeETamanhoMaximo) fabrica
					.converterParaDominio(objetoDto);
			objetoDominioValidavel
					.validarObrigatoriedadeETamanhoMaximoDeDados();

			if (objetoDominioValidavel.validado()) {
				resultado.efetuadoComSucesso((ModeloDTO) fabrica
						.converterParaDTO(objetoDominioValidavel));
			} else {
				resultado.adicionarErro(objetoDominioValidavel
						.obterDescricaoErros());
			}
		} catch (Exception e) {
			String erro = "Ocorreu um erro durante a validação do "
					+ descricaoObjeto + ".";
			resultado.adicionarErro(erro);
			logger.error(erro + " \nDetalhes: " + e);
		}
		return resultado;
	}

	@SuppressWarnings({ "rawtypes", "unchecked" })
	protected ResultadoListagemDTO obterListagem(List<?> objetosDominio,
			FabricaBase fabrica, String descricaoDaListagem,
			ResultadoListagemDTO objetoResultado) {
		try {
			List<? extends ModeloDTO> objetosDto = fabrica
					.converterParaDTO(objetosDominio);
			objetoResultado.efetuadoComSucesso(objetosDto);
		} catch (Exception e) {
			String erro = "Ocorreu um erro durante a obtenção da lista de "
					+ descricaoDaListagem + ".";
			objetoResultado.adicionarErro(erro);
			logger.error(erro + " \nDetalhes: " + e);
		}
		return objetoResultado;
	}

}