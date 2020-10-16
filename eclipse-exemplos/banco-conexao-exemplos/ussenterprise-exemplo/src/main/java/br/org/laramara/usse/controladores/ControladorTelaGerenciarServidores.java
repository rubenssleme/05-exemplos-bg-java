/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.org.laramara.usse.controladores;

import br.org.laramara.usse.dominio.Equipamento;
import br.org.laramara.usse.dominio.Servidor;
import br.org.laramara.usse.modelos.ModeloTabela;
import br.org.laramara.usse.modelos.ModeloTabelaEquipamento;
import br.org.laramara.usse.repositorios.RepositorioEquipamento;
import java.util.List;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JTable;

/**
 *
 * @author rubens.leme
 */
public class ControladorTelaGerenciarServidores {
    private JComboBox<String> jcbPesquisa;
    private JButton jbuPesquisar, jbuFechar;
    private JTable jtaPesquisaServidores;
    private RepositorioEquipamento repositorioServidor;
  
    
   protected ModeloTabela obterModeloTabela(JTable tabela){
        return ((ModeloTabela)tabela.getModel());
    }

   
    public ControladorTelaGerenciarServidores(JComboBox<String> jcbPesquisa, JButton jbuPesquisar, 
            JButton jbuFechar, JTable jtaPesquisaServidores) {
        
        this.jcbPesquisa = jcbPesquisa;
        this.jbuPesquisar = jbuPesquisar;
        this.jbuFechar = jbuFechar;
        this.jtaPesquisaServidores = jtaPesquisaServidores;
        repositorioServidor = new RepositorioEquipamento();
        
    }
    
    public void obterServidor(){
        repositorioServidor.listarTodos();
    }
    
    public List<Equipamento> obterListaServidor(){
     
     List<Equipamento> resultado = repositorioServidor.listar();
     return resultado;
        
     /*   for(Servidor servidor : resultado){
            Mensagem.exibirMensagem(servidor.toString());
        }
      
      return (ModeloTabelaAtendimentoIndividual)obterModeloTabela(jtaAtendimentosIndividuais);
        Mensagem.exibirMensagem("Total de Registros: " + resultado.size());*/
    }
    
    private ModeloTabelaEquipamento obterModeloTabelaServidor(){
        return (ModeloTabelaEquipamento)obterModeloTabela(jtaPesquisaServidores);
    }
    
  
  
   /* protected void apresentarResultado(obterListaServidor<Servidor> resultado, JTable jta) throws InterruptedException {
        jta.setEnabled(true);
       
        Thread.sleep(50);
        if (resultado.sucesso()) {
            adicionarDtos(resultado.getObjetosDto(), jta);
        } else {
          //  limparTabela(jta);
           // JOptionPanePersonalizado.mostrarTelaErro(telaPai, resultado.obterMensagens());
            Mensagem.exibirMensagem("Erro jta");
        }
        jta.requestFocusInWindow();
    }*/
    public void apresentaResultados(){
    //    DefaultTableModel modelo = (DefaultTableModel) jtaPesquisaServidores.getModel();
       // modelo.setNumRows(0);
       
        for (Equipamento equipamento : obterListaServidor()){
            obterModeloTabela(jtaPesquisaServidores).adicionarDado(equipamento);
        }
    }
    
    protected void adicionarDtos(List<? extends Servidor> objetosDmo, JTable tabela){
        ((ModeloTabela)tabela.getModel()).adicionarDMO(objetosDmo);
    }
    

}