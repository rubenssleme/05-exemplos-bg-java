package com.aprendaefaca.livrariadigital.controladores;

import com.aprendaefaca.livrariadigital.dominio.ContaAcesso;
import com.aprendaefaca.livrariadigital.repositorio.RepositorioContaAcesso;
import com.aprendaefaca.livrariadigital.utilitarios.Mensagem;
import com.aprendaefaca.livrariadigital.utilitarios.Sessao;
import javax.swing.JDialog;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

/**
 *
 * @author rubens.leme
 */
public class ControladorLogin extends ControladorTelaBase{

    private JTextField tLogin;
    private JPasswordField pSenha;
    private ContaAcesso contaAcesso;
    private RepositorioContaAcesso repositorioContaAcesso;

    public ControladorLogin(JTextField tLogin, JPasswordField pSenha,JDialog telaPai) {
        super(telaPai);
        
        this.tLogin = tLogin;
        this.pSenha = pSenha;
       repositorioContaAcesso = new RepositorioContaAcesso();
        
    }

    public boolean autenticar() {
        boolean autenticado = false;

        contaAcesso = inicializarObjeto();

        if (possuiContaAcesso()) {
            contaAcesso = repositorioContaAcesso.autenticar(contaAcesso);
        }

        if (contaAcesso != null) {
            autenticado = true;
        }
        return autenticado;
    }
      
    public ContaAcesso inicializarObjeto() {
        contaAcesso = new ContaAcesso();
        
        contaAcesso.setLogin(tLogin.getText());
        contaAcesso.setSenha(String.valueOf(pSenha.getPassword()));

        return contaAcesso;
    }

    private boolean possuiContaAcesso() {
        return contaAcesso != null;
    }

}
