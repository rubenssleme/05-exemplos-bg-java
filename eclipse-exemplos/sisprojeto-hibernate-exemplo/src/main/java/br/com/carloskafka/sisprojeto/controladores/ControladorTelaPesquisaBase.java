package br.com.carloskafka.sisprojeto.controladores;

import java.util.List;

import javax.swing.JDialog;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class ControladorTelaPesquisaBase {

    protected JTable jtaTabela;
    protected DefaultTableModel modeloTabela;
    protected JDialog telaPai;

    public ControladorTelaPesquisaBase(JDialog telaPai) {
        super();
        this.telaPai = telaPai;
    }

    public void inicializarModelo() {
        if (!possuiModeloTabela()) {
            modeloTabela = (DefaultTableModel) jtaTabela.getModel();
        }
    }

    public void carregarTabela(Object[] dados) {
        limparTabela();
        jtaTabela.revalidate();
        modeloTabela.addRow(dados);
        modeloTabela.fireTableDataChanged();
    }

    public void carregarTabela(List<Object[]> dados) {
        limparTabela();
        jtaTabela.revalidate();
        for (Object[] dado : dados) {
            modeloTabela.addRow(dado);
        }
        modeloTabela.fireTableDataChanged();
    }

    public void limparTabela() {
        modeloTabela.setRowCount(0);
    }

    private boolean possuiModeloTabela() {
        return modeloTabela != null;
    }

    public void fecharTela() {
        telaPai.dispose();
    }

    public void abrirTela() {
        telaPai.setVisible(true);
    }
}
