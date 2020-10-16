package controller;

import java.util.ArrayList;
import javax.swing.JOptionPane;
import model.Usuario;

public class GerenciadorUsuario {
static final GerenciadorUsuario instancia = new GerenciadorUsuario();

    public static GerenciadorUsuario getInstancia() {
        return instancia;
    }

    private GerenciadorUsuario() {
    }
    

    static ArrayList<Usuario> usuarios = new ArrayList();

    public void inclui(Usuario usuario) {
        usuarios.add(usuario);
    }

    public String numeroDeUsuario() {
        return usuarios.size() + " Usuarios Cadastrados";
    }

    public Usuario limparCampos() {
        return new Usuario();
    }
    

    public boolean validarUsuarioESenha(String jtfUsuario, String jtfSenha) {
        boolean validado = false;

        if ((!jtfUsuario.equals("")) && (!jtfSenha.equals(""))) {
            validado = true;
        } else {
            validado = false;
        }
        return validado;
    }

    public void autenticarUsuario(String jtfUsuario, String jtfSenha) {

        if (validarUsuarioESenha(jtfUsuario, jtfSenha)) {
            for (Usuario c : usuarios) {
                if ((c.getNome().equals(jtfUsuario)) && (c.getSenha().equals(jtfSenha))) {
                    JOptionPane.showMessageDialog(null, "Usuario Autenticado com sucesso!!");
                }else
            JOptionPane.showMessageDialog(null, "Usuario não Autenticado com sucesso!!");
            
           }
        }
          
    }

}
