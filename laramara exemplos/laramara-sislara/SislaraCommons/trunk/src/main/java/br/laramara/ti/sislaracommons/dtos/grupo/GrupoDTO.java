package br.laramara.ti.sislaracommons.dtos.grupo;

import java.util.ArrayList;
import java.util.List;

import br.laramara.ti.sislaracommons.Bloqueavel;
import br.laramara.ti.sislaracommons.Identificavel;
import br.laramara.ti.sislaracommons.dtos.ModeloDTO;
import br.laramara.ti.sislaracommons.dtos.instituicao.InstituicaoDTO;
import br.laramara.ti.sislaracommons.dtos.precadastro.PreCadastroDTO;
import br.laramara.ti.sislaracommons.dtos.usuario.SetorDTO;
import br.laramara.ti.sislaracommons.dtos.usuario.UsuarioDTO;
import br.laramara.ti.sislaracommons.utilitarios.TextoUtils;

public class GrupoDTO extends ModeloDTO implements Identificavel, Bloqueavel{

	private static final long serialVersionUID = -5788172422010785188L;
	
	private Long id;
	private boolean ativo;
	private boolean inicializado;
	private SetorDTO setorDto;
	private DescricaoTipoAtendimentoDTO descricaoTipoAtendimentoDto;
	private String dataInicio;
	private String dataTermino;
	private NomeGrupoDTO nomeGrupoDto;
	private String turma;
	private String nivel;	
	private List<ModuloPeriodoDTO> modulosPeriodosDto;
	private String descricao;
	private List<TipificacaoServicoDTO> tipificacoesServicoDto;
	private InstituicaoDTO instituicaoDoacaoDto;
	private List<LoteRecursoDTO> loteRecursoDto;
	private List<UsuarioDTO> todosUsuariosDto;
	private List<PreCadastroDTO> todosPreCadastroDto;
	
	public GrupoDTO() {
		modulosPeriodosDto = new ArrayList<>();
		tipificacoesServicoDto = new ArrayList<>();
		loteRecursoDto = new ArrayList<>();
		todosUsuariosDto = new ArrayList<>();
		todosPreCadastroDto = new ArrayList<>();
		ativo = true;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}
	
	public boolean isInicializado() {
		return inicializado;
	}

	public void setInicializado(boolean inicializado) {
		this.inicializado = inicializado;
	}

	public boolean isAtivo() {
		return ativo;
	}

	public void setAtivo(boolean ativo) {
		this.ativo = ativo;
	}

	public SetorDTO getSetorDto() {
		return setorDto;
	}

	public void setSetorDto(SetorDTO setorDto) {
		this.setorDto = setorDto;
	}

	public DescricaoTipoAtendimentoDTO getDescricaoTipoAtendimentoDTO() {
		return descricaoTipoAtendimentoDto;
	}

	public void setDescricaoTipoAtendimentoDTO(DescricaoTipoAtendimentoDTO descricaoTipoAtendimentoDTO) {
		this.descricaoTipoAtendimentoDto = descricaoTipoAtendimentoDTO;
	}

	public String getDataInicio() {
		return dataInicio;
	}

	public void setDataInicio(String dataInicio) {
		this.dataInicio = dataInicio;
	}

	public String getDataTermino() {
		return dataTermino;
	}

	public void setDataTermino(String dataTermino) {
		this.dataTermino = dataTermino;
	}

	public NomeGrupoDTO getNomeGrupoDto() {
		return nomeGrupoDto;
	}

	public void setNomeGrupoDto(NomeGrupoDTO nomeGrupoDto) {
		this.nomeGrupoDto = nomeGrupoDto;
	}

	public String getTurma() {
		return turma;
	}

	public void setTurma(String turma) {
		this.turma = turma;
	}

	public String getNivel() {
		return nivel;
	}

	public void setNivel(String nivel) {
		this.nivel = nivel;
	}

	public List<ModuloPeriodoDTO> getModulosPeriodosDto() {
		return modulosPeriodosDto;
	}
	
	public ModuloPeriodoDTO obterModuloPeriodo(ModuloPeriodoDTO moduloPeriodoDto) {
		return modulosPeriodosDto.contains(moduloPeriodoDto) ? modulosPeriodosDto
				.get(modulosPeriodosDto.indexOf(moduloPeriodoDto)) : null;
	}

	public void setModulosPeriodosDto(List<ModuloPeriodoDTO> modulosPeriodosDto) {
		this.modulosPeriodosDto = modulosPeriodosDto;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	
	public List<TipificacaoServicoDTO> getTipificacoesServicoDto() {
		return tipificacoesServicoDto;
	}

	public void setTipificacoesServicoDto(
			List<TipificacaoServicoDTO> tipificacoesServicoDto) {
		this.tipificacoesServicoDto = tipificacoesServicoDto;
	}
	
	public InstituicaoDTO getInstituicaoDoacaoDto() {
		return instituicaoDoacaoDto;
	}

	public void setInstituicaoDoacaoDto(InstituicaoDTO instituicaoDoacaoDto) {
		this.instituicaoDoacaoDto = instituicaoDoacaoDto;
	}

	public List<LoteRecursoDTO> getDoacaoRecursoDto() {
		return loteRecursoDto;
	}

	public void setDoacaoRecursoDto(List<LoteRecursoDTO> loteRecursoDto) {
		this.loteRecursoDto = loteRecursoDto;
	}
	
	public List<UsuarioDTO> getTodosUsuariosDto() {
		return todosUsuariosDto;
	}

	public void setTodosUsuariosDto(List<UsuarioDTO> todosUsuariosDto) {
		this.todosUsuariosDto = todosUsuariosDto;
	}

	public List<PreCadastroDTO> getTodosPreCadastroDto() {
		return todosPreCadastroDto;
	}

	public void setTodosPreCadastro(List<PreCadastroDTO> todosPreCadastroDto) {
		this.todosPreCadastroDto = todosPreCadastroDto;
	}

	
	private String obterNomesModulos() {
		String resultado = "";
		for (ModuloPeriodoDTO moduloPeriodoDto : modulosPeriodosDto) {
			resultado += moduloPeriodoDto.getModuloDto().toString() + ", ";
		}
		return TextoUtils.removerVirgulaFinal(resultado);
	}

	public String toStringApenasNomeETurma(){
		return nomeGrupoDto + "-" + turma;
	}
	
	@Override
	public String toString() {
		return toStringApenasNomeETurma() + " - " + obterNomesModulos() + " - "
				+ dataInicio;
	}

	@Override
	public String obterNome() {
		return id != null ? toStringApenasNomeETurma() : "";
	}
}