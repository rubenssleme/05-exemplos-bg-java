/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.org.laramara.usse.controladores;

import br.org.laramara.usse.dominio.Equipamento;
import br.org.laramara.usse.dominio.Bios;
import br.org.laramara.usse.fabricas.FabricaEquipamento;
import br.org.laramara.usse.repositorios.RepositorioEquipamento;
import br.org.laramara.usse.utilitarios.Mensagem;
import br.org.laramara.usse.utilitarios.NumeroUtils;
import javax.swing.JComboBox;
import javax.swing.JInternalFrame;
import javax.swing.JTextField;

/**
 *
 * @author rubens.leme
 */
public class ControladorTelaEditarServidores {

    private JInternalFrame tela;
    private JTextField jtfDataCadastro;
    private JTextField jtfDataCompra;
    private JTextField jtfNomeServidor;
    private JTextField jtfMarca;
    private JTextField jtfModelo;
    private JTextField jtfSistemaOperacional;
    private JTextField jtfEnderecoIP;
    private JComboBox jcbTipoEquipamento;
    
    private JTextField jtfDataManutencao;
    private JTextField jtfQuantidadeVMs;
    private JTextField jtfServiceTag;
    private Bios bios;
    private RepositorioEquipamento  repositorioEquipamento;
   
    

    public ControladorTelaEditarServidores(JInternalFrame tela, JTextField jtfDataCadastro, JTextField jtfDataCompra, 
            JTextField jtfNomeServidor, JTextField jtfMarca, JTextField jtfModelo,
            JTextField jtfSistemaOperacional, JTextField jtfEnderecoIP,JComboBox jcbTipoEquipamento,
            JTextField jtfDataManutencao,JTextField jtfQuantidadeVMs,JTextField jtfServiceTag) {
        this.tela = tela;
        this.jtfDataCadastro = jtfDataCadastro;
        this.jtfDataCompra = jtfDataCompra;
        this.jtfNomeServidor = jtfNomeServidor;
        this.jtfMarca = jtfMarca;
        this.jtfModelo = jtfModelo;
        this.jtfSistemaOperacional = jtfSistemaOperacional;
        this.jtfEnderecoIP = jtfEnderecoIP;
        this.jcbTipoEquipamento = jcbTipoEquipamento;
        this.bios = bios;
        this.repositorioEquipamento = new RepositorioEquipamento();
        this.jtfDataManutencao = jtfDataManutencao;
        this.jtfQuantidadeVMs = jtfQuantidadeVMs;
        this.jtfServiceTag = jtfServiceTag;
       
    }
    

    public void ocultarTela() {
        tela.setVisible(false);
    }

    private void limparCampos() {
        jtfDataCadastro.setText(null);
        jtfDataCompra.setText(null);
        jtfEnderecoIP.setText(null);
        jtfMarca.setText(null);
        jtfModelo.setText(null);
        jtfNomeServidor.setText(null);
        jtfSistemaOperacional.setText(null);

    }
    

    public boolean camposPreenchidos() {
        return !(jtfDataCompra.getText().isEmpty()
                || jtfNomeServidor.getText().isEmpty()
                || jtfMarca.getText().isEmpty()
                || jtfModelo.getText().isEmpty()
                || jtfSistemaOperacional.getText().isEmpty()
                || jtfEnderecoIP.getText().isEmpty());
    }

    public void salvar() {   
       Equipamento equipamento =  FabricaEquipamento.obterEquipamento(jtfDataCadastro.getText(),jtfDataCompra.getText(),
       jtfNomeServidor.getText(),jtfMarca.getText(),jtfModelo.getText(),jtfSistemaOperacional.getText(),
       jtfEnderecoIP.getText(),jcbTipoEquipamento.getSelectedItem().toString(),jtfDataManutencao.getText(),NumeroUtils.obterNumeroInteiroInvalido(jtfQuantidadeVMs.getText()),NumeroUtils.obterNumeroLongInvalido(jtfServiceTag.getText()),"Depto - RH",8080,"Admin","admin");
        if (camposPreenchidos()) {
            if (salvarEquipamento(equipamento)) {
                Mensagem.exibirMensagem(equipamento.getTipoEquipamento() + " salvo com sucesso!");
               //   limparCampos();
            } else {
                Mensagem.exibirMensagem("Erro ao salvar equipamento!");
            }
        } else {
            Mensagem.exibirMensagem("Preencha campos obrigatorios");
        }
    }
    
    public boolean salvarEquipamento(Equipamento e){
        return repositorioEquipamento.salvar(e);
    }
    
    
}
