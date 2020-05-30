package br.laramara.ti.sisweb.utilitarios;

import java.io.File;
import java.io.FilenameFilter;

import org.apache.commons.io.FileUtils;

public class ArquivoUtils {

	public static void excluirArquivo(File arquivo) {
		if (arquivo.isDirectory()) {
			File[] arquivosObtidos = listarArquivos(arquivo);
			for (File arquivoObtido : arquivosObtidos) {
				FileUtils.deleteQuietly(arquivoObtido);
			}
		}
	}

	private static FilenameFilter filtrar(final String extensao) {
		return new FilenameFilter() {
			public boolean accept(File dir, String filename) {
				return filename.endsWith(extensao);
			}
		};
	}

	public static File[] listarArquivos(String diretorio) {
		File arquivo = new File(diretorio);
		return arquivo.listFiles(filtrar(".pdf"));
	}

	public static File[] listarArquivos(File arquivo) {
		return arquivo.listFiles(filtrar(".pdf"));
	}
}
