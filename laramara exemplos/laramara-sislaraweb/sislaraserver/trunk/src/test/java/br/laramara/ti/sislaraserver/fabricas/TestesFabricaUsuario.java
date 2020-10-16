package br.laramara.ti.sislaraserver.fabricas;

import java.util.ArrayList;
import java.util.List;

import org.testng.Assert;
import org.testng.annotations.Test;

import br.laramara.ti.sislaracommons.dtos.usuario.UsuarioDTO;
import br.laramara.ti.sislaracommons.utilitarios.DataHoraUtils;
import br.laramara.ti.sislaracommons.utilitarios.TiposDeTeste;
import br.laramara.ti.sislaraserver.dominio.usuario.Usuario;

public class TestesFabricaUsuario {

	@Test(groups = { TiposDeTeste.INTEGRACAO_SEM_BD })
	public void fabrica_usuario_converte_objeto_de_dto_novo_para_dominio() {
		UsuarioDTO usuarioDto = ContextoUsuario.construirUsuarioDTOComSRMseSalaRecursoEOutrosAEE();
		Usuario usuarioCovertido = new FabricaUsuario().converterParaDominio(usuarioDto);

		Assert.assertEquals(usuarioCovertido.getId(), usuarioDto.getId());
		Assert.assertEquals(usuarioCovertido.getVersao(), usuarioDto.getVersao());
		Assert.assertEquals(usuarioCovertido.getInformacaoEssencial().getNome(),
				usuarioDto.getInformacaoEssencialDto().getNome());
		Assert.assertEquals(usuarioCovertido.getClassificacaoSocial().toString(),
				usuarioDto.getClassificacaoSocialDto().toString());
		Assert.assertEquals(usuarioCovertido.getGenero().toString(), usuarioDto.getGeneroDto().toString());
		Assert.assertEquals(usuarioCovertido.getNaturalidade(), usuarioDto.getNaturalidade());
		Assert.assertEquals(usuarioCovertido.getNacionalidade(), usuarioDto.getNacionalidade());
		Assert.assertEquals(usuarioCovertido.getUfRg().toString(), usuarioDto.getUfRgDto().toString());
		Assert.assertEquals(usuarioCovertido.getInformacaoEssencial().getRg(),
				usuarioDto.getInformacaoEssencialDto().getRg());
		Assert.assertEquals(usuarioCovertido.getDataExpedicaoRg(),
				DataHoraUtils.formatarData(DataHoraUtils.criar(usuarioDto.getDataExpedicaoRg())));
		Assert.assertEquals(usuarioCovertido.getOrgaoEmissorRg(), usuarioDto.getOrgaoEmissorRg());
		Assert.assertEquals(usuarioCovertido.getEstadoCivil().getDescricao(),
				usuarioDto.getEstadoCivilDto().toString());
		Assert.assertEquals(usuarioCovertido.getInformacaoEssencial().getCep(),
				usuarioDto.getInformacaoEssencialDto().getEnderecoDto().getCep());
		Assert.assertEquals(usuarioCovertido.getInformacaoEssencial().getEndereco(),
				usuarioDto.getInformacaoEssencialDto().getEnderecoDto().getEndereco());
		Assert.assertEquals(usuarioCovertido.getInformacaoEssencial().getNumero(),
				usuarioDto.getInformacaoEssencialDto().getEnderecoDto().getNumero());
		Assert.assertEquals(usuarioCovertido.getInformacaoEssencial().getComplemento(),
				usuarioDto.getInformacaoEssencialDto().getEnderecoDto().getComplemento());
		Assert.assertEquals(usuarioCovertido.getInformacaoEssencial().getZona().toString(),
				usuarioDto.getInformacaoEssencialDto().getEnderecoDto().getZonaDto().toString());
		Assert.assertEquals(usuarioCovertido.getInformacaoEssencial().getBairro(),
				usuarioDto.getInformacaoEssencialDto().getEnderecoDto().getBairro());
		Assert.assertEquals(usuarioCovertido.getInformacaoEssencial().getMunicipio().getId(),
				usuarioDto.getInformacaoEssencialDto().getEnderecoDto().getMunicipioDto().getId());
		Assert.assertEquals(usuarioCovertido.getInformacaoEssencial().getUf().toString(),
				usuarioDto.getInformacaoEssencialDto().getEnderecoDto().getUfDto().toString());
		Assert.assertEquals(usuarioCovertido.getInformacaoEssencial().getPais().getId(),
				usuarioDto.getInformacaoEssencialDto().getEnderecoDto().getPaisDto().getId());
		Assert.assertEquals(usuarioCovertido.getInformacaoEssencial().getContato().getTelefones().size(), 3);
		Assert.assertEquals(usuarioCovertido.getInformacaoEssencial().getContato().getNomeContato(),
				usuarioDto.getInformacaoEssencialDto().getContatoDto().getNomeContato());
		Assert.assertEquals(usuarioCovertido.getSituacoesGuarda().size(), 1);
		Assert.assertEquals(usuarioCovertido.getPeriodoBeneficios().size(), 1);
		Assert.assertEquals(usuarioCovertido.getPeriodoDeficiencias().size(), 1);
		Assert.assertEquals(usuarioCovertido.getPeriodoDoencas().size(), 1);
		Assert.assertEquals(usuarioCovertido.getConvenios().size(), 1);
		Assert.assertEquals(usuarioCovertido.getFoto().length, usuarioDto.getFoto().length);
		Assert.assertEquals(usuarioCovertido.getObs(), usuarioDto.getObs());
		Assert.assertEquals(usuarioCovertido.getInformacaoEssencial().getContato().getEmail(),
				usuarioDto.getInformacaoEssencialDto().getContatoDto().getEmail());
		Assert.assertEquals(usuarioCovertido.obterInformacoesEducacionais().get(0).getEscolaridade().getDescricao(),
				usuarioDto.getInformacoesEducacionaisDto().get(0).getEscolaridadeDto().toString());
		Assert.assertEquals(usuarioCovertido.obterInformacoesEducacionais().get(0).getInstituicao().getNome(),
				usuarioDto.getInformacoesEducacionaisDto().get(0).getInstituicaoDto().getNome());
		Assert.assertEquals(usuarioCovertido.obterInformacoesEducacionais().get(0).getSerie().getDescricao(),
				usuarioDto.getInformacoesEducacionaisDto().get(0).getSerieDto().toString());
		Assert.assertEquals(usuarioCovertido.obterInformacoesEducacionais().get(0).getSituacao().toString(),
				usuarioDto.getInformacoesEducacionaisDto().get(0).getSituacaoEducacionalDto().toString());
		Assert.assertEquals(usuarioCovertido.obterInformacoesEducacionais().get(0).getPeriodo().toString(),
				usuarioDto.getInformacoesEducacionaisDto().get(0).getPeriodoDto().toString());
		Assert.assertEquals(usuarioCovertido.getInstituicaoComSRMs().getId(),
				usuarioDto.getInstituicaoComSRMsDto().getId());
		Assert.assertEquals(usuarioCovertido.getInstituicaoComSalaRecurso().getId(),
				usuarioDto.getInstituicaoComSalaRecursoDto().getId());
		Assert.assertEquals(usuarioCovertido.getInstituicaoComOutrosAEE().getId(),
				usuarioDto.getInstituicaoComOutrosAEE().getId());
		Assert.assertEquals(usuarioCovertido.possuiVigenciaAtivaCTO(), usuarioDto.isAssociadoAoSetorCTO());
		Assert.assertEquals(usuarioCovertido.possuiVigenciaAtivaProceja(), usuarioDto.isAssociadoAoSetorProceja());
		Assert.assertEquals(usuarioCovertido.getOutrosApoiosServicos(), usuarioDto.getOutrosApoiosServicos());
		Assert.assertEquals(usuarioCovertido.getCertidoes().size(), usuarioDto.getConveniosDto().size());
		Assert.assertEquals(usuarioCovertido.getTipoLeitura().toString(), usuarioDto.getTipoLeituraDto().toString());
		Assert.assertEquals(usuarioCovertido.getTamanhoFonte(), usuarioDto.getTamanhoFonte());
		Assert.assertEquals(usuarioCovertido.getRecursosRelacionamentos().size(), usuarioDto.getRecursosRelacionamentosDto().size());
		Assert.assertEquals(usuarioCovertido.getAtualmenteTrabalhando().toString(),
				usuarioDto.getAtualmenteTrabalhandoDto().toString());
		Assert.assertEquals(usuarioCovertido.getInformacoesTrabalhoCompleta().size(),
				usuarioDto.getInformacaoTrabalhoCompletaDto().size());
		Assert.assertEquals(usuarioCovertido.getRenda(), usuarioDto.getRenda());
		Assert.assertEquals(usuarioCovertido.getCirurgias(), usuarioDto.getCirurgias());
		Assert.assertEquals(usuarioCovertido.getMedicamentos(), usuarioDto.getMedicamentos());
		Assert.assertEquals(usuarioCovertido.getConsanguinidade(), usuarioDto.getConsanguinidade());
		Assert.assertEquals(usuarioCovertido.getCustosDoenca().size(), usuarioDto.getCustosDoencaDto().size());
		Assert.assertEquals(usuarioCovertido.getCustosDeficiencia().size(),
				usuarioDto.getCustosDeficienciaDto().size());
		Assert.assertEquals(usuarioCovertido.isFalecido(), usuarioDto.isFalecido());
		Assert.assertEquals(usuarioCovertido.possuiConsanguinidade().toString(),
				usuarioDto.getPossuiConsanguinidadeDto().toString());
		Assert.assertEquals(usuarioCovertido.getOrigemEncaminhamentosDetalhados().size(), usuarioDto.getOrigemEncaminhamentosDetalhadosDto().size());
		Assert.assertEquals(usuarioCovertido.getEncaminhamentos().size(), usuarioDto.getEncaminhamentosDto().size());
		Assert.assertEquals(usuarioCovertido.getServicos().size(), usuarioDto.getServicosDto().size());
		Assert.assertEquals(usuarioCovertido.getRecursosProximoAMoradia().size(),
				usuarioDto.getRecursosProximoAMoradia().size());
		Assert.assertEquals(usuarioCovertido.getCondicaoMoradia().getId(), usuarioDto.getCondicaoMoradiaDto().getId());
		Assert.assertEquals(usuarioCovertido.getSituacaoHabitacional().getId(), usuarioDto.getSituacaoHabitacionalDto().getId());
		Assert.assertEquals(usuarioCovertido.getHabitacao().getId(), usuarioDto.getHabitacaoDto().getId());
		Assert.assertEquals(usuarioCovertido.getTipoConstrucao().getId(), usuarioDto.getTipoConstrucaoDto().getId());
		Assert.assertEquals(usuarioCovertido.getInfraestruturaBasica().size(), usuarioDto.getInfraestruturaBasicaDtos().size());
		Assert.assertEquals(usuarioCovertido.getVulnerabilidadeUsuario().size(), usuarioDto.getVulnerabilidadeUsuarioDto().size());
		Assert.assertEquals(usuarioCovertido.getHistorico(), usuarioDto.getHistorico());
		Assert.assertEquals(usuarioCovertido.getFuncionalidade(), usuarioDto.getFuncionalidade());
		Assert.assertEquals(usuarioCovertido.getReacaoFrenteADeficiencia(), usuarioDto.getReacaoFrenteADeficiencia());
		Assert.assertEquals(usuarioCovertido.getReacaoFrenteADeficienciaFamiliar(), usuarioDto.getReacaoFrenteADeficienciaFamiliar());
		Assert.assertEquals(usuarioCovertido.getRedeDeApoio(), usuarioDto.getRedeDeApoio());
		Assert.assertEquals(usuarioCovertido.getRedeDeAmigos(), usuarioDto.getRedeDeAmigos());
		Assert.assertEquals(usuarioCovertido.getNamoroCasamentoSexualidade(), usuarioDto.getNamoroCasamentoSexualidade());		
		Assert.assertEquals(usuarioCovertido.getNecessidadesExpectativasQueixas(), usuarioDto.getNecessidadesExpectativasQueixas());
		Assert.assertEquals(usuarioCovertido.getEducacional(), usuarioDto.getEducacional());
		Assert.assertEquals(usuarioCovertido.getComunicacao(), usuarioDto.getComunicacao());
		Assert.assertEquals(usuarioCovertido.getReligiaoLazerCulturaRotina(), usuarioDto.getReligiaoLazerCulturaRotina());
		Assert.assertEquals(usuarioCovertido.getParecer(), usuarioDto.getParecer());
	}

