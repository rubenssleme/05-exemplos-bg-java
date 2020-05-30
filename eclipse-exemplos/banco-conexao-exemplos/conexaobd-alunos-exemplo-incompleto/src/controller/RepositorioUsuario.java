package controller;

import java.util.List;
import javax.swing.JOptionPane;
import model.Usuario;

public  class RepositorioUsuario extends RepositorioBase implements IRepositorioBase<Usuario>{
	
	@Override
	public boolean salvar(Usuario usuario) {
		if(usuario!= null ){
			//Exibir o valor do objeto Usuario
			JOptionPane.showMessageDialog(null,usuario.toString());
			return true;
		}else{
			return false;
		}

	}

}
