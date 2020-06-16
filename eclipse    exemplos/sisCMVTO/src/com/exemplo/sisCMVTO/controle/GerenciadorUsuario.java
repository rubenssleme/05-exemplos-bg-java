package com.exemplo.sisCMVTO.controle;

import com.exemplo.sisCMVTO.modelo.Usuario;

import java.util.ArrayList;

public class GerenciadorUsuario {

    private ArrayList<Usuario> usuarios =  new ArrayList<>();

    public void incluirUsuarios() {
       
        for (Usuario usuario : usuarios) {
        	usuarios.add(new Usuario());
		}

    }
}