	@Test(groups = { TiposDeTeste.INTEGRACAO_SEM_BD })
	public void fabrica_usuario_converte_objeto_de_dominio_para_dto() {
		Usuario usuario = ContextoUsuario.fabricarUsuarioComTodosOsDadosESRMseSalaDeRecursoEOutrosAEE();
		usuario.setId(new Long(12345678));
		usuario.validarObrigatoriedadeETamanhoMaximoDeDados();

		UsuarioDTO usuarioDtoCovertido = new FabricaUsuario().converterParaDTO(usuario);

		Assert.assertEquals(usuarioDtoCovertido.getId(), usuario.getId());
		Assert.assertEquals(usuarioDtoCovertido.getVersao(), usuario.getVersao());
		Assert.assertEquals(usuarioDtoCovertido.getInformacaoEssencialDto().getNome(),
				usuario.getInformacaoEssencial().getNome());
		Assert.assertEquals(usuarioDtoCovertido.getClassificacaoSocialDto().toString(),
				usuario.getClassificacaoSocial().toString());
		Assert.assertEquals(usuarioDtoCovertido.getStatusUsuarioAtualDto().toString(), usuario.getStatusUsuarioAtual().toString());
		Assert.assertEquals(usuarioDtoCovertido.getGeneroDto().toString(), usuario.getGenero().toString());
		Assert.assertEquals(usuarioDtoCovertido.getNaturalidade(), usuario.getNaturalidade());
		Assert.assertEquals(usuarioDtoCovertido.getNacionalidade(), usuario.getNacionalidade());
		Assert.assertEquals(usuarioDtoCovertido.getUfRgDto().toString(), usuario.getUfRg().toString());
		Assert.assertEquals(usuarioDtoCovertido.getInformacaoEssencialDto().getRg(),
				usuario.getInformacaoEssencial().getRg());
		Assert.assertEquals(usuarioDtoCovertido.getDataExpedicaoRg(), usuario.getDataExpedicaoRg());
		Assert.assertEquals(usuarioDtoCovertido.getOrgaoEmissorRg(), usuario.getOrgaoEmissorRg());
		Assert.assertEquals(usuarioDtoCovertido.getEstadoCivilDto().toString(),
				usuario.getEstadoCivil().getDescricao());
		Assert.assertEquals(usuarioDtoCovertido.getFamiliaresDto().size(), 2);
		Assert.assertEquals(usuarioDtoCovertido.getInformacoesEducacionaisDto().size(), 1);
		Assert.assertEquals(usuarioDtoCovertido.getInstituicaoComSRMsDto().getId(),
				usuario.getInstituicaoComSRMs().getId());
		Assert.assertEquals(usuarioDtoCovertido.getInstituicaoComSalaRecursoDto().getId(),
				usuario.getInstituicaoComSalaRecurso().getId());
		Assert.assertEquals(usuarioDtoCovertido.getInstituicaoComOutrosAEE().getId(),
				usuario.getInstituicaoComOutrosAEE().getId());
		Assert.assertEquals(usuarioDtoCovertido.getSituacoesGuardaDto().size(), 1);
		Assert.assertEquals(usuarioDtoCovertido.getPeriodoBeneficiosDto().size(), 1);
		Assert.assertEquals(usuarioDtoCovertido.getPeriodoDoencasDto().size(), 1);
		Assert.assertEquals(usuarioDtoCovertido.getConveniosDto().size(), 1);
		Assert.assertEquals(usuarioDtoCovertido.getFoto().length, usuario.getFoto().length);
		Assert.assertEquals(usuarioDtoCovertido.getObs(), usuario.getObs());
		Assert.assertEquals(usuarioDtoCovertido.isAssociadoAoSetorCTO(), usuario.possuiVigenciaAtivaCTO());
		Assert.assertEquals(usuarioDtoCovertido.isAssociadoAoSetorProceja(), usuario.possuiVigenciaAtivaProceja());
		Assert.assertEquals(usuarioDtoCovertido.getOutrosApoiosServicos(), usuario.getOutrosApoiosServicos());
		Assert.assertEquals(usuarioDtoCovertido.getCertidoes().size(), usuario.getCertidoes().size());
		Assert.assertEquals(usuarioDtoCovertido.getTipoLeituraDto().toString(), usuario.getTipoLeitura().toString());
		Assert.assertEquals(usuarioDtoCovertido.getTamanhoFonte(), usuario.getTamanhoFonte());
		Assert.assertEquals(usuarioDtoCovertido.getRecursosRelacionamentosDto().size(), usuario.getRecursosRelacionamentos().size());
		Assert.assertEquals(usuarioDtoCovertido.getAtualmenteTrabalhandoDto().toString(),
				usuario.getAtualmenteTrabalhando().toString());
		Assert.assertEquals(usuarioDtoCovertido.getInformacaoTrabalhoCompletaDto().size(),
				usuario.getInformacoesTrabalhoCompleta().size());
		Assert.assertEquals(usuarioDtoCovertido.getRenda(), usuario.getRenda());
		Assert.assertEquals(usuarioDtoCovertido.getCirurgias(), usuario.getCirurgias());
		Assert.assertEquals(usuarioDtoCovertido.getMedicamentos(), usuario.getMedicamentos());
		Assert.assertEquals(usuarioDtoCovertido.getConsanguinidade(), usuario.getConsanguinidade());
		Assert.assertEquals(usuarioDtoCovertido.getCustosDoencaDto().size(), usuario.getCustosDoenca().size());
		Assert.assertEquals(usuarioDtoCovertido.getCustosDeficienciaDto().size(),
				usuario.getCustosDeficiencia().size());
		Assert.assertEquals(usuarioDtoCovertido.isFalecido(),  usuario.isFalecido());
		Assert.assertEquals(usuarioDtoCovertido.getPossuiConsanguinidadeDto().toString(), usuario.possuiConsanguinidade().toString());
		Assert.assertEquals(usuarioDtoCovertido.getRendaTotalFamiliar(), "33,50");
		Assert.assertEquals(usuarioDtoCovertido.getOrigemEncaminhamentosDetalhadosDto().size(), usuario.getOrigemEncaminhamentosDetalhados().size());
		Assert.assertEquals(usuarioDtoCovertido.getEncaminhamentosDto().size(), usuario.getEncaminhamentos().size());
		Assert.assertEquals(usuarioDtoCovertido.getServicosDto().size(), usuario.getServicos().size());
		Assert.assertEquals(usuarioDtoCovertido.getRecursosProximoAMoradia().size(), usuario.getRecursosProximoAMoradia().size());
		Assert.assertEquals(usuarioDtoCovertido.getCondicaoMoradiaDto().getId(), usuario.getCondicaoMoradia().getId());
		Assert.assertEquals(usuarioDtoCovertido.getSituacaoHabitacionalDto().getId(), usuario.getSituacaoHabitacional().getId());
		Assert.assertEquals(usuarioDtoCovertido.getHabitacaoDto().getId(), usuario.getHabitacao().getId());
		Assert.assertEquals(usuarioDtoCovertido.getTipoConstrucaoDto().getId(), usuario.getTipoConstrucao().getId());
		Assert.assertEquals(usuarioDtoCovertido.getInfraestruturaBasicaDtos().size(), usuario.getInfraestruturaBasica().size());
		Assert.assertEquals(usuarioDtoCovertido.getVulnerabilidadeUsuarioDto().size(), usuario.getVulnerabilidadeUsuario().size());
		Assert.assertEquals(usuarioDtoCovertido.getHistorico(), usuario.getHistorico());
		Assert.assertEquals(usuarioDtoCovertido.getFuncionalidade(), usuario.getFuncionalidade());
		Assert.assertEquals(usuarioDtoCovertido.getReacaoFrenteADeficiencia(), usuario.getReacaoFrenteADeficiencia());
		Assert.assertEquals(usuarioDtoCovertido.getReacaoFrenteADeficienciaFamiliar(), usuario.getReacaoFrenteADeficienciaFamiliar());
		Assert.assertEquals(usuarioDtoCovertido.getRedeDeApoio(), usuario.getRedeDeApoio());
		Assert.assertEquals(usuarioDtoCovertido.getRedeDeAmigos(), usuario.getRedeDeAmigos());
		Assert.assertEquals(usuarioDtoCovertido.getNamoroCasamentoSexualidade(), usuario.getNamoroCasamentoSexualidade());		
		Assert.assertEquals(usuarioDtoCovertido.getNecessidadesExpectativasQueixas(), usuario.getNecessidadesExpectativasQueixas());
		Assert.assertEquals(usuarioDtoCovertido.getEducacional(), usuario.getEducacional());
		Assert.assertEquals(usuarioDtoCovertido.getComunicacao(), usuario.getComunicacao());
		Assert.assertEquals(usuarioDtoCovertido.getReligiaoLazerCulturaRotina(), usuario.getReligiaoLazerCulturaRotina());
		Assert.assertEquals(usuarioDtoCovertido.getParecer(), usuario.getParecer());
	}

