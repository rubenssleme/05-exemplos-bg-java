package br.laramara.ti.sisweb;

import java.io.File;
import java.sql.Connection;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.dbunit.database.DatabaseConfig;
import org.dbunit.database.DatabaseConnection;
import org.dbunit.database.IDatabaseConnection;
import org.dbunit.dataset.ReplacementDataSet;
import org.dbunit.dataset.xml.FlatXmlDataSetBuilder;
import org.dbunit.ext.postgresql.PostgresqlDataTypeFactory;
import org.dbunit.operation.DatabaseOperation;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import br.laramara.ti.sisweb.utilitarios.ArquivoUtils;
import br.laramara.ti.sisweb.utilitarios.Conexao;
import br.laramara.ti.sisweb.utilitarios.Configuracao;

public abstract class TestesIntegracaoAbstrato {
	private static final Logger logger = Logger.getLogger(TestesIntegracaoAbstrato.class);

	private File arquivoParaInsersaoDeDados;
	private IDatabaseConnection conexaoDbUnit;

	private WebDriver driver;
	private String url;

	protected TestesIntegracaoAbstrato(String nomeDoArquivoParaInsercao, String url) {
		this.url = url;
		prepararArquivoParaInsercao(nomeDoArquivoParaInsercao);
	}

	private void prepararArquivoParaInsercao(String nomeDoArquivoParaInsercao) {
		if (!nomeDoArquivoParaInsercao.equals("")) {
			try {
				arquivoParaInsersaoDeDados = new File("src/test/resources/" + nomeDoArquivoParaInsercao);
			} catch (Exception e) {
				logger.fatal("Erro durante o preparo dos arquivos de dados para teste.", e);
			}
		}
	}

	@BeforeMethod
	public void inicializarUrl() {
		efetuarInsercaoDeDadosDeTesteNoDB();
		inicializarHtmlUnitDriver();
	}

	@AfterMethod
	public void encerrarUrl() {
		efetuarRemocaoDeDadosDeTesteNoDB();
		finalizarDriver();
	}

	protected void efetuarInsercaoDeDadosDeTesteNoDB() {
		try {
			DatabaseOperation.INSERT.execute(obterConexaoDBUnit(), obterDataSetDBUnit());
		} catch (Exception e) {
			logger.fatal("Erro durante a inserção de dados de teste.", e);
		}
	}

	protected void efetuarRemocaoDeDadosDeTesteNoDB() {
		try {
			DatabaseOperation.DELETE_ALL.execute(obterConexaoDBUnit(), obterDataSetDBUnit());
		} catch (Exception e) {
			logger.fatal("Erro durante a remoção de dados de teste.", e);
		}
	}

	private IDatabaseConnection obterConexaoDBUnit() {
		if (conexaoDbUnit == null) {
			try {
				Connection conexao = new Conexao().obterConexaoSisweb();

				conexaoDbUnit = new DatabaseConnection(conexao);
				DatabaseConfig configuracao = conexaoDbUnit.getConfig();
				configuracao.setProperty(DatabaseConfig.PROPERTY_DATATYPE_FACTORY, new PostgresqlDataTypeFactory());
			} catch (Exception e) {
				logger.fatal("Erro durante a configuração do DBUnit", e);
			}
		}
		return conexaoDbUnit;
	}

	private ReplacementDataSet obterDataSetDBUnit() {
		ReplacementDataSet dataSet = null;
		FlatXmlDataSetBuilder builder = new FlatXmlDataSetBuilder();
		builder.setColumnSensing(true);
		try {
			dataSet = new ReplacementDataSet(builder.build(arquivoParaInsersaoDeDados));
			dataSet.addReplacementObject("$[data_atual]", new SimpleDateFormat("yyyy-MM-dd").format(new Date()));
		} catch (Exception e) {
			logger.fatal("Erro durante a criação do arquivo de dados de testes do DBUnit.");
		}
		return dataSet;
	}

	private void inicializarHtmlUnitDriver() {
		driver = new HtmlUnitDriver();
		redirecionarParaPaginaInicial();
	}

	protected void inicializarFirefoxDriver() {
		driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		redirecionarParaPaginaInicial();
	}

	protected void redirecionarParaPaginaInicial() {
		driver.get(url);
	}

	private void finalizarDriver() {
		if (driver != null) {
			driver.close();
		}
	}

	protected WebDriver obterInstanciaHtmlUnitDriver() {
		return driver;
	}

	protected WebDriver obterInstanciaFirefoxDriver() {
		return driver;
	}

	protected void limparPastaHoleriteETemporario() {
		ArquivoUtils.excluirArquivo(obterPastaHolerite());
		ArquivoUtils.excluirArquivo(obterPastaTemporario());
	}

	protected File obterPastaTemporario() {
		return new File(obterPastaHolerite(),
				Configuracao.obterConfiguracao(this, Configuracao.DIRETORIO_PDF_TEMPORARIO));
	}

	protected File obterPastaHolerite() {
		return new File(Configuracao.obterConfiguracao(this, Configuracao.DIRETORIO_PDF));
	}

	protected String obterHoleriteLocal() {
		return new File("src//test//resources//holerite//holerite.pdf").getAbsolutePath();
	}

	protected void limparDiretoriosHoleriteETemporario() {
		ArquivoUtils.excluirArquivo(obterPastaTemporario());
		ArquivoUtils.excluirArquivo(obterPastaHolerite());
	}
}