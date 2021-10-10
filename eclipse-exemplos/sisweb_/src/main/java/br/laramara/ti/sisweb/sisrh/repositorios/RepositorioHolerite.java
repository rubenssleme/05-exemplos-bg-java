package br.laramara.ti.sisweb.sisrh.repositorios;

import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

import javax.ejb.Stateless;

import org.apache.commons.io.FileUtils;
import org.apache.commons.io.IOUtils;
import org.primefaces.event.FileUploadEvent;

import br.laramara.ti.sisweb.utilitarios.Configuracao;
import br.laramara.ti.sisweb.utilitarios.Ordenador;

@Stateless
public class RepositorioHolerite {

	private static Set<String> holerites = new TreeSet<>();

	public RepositorioHolerite() {
		if (holerites.isEmpty()) {
			carregarHolerites();
		}
	}

	public List<String> getHolerites() {
		List<String> resultado = new ArrayList<String>(holerites);
		Collections.sort(resultado, new Ordenador());
		return resultado;
	}

	private void carregarHolerites() {
		holerites.clear();
		List<File> arquivos = (List<File>) FileUtils.listFiles(
				new File(Configuracao.obterConfiguracao(this,
						Configuracao.DIRETORIO_PDF)),
				new String[] { Configuracao.obterConfiguracao(this,
						Configuracao.EXTENSAO_RELATORIO) }, false);
		for (File arquivo : arquivos) {
			holerites.add(arquivo.getName());
		}
	}

	public void gravarHolerite(FileUploadEvent event) throws Exception {
		InputStream photoInputStream = event.getFile().getInputstream();

		FileOutputStream photoOutputStream = new FileOutputStream(
				Configuracao
						.obterConfiguracao(this, Configuracao.DIRETORIO_PDF)
						+ event.getFile().getFileName());
		IOUtils.copy(photoInputStream, photoOutputStream);
		photoOutputStream.close();
		photoInputStream.close();		
		carregarHolerites();
	}

	public void setExcluirArquivo(String arquivoSelecionadoParaExclusao) {
		FileUtils.deleteQuietly(new File(Configuracao.obterConfiguracao(this,
				Configuracao.DIRETORIO_PDF) + arquivoSelecionadoParaExclusao));
		carregarHolerites();
	}
}
