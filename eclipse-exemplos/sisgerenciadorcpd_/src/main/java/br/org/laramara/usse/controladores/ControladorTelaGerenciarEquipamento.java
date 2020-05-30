package br.org.laramara.usse.controladores;

import br.org.laramara.usse.dominio.Equipamento;
import br.org.laramara.usse.dominio.Servidor;
import br.org.laramara.usse.modelos.ModeloTabela;
import br.org.laramara.usse.modelos.ModeloTabelaEquipamento;
import br.org.laramara.usse.repositorios.RepositorioEquipamento;
import br.org.laramara.usse.telas.TelaBase;
import br.org.laramara.usse.telas.TelaEditarEquipamento;
import br.org.laramara.usse.telas.TelaGerenciarEquipamentos;
import br.org.laramara.usse.telas.TelaPrincipal;
import br.org.laramara.usse.utilitarios.TabelaUtils;
import java.util.List;
import java.util.stream.Collectors;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JDesktopPane;
import javax.swing.JFrame;
import javax.swing.JInternalFrame;
import javax.swing.JOptionPane;
import javax.swing.JTable;

public class ControladorTelaGerenciarEquipamento extends ControladorTela {

    public Equipamento equipDTO;
    private JInternalFrame telaGerenciarEquipamentos;
    private JComboBox<String> jcbPesquisa;
    private JButton jbuPesquisar, jbuFechar;
    private JTable jtaPesquisaEquipamentos;
    private RepositorioEquipamento repositorioEquipamento;
    TelaEditarEquipamento telaEditarEquipamento;

    public ControladorTelaGerenciarEquipamento(JFrame telaPrincipal, JDesktopPane desktop, JInternalFrame telaGerenciarEquipamentos, JComboBox<String> jcbPesquisa,
            JButton jbuPesquisar, JButton jbuFechar, JTable jtaPesquisaEquipamentos, TelaEditarEquipamento telaEditarEquipamento) {
        super(telaPrincipal, desktop);
        this.telaGerenciarEquipamentos = telaGerenciarEquipamentos;
        this.jcbPesquisa = jcbPesquisa;
        this.jbuPesquisar = jbuPesquisar;
        this.jbuFechar = jbuFechar;
        this.jtaPesquisaEquipamentos = jtaPesquisaEquipamentos;
        repositorioEquipamento = new RepositorioEquipamento();
        this.telaEditarEquipamento = telaEditarEquipamento;
        configurarColunasTabela();
    }
    ControladorTelaPrincipal controladorTelaPrincipal;

    protected ModeloTabela obterModeloTabela(JTable tabela) {
        return ((ModeloTabela) tabela.getModel());
    }

    private void configurarColunasTabela() {
        TabelaUtils.configurarTamanhoERenderizadorDeColunas(jtaPesquisaEquipamentos);
    }

    public void obterEquipamento() {
        repositorioEquipamento.listarTodos();
    }

    public List<Equipamento> obterListaEquipamentos() {

        List<Equipamento> resultado = repositorioEquipamento.listar();
        return resultado;

    }

    public void pesquisarResultados() {

        String tipoEquipamento = jcbPesquisa.getSelectedItem().toString();

        List<Equipamento> listaEquipamento = obterListaEquipamentos().stream().filter(equipamento
                -> tipoEquipamento.equals(equipamento.getTipoEquipamento())).collect(Collectors.toList());

        obterModeloTabela(jtaPesquisaEquipamentos).limparDados();

        for (Equipamento equipamento : listaEquipamento) {
            obterModeloTabela(jtaPesquisaEquipamentos).adicionarDado(equipamento);
        }

    }

    public void ocultarTela() {
        telaGerenciarEquipamentos.setVisible(false);
    }

    public Equipamento alterar() {
        int row = jtaPesquisaEquipamentos.getSelectedRow();
        int column = 0;
        Long idLine = (Long) jtaPesquisaEquipamentos.getModel().getValueAt(row, column);
        equipDTO = repositorioEquipamento.buscar(idLine);
        telaEditarEquipamento();
        return equipDTO;

    }
}
