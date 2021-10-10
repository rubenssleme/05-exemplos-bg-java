package br.laramara.ti.sisweb.utilitarios;

import java.sql.Connection;
import java.sql.DriverManager;
import java.util.logging.Logger;

public class Conexao {

	private Logger logger = Logger.getLogger(this.getClass().getPackage()
			.getName());

	private static Connection connectionSisweb;
	private static Connection connectionPEXXI;

	private void inicializarPEXXI() {		
		if (connectionPEXXI == null) {
			inicializarBancoPEXXI();
		}
	}
	
	private void inicializarSisweb() {
		if (connectionSisweb == null) { 
			inicializarBancoSisweb();
		}
	}

	public Connection obterConexaoPEXXI() {
		inicializarPEXXI();
		return connectionPEXXI;
	}
	
	public Connection obterConexaoSisweb() {
		inicializarSisweb();
		return connectionSisweb;
	}

	public void inicializarBancoPEXXI() {
		try {
			Class.forName(Configuracao.obterConfiguracao(this,
					Configuracao.CLASSE_DRIVER_ORACLE));
			connectionPEXXI = DriverManager.getConnection(Configuracao
					.obterConfiguracao(this,
							Configuracao.CAMINHO_CONEXAO_ORACLE), Configuracao
					.obterConfiguracao(this, Configuracao.USUARIO_ORACLE),
					Configuracao.obterConfiguracao(this,
							Configuracao.SENHA_ORACLE));
			logger.info("Conexão com o Oracle criada.");
		} catch (Exception e) {
			logger.severe(e.getMessage());
		}
	}

	private void inicializarBancoSisweb() {
		try {
			Class.forName(Configuracao.obterConfiguracao(this,
					Configuracao.CLASSE_DRIVER_POSTGRES));
			connectionSisweb = DriverManager.getConnection(Configuracao
					.obterConfiguracao(this,
							Configuracao.CAMINHO_CONEXAO_POSTGRES),
					Configuracao.obterConfiguracao(this,
							Configuracao.USUARIO_POSTGRES), Configuracao
							.obterConfiguracao(this,
									Configuracao.SENHA_POSTGRES));
		} catch (Exception e) {
			logger.severe(e.getMessage());
		}
	}
}
