package br.com.bg.bghibernate.controladores;

import br.com.bg.bghibernate.utilitarios.Mensagem;
import br.com.bg.bghibernate.dominio.Cliente;
import br.com.bg.bghibernate.repositorios.RepositorioCliente;
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
            JComboBox jcbSexo, JTextField jtfEMail) {
        this.jtfNome = jtfNome;
        this.jtfCPF = jtfCPF;
        this.jtfRG = jtfRG;
        this.jcbSexo = jcbSexo;
        this.jtfEMail = jtfEMail;
        repositorioCliente = new RepositorioCliente();
    }

    
    public void salvar(){
        if(salvarCliente()){
            Mensagem.exibirMensagem("Cliente salvo com sucesso!!");
        }else{
            Mensagem.exibirMensagem("Cliente não foi salvo");
        }
    }
    
    
    
    
    private Cliente preecherCliente(){
        cliente = new Cliente();
        cliente.setNome(jtfNome.getText());
        cliente.setCPF(jtfCPF.getText());
        cliente.setRG(jtfRG.getText());
        cliente.setSexo(jcbSexo.getSelectedItem().toString());
        cliente.seteMail(jtfEMail.getText());
        
        return cliente;
        
    }
    
    
  private boolean salvarCliente(){
    cliente = preecherCliente();
    return  repositorioCliente.salvar(cliente);
   }
    

}
