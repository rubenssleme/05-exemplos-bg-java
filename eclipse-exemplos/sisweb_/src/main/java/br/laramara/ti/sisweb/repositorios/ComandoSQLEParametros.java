package br.laramara.ti.sisweb.repositorios;

import java.util.HashMap;
import java.util.Map;

import br.laramara.ti.sisweb.utilitarios.TextoUtils;

public class ComandoSQLEParametros {

	private boolean or;
	private boolean iniciado;
	private String comandoBase;
	private String comandoEspecifico;
	private String comandoOrdem;
	private Map<String, Object> parametros;

	public ComandoSQLEParametros() {
		this.iniciado = false;
		this.comandoEspecifico = "";
		this.comandoOrdem = "";
		this.parametros = new HashMap<>();
		this.or = false;
	}

	public String getComando() {
		return comandoBase + comandoEspecifico + comandoOrdem;
	}

	public Map<String, Object> getParametros() {
		return parametros;
	}

	public void setComandoBase(String comandoBase) {
		this.comandoBase = comandoBase;
	}

	public void adicionarComando(String comando) {
		this.comandoEspecifico += obterComando(iniciado, comando, or);
		this.iniciado = true;		
	}
	
	public void setComandoOrdem(String comandoOrdem) {
		this.comandoOrdem = comandoOrdem;
	}

	public void adicionarParametro(String chave, Object valor) {
		parametros.put(chave, valor);
	}
	
	public void adicionarParametroContem(String chave, Object valor) {
		adicionarParametro(chave, "%" + valor + "%");
	}

	private String obterComando(boolean iniciado, String comando, boolean or) {
		if (iniciado) {
			return or ? " OR " + comando : " AND " + comando;
		} else {
			return " WHERE " + comando;
		}
	}
	
	public void adicionarComandoPorParametro(String chave, Object valor) {
		Object[] palavras = TextoUtils.obterPalavras(valor);
		
		boolean idOuStatus = valor instanceof Long | valor instanceof Boolean;
		
		String comando = "";
		for (int i = 0; i < palavras.length; i++) {
			String chaveComContador = (chave + i);
			if (!idOuStatus) {
				comando = "FUNCTION('remover_acento', (TRIM(UPPER(l." + chave + ")))) LIKE FUNCTION('remover_acento', (TRIM(UPPER(:" + chaveComContador + "))))";
				adicionarParametroContem(chaveComContador, palavras[i]);
			} else {
				comando = "l." + chave + " = :" + chaveComContador;
				adicionarParametro(chaveComContador, valor);
			}
			adicionarComando(comando);
			desativarCondicionalOr();
		}
	}
	
	public void adicionarComandoPorParametroGlobal(String[] chaves, Object parametroGlobal) {
		for (String chave : chaves) {
			adicionarComandoPorParametro(chave, parametroGlobal);
			ativarCondicionalOr();			
		}
	}
	
	private void ativarCondicionalOr() {
		or = true;
	}
	
	private void desativarCondicionalOr() {
		or = false;
	}
	
}
