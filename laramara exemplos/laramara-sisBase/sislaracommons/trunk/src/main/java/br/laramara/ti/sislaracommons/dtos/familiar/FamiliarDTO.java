package br.laramara.ti.sislaracommons.dtos.familiar;

import java.util.ArrayList;
import java.util.List;

import br.laramara.ti.sislaracommons.Identificavel;
import br.laramara.ti.sislaracommons.dtos.InformacaoEssencialDTO;
import br.laramara.ti.sislaracommons.dtos.ModeloDTO;
import br.laramara.ti.sislaracommons.dtos.escola.InformacaoEducacionalDTO;
import br.laramara.ti.sislaracommons.dtos.usuario.EstadoCivilDTO;
import br.laramara.ti.sislaracommons.dtos.usuario.GeneroDTO;
import br.laramara.ti.sislaracommons.dtos.usuario.PeriodoBeneficioDTO;
import br.laramara.ti.sislaracommons.dtos.usuario.StatusDTO;

public class FamiliarDTO extends ModeloDTO implements Identificavel {

	private static final long serialVersionUID = 7741834523299285091L;

	private Long id;
	private InformacaoEssencialDTO informacaoEssencialDto;
	private ParentescoDTO parentescoDto;
	private String cpf;
	private String dataNascimento;
	private EstadoCivilDTO estadoCivilDto;
	private InformacaoTrabalhoDTO informacaoTrabalhoDto;
	private boolean naoAlfabetizado;
	private List<InformacaoEducacionalDTO> informacoesEducacionaisDto;
	private String renda;
	private boolean principalResponsavel;
	private StatusDTO statusDto;
	private boolean moraNaCasa;
	private GeneroDTO generoDto;
	private boolean responsavelPelaAvaliacaoSocial;
	private boolean acompanhante;
	private boolean responsavelPeloUsuario;
	private boolean paradeiroIgnorado;
	private List<PeriodoBeneficioDTO> periodoBeneficiosDto;

	public FamiliarDTO(){
		principalResponsavel = false;
		naoAlfabetizado = false;
		informacaoTrabalhoDto = new InformacaoTrabalhoDTO();
		informacaoEssencialDto = new InformacaoEssencialDTO();
		informacoesEducacionaisDto = new ArrayList<>();
		periodoBeneficiosDto = new ArrayList<>();
	}
	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}
	
	public ParentescoDTO getParentescoDto() {
		return parentescoDto;
	}

	public void setParentescoDto(ParentescoDTO parentescoDto) {
		this.parentescoDto = parentescoDto;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getDataNascimento() {
		return dataNascimento;
	}

	public void setDataNascimento(String dataNascimento) {
		this.dataNascimento = dataNascimento;
	}

	public EstadoCivilDTO getEstadoCivilDto() {
		return estadoCivilDto;
	}

	public void setEstadoCivilDto(EstadoCivilDTO estadoCivilDto) {
		this.estadoCivilDto = estadoCivilDto;
	}

	public InformacaoTrabalhoDTO getInformacaoTrabalhoDto() {
		return informacaoTrabalhoDto;
	}

	public void setInformacaoTrabalhoDto(
			InformacaoTrabalhoDTO informacaoTrabalhoDto) {
		this.informacaoTrabalhoDto = informacaoTrabalhoDto;
	}
	
	public boolean isNaoAlfabetizado() {
		return naoAlfabetizado;
	}

	public void setNaoAlfabetizado(boolean naoAlfabetizado) {
		this.naoAlfabetizado = naoAlfabetizado;
	}

	public List<InformacaoEducacionalDTO> getInformacoesEducacionaisDto() {
		return informacoesEducacionaisDto;
	}

	public void setInformacoesEducacionaisDto(List<InformacaoEducacionalDTO> informacoesEducacionaisDto) {
		this.informacoesEducacionaisDto = informacoesEducacionaisDto;
	}

	public String getRenda() {
		return renda;
	}

	public void setRenda(String renda) {
		this.renda = renda;
	}

	public boolean isPrincipalResponsavel() {
		return principalResponsavel;
	}

	public void setPrincipalResponsavel(boolean principalResponsavel) {
		this.principalResponsavel = principalResponsavel;
	}
	
	public boolean isMoraNaCasa() {
		return moraNaCasa;
	}

	public void setMoraNaCasa(boolean moraNaCasa) {
		this.moraNaCasa = moraNaCasa;
	}

	public InformacaoEssencialDTO getInformacaoEssencialDto() {
		return informacaoEssencialDto;
	}

	public void setInformacaoEssencialDto(
			InformacaoEssencialDTO informacaoEssencialDto) {
		this.informacaoEssencialDto = informacaoEssencialDto;
	}

	public StatusDTO getStatusDto() {
		return statusDto;
	}

	public void setStatusDto(StatusDTO statusDto) {
		this.statusDto = statusDto;
	}

	public GeneroDTO getGeneroDto() {
		return generoDto;
	}

	public void setGeneroDto(GeneroDTO generoDto) {
		this.generoDto = generoDto;
	}

	public boolean isResponsavelPelaAvaliacaoSocial() {
		return responsavelPelaAvaliacaoSocial;
	}

	public void setResponsavelPelaAvaliacaoSocial(boolean responsavelPelaAvaliacaoSocial) {
		this.responsavelPelaAvaliacaoSocial = responsavelPelaAvaliacaoSocial;
	}

	public boolean isAcompanhante() {
		return acompanhante;
	}

	public void setAcompanhante(boolean acompanhante) {
		this.acompanhante = acompanhante;
	}

	public boolean isResponsavelPeloUsuario() {
		return responsavelPeloUsuario;
	}

	public void setResponsavelPeloUsuario(boolean responsavelPeloUsuario) {
		this.responsavelPeloUsuario = responsavelPeloUsuario;
	}

	public boolean isParadeiroIgnorado() {
		return paradeiroIgnorado;
	}

	public void setParadeiroIgnorado(boolean paradeiroIgnorado) {
		this.paradeiroIgnorado = paradeiroIgnorado;
	}

	public List<PeriodoBeneficioDTO> getPeriodoBeneficiosDto() {
		return periodoBeneficiosDto;
	}

	public void setPeriodoBeneficiosDto(List<PeriodoBeneficioDTO> periodoBeneficiosDto) {
		this.periodoBeneficiosDto = periodoBeneficiosDto;
	}
}
