package br.com.alura.controlador;

public class CaminhoRecurso {
	
	public static final String URL_BASE = "/resources";
	
	public static final String URL_ID = "{id}";
	public static final String URL_TOKEN = "{token}";
	public static final String URL_RAMAL = "{ramal}";
	
	public static final String URL_AGENDAMENTO_EMAIL = "/agendamentoemail";
	public static final String URL_OBTER_LISTA_EMAIL = "/obter-lista-email";
	
	
	
	public static final String URL_CONTA_ACESSO_EDITAR = URL_BASE + "/conta-acesso-editar";
	public static final String URL_CONTA_ACESSO_LISTAR = URL_BASE + "/conta-acesso-listar";
	public static final String URL_CONTA_ACESSO_LISTAR_TODOS_OPERADORES_ATIVOS = URL_BASE + "/conta-acesso-listar-todos-operadores-ativos";
	public static final String URL_CONTA_ACESSO_OBTER = URL_BASE + "/conta-acesso-obter//" + URL_ID;
	public static final String URL_CONTA_ACESSO_AUTENTICAR = URL_BASE + "/conta-acesso-autenticar";
	public static final String URL_NIVEL_LISTAR = URL_BASE + "/nivel-listar";
	public static final String URL_NIVEL_OBTER = URL_BASE + "/nivel-obter//" + URL_ID;
	public static final String URL_NIVEL_EDITAR = URL_BASE + "/nivel-editar";
	public static final String URL_PERMISSAO_LISTAR = URL_BASE + "/permissao-listar";
	public static final String URL_PERMISSAO_OBTER = URL_BASE + "/permissao-obter//" + URL_TOKEN;
	public static final String URL_TURNO_LISTAR = URL_BASE + "/turno-listar";
	public static final String URL_ESTADO_LISTAR = "/estado-listar";
	public static final String URL_MUNICIPIO_LISTAR = "/municipio-listar//" + URL_ID;
	public static final String URL_BAIRRO_LISTAR = "/bairro-listar//" + URL_ID;
	public static final String URL_CAMPANHA_EDITAR = "/campanha-editar";
	public static final String URL_CAMPANHA_OBTER = "/campanha-obter//" + URL_ID;
	public static final String URL_CAMPANHA_LISTAR =  "/campanha-listar";
	public static final String URL_CRITERIO_VALIDAR = "/criterio-validar";
	public static final String URL_ALOCACAO_OPERADOR_VALIDAR = "/alocacao-operador-validar";
	public static final String URL_LIGAR = "/ligar";
	public static final String URL_STATUS_RAMAL_OBTER = "/status-ramal-obter//" + URL_TOKEN;
	public static final String URL_DISTRIBUICAO_CONTATO_OBTER = "/distribuicao-contato-obter//" + URL_TOKEN;
	public static final String URL_RAMAL_LISTAR =  "/ramal-listar";
	public static final String URL_DOACAO_EDITAR = "/doacao-editar";
	public static final String URL_METODO_LISTAR = "/metodo-listar";
	public static final String URL_TIPO_RETIRADA_LISTAR = "/tipo-retirada-listar";
	public static final String URL_VALOR_DETALHADO_VALIDAR = "/valor-detalhado-validar";
}


