
package br.com.bg.controladores;

import br.com.bg.modelo.Usuario;
import javax.swing.JComboBox;
import javax.swing.JTextField;


public class ControladorTelaCadastroUsuario {
  
    private JTextField jtfCodigo;
   private JTextField jtfNome;
   private JTextField jtfEMail;
   private JComboBox jcbTipo;
   private JTextField jtfLogin;
   private JTextField jtfSenha;

    public ControladorTelaCadastroUsuario(JTextField jtfCodigo, JTextField jtfNome, JTextField jtfEMail, JComboBox jcbTipo, JTextField jtfLogin, JTextField jtfSenha) {
        this.jtfCodigo = jtfCodigo;
        this.jtfNome = jtfNome;
        this.jtfEMail = jtfEMail;
        this.jcbTipo = jcbTipo;
        this.jtfLogin = jtfLogin;
        this.jtfSenha = jtfSenha;
    }
   
   
   public void preencherObjeto(Usuario usuario ){
       
       usuario.setNome(jtfNome.getText());
       usuario.setEMail(jtfEMail.getText());
       usuario.setTipo(jcbTipo.getSelectedItem().toString());
       usuario.setLogin(jtfLogin.getText());
       usuario.setSenha(jtfSenha.getText());
    }
    
    
    
}
