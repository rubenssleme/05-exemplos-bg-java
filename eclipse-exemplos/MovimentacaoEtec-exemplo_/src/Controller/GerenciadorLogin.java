package Controller;
import javax.swing.JOptionPane;
import Modell.Usuario;

public class GerenciadorLogin {

	public boolean validarUsuario(String login, String senha, Usuario usu){
		
		if(login.equals(usu.getLogin()) && senha.equals(usu.getSenha())){
			return true;
		}else{
			JOptionPane.showMessageDialog(null,"Usuario inv�lido!","Erro de valida��o",JOptionPane.ERROR_MESSAGE,null);
			return false;
		}
		
	}
	
}
