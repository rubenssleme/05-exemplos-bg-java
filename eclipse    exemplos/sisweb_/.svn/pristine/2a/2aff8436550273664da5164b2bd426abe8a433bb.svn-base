package br.laramara.ti.sisweb.utilitarios;

import java.io.InputStream;
import java.util.Properties;
import java.util.logging.Logger;

public class Configuracao {

	private static Logger logger = Logger.getLogger(Configuracao.class
			.getName());

	private static Properties arquivoPropriedades;

	public static final String DIRETORIO_PDF = "diretorio.pdf";
	public static final String EXTENSAO_RELATORIO = "extensao.relatorio";
	public static final String DIRETORIO_PDF_TEMPORARIO = "diretorio.temporario";
	public static final String PARAMETRO_HOLERITE = "parametro.holerite";
	public static final String MIME_PDF = "mime.pdf";
	public static final String CLASSE_DRIVER_ORACLE = "classe.driver.oracle";
	public static final String CLASSE_DRIVER_POSTGRES = "classe.driver.postgres";
	public static final String PORTA_APLICACAO = "porta.aplicacao";

	public static final String ARQUIVO_CONFIGURACAO = "application.properties";
	public static final String CAMINHO_CONEXAO_ORACLE = "caminho.conexao.oracle";
	public static final String USUARIO_ORACLE = "usuario.oracle";
	public static final String SENHA_ORACLE = "senha.oracle";
	
	public static final String CAMINHO_CONEXAO_POSTGRES = "caminho.conexao.postgres";
	public static final String USUARIO_POSTGRES = "usuario.postgres";
	public static final String SENHA_POSTGRES = "senha.postgres";

	public static final String IP_LINK_EMAIL = "ip.link.email";
	public static final String HOST = "host.email";
	public static final String NUMERO_PORTA = "numero.porta.email";
	public static final String ORIGEM = "origem.email";
	public static final String SENHA = "senha.email";

	public static final String MIME_HTML = "mime.html";

	private Configuracao() {
	}

	private synchronized static void inicializar(Object objeto) {
		if (arquivoPropriedades == null)
			try {
				arquivoPropriedades = new Properties();
				InputStream inputStream = objeto.getClass().getClassLoader()
						.getResourceAsStream(ARQUIVO_CONFIGURACAO);
				arquivoPropriedades.load(inputStream);
			} catch (Exception e) {
				logger.severe(e.getMessage());
			}
	}

	public synchronized static String obterConfiguracao(Object objeto,
			String chave) {
		inicializar(objeto);
		return arquivoPropriedades.getProperty(chave);
	}
}
