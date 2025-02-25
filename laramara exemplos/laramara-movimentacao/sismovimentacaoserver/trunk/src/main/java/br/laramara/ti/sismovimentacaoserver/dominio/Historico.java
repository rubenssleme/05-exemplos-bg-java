package br.laramara.ti.sismovimentacaoserver.dominio;

import java.util.Calendar;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import br.laramara.ti.sismovimentacaocommons.utilitarios.DataHoraUtils;

@MappedSuperclass
public abstract class Historico extends Validavel{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	protected Long id;
	
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "data_inicial_vigencia", nullable = false)
	protected Calendar dataInicialVigencia;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "data_final_vigencia")
	protected Calendar dataFinalVigencia;
	
	public Historico() {
		dataInicialVigencia = obterDataHoraAtual();
	}
	
	protected Calendar obterDataHoraAtual(){
		return Calendar.getInstance();
	}
	
	public void setId(Long id) {
		this.id = id;
	}

	public Long getId() {
		return id;
	}
	
	public Calendar getDataInicialVigencia() {
		return dataInicialVigencia;
	}
	
	public Calendar getDataFinalVigencia(){
		return dataFinalVigencia;
	}
	
	public String getDataInicial() {
		return DataHoraUtils.formatarData(dataInicialVigencia);
	}

	public void setDataInicial(String dataInicial) {
		this.dataInicialVigencia = DataHoraUtils.obterDataValidaInvalidaOuNulo(dataInicial);
	}

	public String getDataFinal() {
		return DataHoraUtils.formatarData(dataFinalVigencia);
	}

	public void setDataFinal(String dataFinal) {
		this.dataFinalVigencia = DataHoraUtils.obterDataValidaInvalidaOuNulo(dataFinal);
	}
	
	public Boolean vigenciaEncerrada() {
		return dataFinalVigencia != null;
	}
	
	public void encerrarVigencia() {
		if (dataFinalVigencia == null){
			dataFinalVigencia = obterDataHoraAtual();
		}
	}
	
	public static Historico obterHistoricoAtual(List<? extends Historico> historicos) {
		Historico retorno = null;
		for (Historico historico : historicos) {
			if (!historico.vigenciaEncerrada()) {
				retorno = historico;
			}
		}
		return retorno;
	}
	
	public static final Comparator<Historico> obterComparador() {
		return new Comparator<Historico>() {
			public int compare(Historico o1, Historico o2) {
				return (o1.getDataInicialVigencia().compareTo(o2.getDataInicialVigencia()));
			}
		};
	}
	
	public static String getHistoricoOperacoes(List<? extends HistoricoOperacao> historicos) {
		Collections.sort(historicos, Historico.obterComparador());
				
		String resultado = "";
		for (HistoricoOperacao historico : historicos) {
			resultado += historico.getStringDoStatus()
					+ " por ";
			if (historico.getContaAcesso()!=null){
				resultado+= historico.getContaAcesso().getLogin();
			}else{
				resultado+="NENHUM";
			}
			resultado+= " de "
					+ DataHoraUtils.formatarDataHoraMinuto(historico
							.getDataInicialVigencia()) + " at� ";
			if (historico.vigenciaEncerrada()) {
				resultado += DataHoraUtils.formatarDataHoraMinuto(historico
						.getDataFinalVigencia());
			} else {
				resultado += "HOJE";
			}
			resultado += ".\n";
		}
		return resultado;
	}
	
	public void validarObrigatoriedadeEObrigatoriedadeDeDados() {
		if (dataInicialVigencia == null
				|| DataHoraUtils.dataInvalida(dataInicialVigencia)) {
			adicionarErro("Insira uma Data Inicial v�lida.");
		}
		if (DataHoraUtils.dataInvalida(dataFinalVigencia)) {
			adicionarErro("Insira uma Data Final v�lida.");
		}
		if (DataHoraUtils.dataTerminoAnteriorDataInicio(dataInicialVigencia,
				dataFinalVigencia)) {
			adicionarErro("Insira uma Data Final posterior � Data Inicial.");
		}
	}
}