	@Test(groups = { TiposDeTeste.INTEGRACAO_SEM_BD })
	public void fabrica_usuario_converte_lista_de_objetos_de_dominio_para_dto() {
		Usuario usuarioA = ContextoUsuario.fabricarUsuarioComTodosOsDados();
		usuarioA.setId(new Long(12345678));
		Usuario usuarioB = ContextoUsuario.fabricarUsuarioComTodosOsDados();
		usuarioB.setId(new Long(34243344));

		List<Usuario> listaUsuarios = new ArrayList<>();
		listaUsuarios.add(usuarioA);
		listaUsuarios.add(usuarioB);

		List<UsuarioDTO> usuariosCovertidos = new FabricaUsuario().converterParaDTO(listaUsuarios);

		Assert.assertEquals(usuariosCovertidos.size(), 2);
		Assert.assertEquals(usuariosCovertidos.get(0).getId(), new Long(12345678));
	}

	@Test(groups = { TiposDeTeste.INTEGRACAO_COM_DB })
	public void fabrica_usuario_converte_objeto_de_dto_novo_com_data_invalida_para_dominio() {
		UsuarioDTO usuarioDto = ContextoUsuario.construirUsuarioDTO();
		usuarioDto.getInformacaoEssencialDto().setDataNascimento("31/12/198 ");
		usuarioDto.setDataExpedicaoRg("31/12/198 ");

		FabricaUsuario fabrica = new FabricaUsuario();
		Usuario usuarioCovertido = fabrica.converterParaDominio(usuarioDto);

		Assert.assertEquals(usuarioCovertido.getDataNascimento(),
				DataHoraUtils.formatarData(DataHoraUtils.obterDataInvalida()));
		Assert.assertEquals(usuarioCovertido.getDataExpedicaoRg(),
				DataHoraUtils.formatarData(DataHoraUtils.obterDataInvalida()));
	}
}