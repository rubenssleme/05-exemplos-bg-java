package br.laramara.ti.sisweb.sisrh.controladores;

import java.util.List;
import java.util.logging.Logger;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.inject.Inject;

import org.primefaces.event.FileUploadEvent;

import br.laramara.ti.sisweb.dominio.Sistema;
import br.laramara.ti.sisweb.sisrh.repositorios.RepositorioHolerite;
import br.laramara.ti.sisweb.utilitarios.Mensagem;
import br.laramara.ti.sisweb.utilitarios.Sessao;

@ManagedBean
@SessionScoped
public class ControladorAdministracaoHolerites {

	private Logger logger = Logger.getLogger(this.getClass().getPackage()
			.getName());

	@Inject
	private Sessao sessao;
	@Inject
	private RepositorioHolerite repositorioHolerite;

	public void autorizar() {
		sessao.redirecionarParaPaginaInicialSeNaoEstiverLogadoOuNaoTiverAutorizacao(Sistema.SISRH_ADMINISTRACAO);
	}

	public List<String> getHolerites() {
		return repositorioHolerite.getHolerites();
	}

	public void gravarHolerite(FileUploadEvent event) throws Exception {
		try {
			repositorioHolerite.gravarHolerite(event);
			Mensagem.exibirMensagem(FacesMessage.SEVERITY_INFO, "Sucesso",
					event.getFile().getFileName() + " foi enviado com sucesso.");
		} catch (Exception e) {
			Mensagem.exibirMensagem(FacesMessage.SEVERITY_ERROR, "Erro",
					e.getMessage());
			logger.severe(e.getMessage());
		}
	}

	public void setExcluirArquivo(String arquivoSelecionadoParaExclusao) {
		repositorioHolerite.setExcluirArquivo(arquivoSelecionadoParaExclusao);
	}
}
