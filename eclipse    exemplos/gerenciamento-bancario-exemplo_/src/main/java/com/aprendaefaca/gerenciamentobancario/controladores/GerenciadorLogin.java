package com.aprendaefaca.gerenciamentobancario.controladores;
import javax.swing.JOptionPane;
import com.aprendaefaca.gerenciamentobancario.modelos.Usuario;

public class GerenciadorLogin {

	public boolean validarUsuario(String login, String senha, Usuario usu){
		
		if(login.equals(usu.getLogin()) && senha.equals(usu.getSenha())){
			return true;
		}else{
			JOptionPane.showMessageDialog(null,"Usuario invnlido!","Erro de validao",JOptionPane.ERROR_MESSAGE,null);
			return false;
		}
		
	}
	
}
