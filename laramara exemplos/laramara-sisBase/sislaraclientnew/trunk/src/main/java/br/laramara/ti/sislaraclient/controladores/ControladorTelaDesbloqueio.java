package br.laramara.ti.sislaraclient.controladores;

import br.laramara.ti.sislaraclient.utilitarios.JOptionPanePersonalizado;
import br.laramara.ti.sislaracommons.dtos.seguranca.GeralContaAcessoBloqueadoDTO;
import br.laramara.ti.sislaracommons.dtos.seguranca.ResultadoListagemGeralBloqueadosDTO;
import br.laramara.ti.sislaracommons.utilitarios.Sessao;
import javax.swing.JDialog;
import javax.swing.JList;

public class ControladorTelaDesbloqueio extends ControladorTela {
    
    private ResultadoListagemGeralBloqueadosDTO resultadoListagemGeralBloqueadosDTO;
    private JList jliBleaquados;
    
    public ControladorTelaDesbloqueio(JDialog telaPai, JList jliProntuariosBloequados){
        super(telaPai);
        this.jliBleaquados = jliProntuariosBloequados;
        carregarCampos();
    }

    private void inicializarListaComBloqueados() {
        try {
            resultadoListagemGeralBloqueadosDTO = servicoSisLaraServer.obterListagemBloqueados();
        } catch (Exception ex) {
            JOptionPanePersonalizado.mostrarTelaErro(telaPai, JOptionPanePersonalizado.ERRO_LISTAGEM_USUARIOS_E_GRUPOS_BLOQUEADOS);
            logger.error(JOptionPanePersonalizado.ERRO_LISTAGEM_USUARIOS_E_GRUPOS_BLOQUEADOS + ex.getMessage());
        }
    }

    private void carregarCampos() {
        inicializarListaComBloqueados();
        adicionarDtos(resultadoListagemGeralBloqueadosDTO.getObjetosDto(), jliBleaquados);
    }

    public void desbloquearSelecionado() {
        GeralContaAcessoBloqueadoDTO geralContaAcessoBloqueadoDTO = (GeralContaAcessoBloqueadoDTO)obterDtoSelecionado(jliBleaquados);
        try{
            servicoSisLaraServer.desbloquearEdicaoGeral(geralContaAcessoBloqueadoDTO, Sessao.obterInstancia().obterToken());
            carregarCampos();
        }catch (Exception ex) {
            JOptionPanePersonalizado.mostrarTelaErro(telaPai, JOptionPanePersonalizado.ERRO_COORDENACAO_DESBLOQUEIO);
            logger.error(JOptionPanePersonalizado.ERRO_COORDENACAO_DESBLOQUEIO + ex.getMessage());
        }
    }
}
