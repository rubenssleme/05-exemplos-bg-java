package com.exemplo.sisBank.controle;

import com.exemplo.sisBank.modelo.Usuario;

import java.util.ArrayList;

public class GerenciadorUsuario {

    private ArrayList<Usuario> usuarios =  new ArrayList<>();

    public void incluirUsuarios() {
       
        for (Usuario usuario : usuarios) {
        	usuarios.add(new Usuario());
		}

    }
}
