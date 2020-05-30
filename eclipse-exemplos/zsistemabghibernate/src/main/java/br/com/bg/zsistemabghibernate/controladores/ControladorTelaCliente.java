/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.bg.zsistemabghibernate.controladores;

import br.com.bg.zsistemabghibernate.dominio.Cliente;
import br.com.bg.zsistemabghibernate.repositorios.RepositorioCliente;
import br.com.bg.zsistemabghibernate.utilitarios.Mensagem;
import javax.swing.JComboBox;
import javax.swing.JTextField;


public class ControladorTelaCliente {
     public JTextField jtfNome;
    public JTextField jtfCPF;
    public JTextField jtfRG;
    public JComboBox  jcbSexo;
    public JTextField jtfEMail;
    private Cliente cliente;
    private RepositorioCliente repositorioCliente;

    public ControladorTelaCliente(JTextField jtfNome, JTextField jtfCPF, JTextField jtfRG,
             JTextField jtfEMail) {
        this.jtfNome = jtfNome;
        this.jtfCPF = jtfCPF;
        this.jtfRG = jtfRG;
        this.jtfEMail = jtfEMail;
        repositorioCliente = new RepositorioCliente();
    }
    
    public Cliente preecherCliente(){
        cliente = new Cliente();
        cliente.setNome(jtfNome.getText());
        cliente.setCpf(jtfCPF.getText());
        cliente.setRg(jtfRG.getText());
        cliente.setTelefone(jcbSexo.getSelectedItem().toString());
        cliente.seteMail(jtfEMail.getText());
        
        return cliente;
    }
    
     public void salvar(){
        if(salvarCliente()){
            Mensagem.exibirMensagem("Cliente salvo com sucesso!!");
        }else{
            Mensagem.exibirMensagem("Cliente não foi salvo");
        }
    }
    
    
  private boolean salvarCliente(){
    cliente = preecherCliente();
    return  repositorioCliente.salvar(cliente);
   }
    
  
}
