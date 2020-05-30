package br.laramara.ti.sisweb.sisrh.controladores;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.List;
import java.util.UUID;
import java.util.logging.Logger;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.event.ActionEvent;
import javax.inject.Inject;

import org.primefaces.model.DefaultStreamedContent;
import org.primefaces.model.StreamedContent;

import br.laramara.ti.sisweb.dominio.Sistema;
import br.laramara.ti.sisweb.sisrh.repositorios.RepositorioHolerite;
import br.laramara.ti.sisweb.utilitarios.Configuracao;
import br.laramara.ti.sisweb.utilitarios.Mensagem;
import br.laramara.ti.sisweb.utilitarios.Sessao;

import com.itextpdf.text.Document;
import com.itextpdf.text.pdf.PdfCopy;
import com.itextpdf.text.pdf.PdfReader;
import com.itextpdf.text.pdf.parser.PdfReaderContentParser;
import com.itextpdf.text.pdf.parser.SimpleTextExtractionStrategy;
import com.itextpdf.text.pdf.parser.TextExtractionStrategy;

@ManagedBean
@SessionScoped
public class ControladorHolerites {

	private Logger logger = Logger.getLogger(this.getClass().getPackage()
			.getName());

	@Inject
	private Sessao sessao;
	@Inject
	private RepositorioHolerite repositorioHolerite;

	private StreamedContent holeriteParaDownload;

	public void autorizar() {
		sessao.redirecionarParaPaginaInicialSeNaoEstiverLogadoOuNaoTiverAutorizacao(Sistema.SISRH_ACESSAR_HOLERITE);
	}

	public StreamedContent getHoleriteParaDownload() {
		return holeriteParaDownload;
	}

	public void sair(ActionEvent actionEvent) {
		sessao.sair();
	}

	public void downloadArquivo(ActionEvent actionEvent) {
		holeriteParaDownload = null;
		try {
			String holerite = (String) sessao.obterParametro(Configuracao
					.obterConfiguracao(this, Configuracao.PARAMETRO_HOLERITE));
			String uuid = UUID.randomUUID().toString();
			String arquivoOrigem = Configuracao.obterConfiguracao(this,
					Configuracao.DIRETORIO_PDF) + holerite;
			String arquivoDestino = Configuracao.obterConfiguracao(this,
					Configuracao.DIRETORIO_PDF)
					+ Configuracao.obterConfiguracao(this,
							Configuracao.DIRETORIO_PDF_TEMPORARIO)
					+ uuid
					+ "."
					+ Configuracao.obterConfiguracao(this,
							Configuracao.EXTENSAO_RELATORIO);

			int paginaComHolerite = obterPaginaEncontrada(arquivoOrigem);
			if (paginaComHolerite > 0) {
				obterPagina(arquivoOrigem, arquivoDestino, paginaComHolerite);
				holeriteParaDownload = new DefaultStreamedContent(
						new FileInputStream(arquivoDestino),
						Configuracao.obterConfiguracao(this,
								Configuracao.MIME_PDF), holerite);
				Mensagem.exibirMensagem(FacesMessage.SEVERITY_INFO, "Sucesso",
						"Holerite gerado com sucesso.");
				logger.info("Holerite " + arquivoOrigem
						+ " encontrado para o CPF "
						+ sessao.obterCpfUsuarioLogado());
			} else {
				Mensagem.exibirMensagem(FacesMessage.SEVERITY_ERROR, "Erro",
						"Holerite indisponível.");
				logger.info("Holerite indisponível para o CPF "
						+ sessao.obterCpfUsuarioLogado());
			}

		} catch (Exception e) {
			Mensagem.exibirMensagem(FacesMessage.SEVERITY_ERROR, "Erro",
					e.getMessage());
			logger.severe(e.getMessage());
		}
	}

	private int obterPaginaEncontrada(String arquivoOrigem) throws Exception {
		int pagina = 0;
		int qtdOcorrencias = 0;
		PdfReader reader = new PdfReader(arquivoOrigem);
		PdfReaderContentParser parser = new PdfReaderContentParser(reader);
		for (int i = 1; i <= reader.getNumberOfPages() && pagina == 0; i++) {
			TextExtractionStrategy strategy = parser.processContent(i,
					new SimpleTextExtractionStrategy());
			String conteudo = strategy.getResultantText();
			if (sessao.contemChapa() && (conteudo.contains(sessao.getChapa() + "  - ")
					|| conteudo.contains(sessao.getChapa() + " - "))) {
				pagina = i;
				qtdOcorrencias++;
			}
		}
		reader.close();
		if (qtdOcorrencias == 1) {
			return pagina;
		} else {
			logger.severe("Foi encontrado mais de um holerite.");
			return 0;
		}
	}

	private void obterPagina(String origem, String destino, int pagina)
			throws Exception {
		PdfReader readerO = new PdfReader(origem);
		Document document = new Document();
		PdfCopy copy = new PdfCopy(document, new FileOutputStream(destino));

		document.open();
		copy.addPage(copy.getImportedPage(readerO, pagina));
		copy.close();
		document.close();
		readerO.close();
	}

	public List<String> getHolerites() {
		return repositorioHolerite.getHolerites();
	}
}
