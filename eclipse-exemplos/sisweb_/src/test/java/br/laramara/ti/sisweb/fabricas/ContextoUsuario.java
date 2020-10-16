package br.laramara.ti.sisweb.fabricas;

import br.laramara.ti.sisweb.dominio.Usuario;

public class ContextoUsuario {
	public static Usuario fabricarUsuarioAdministradorComTodosOsDados() {
		Usuario usuario = new Usuario();

		usuario.setCpf("41045861880");

		return usuario;
	}
	
	public static Usuario fabricarUsuarioComumComTodosOsDados() {
		Usuario usuario = new Usuario();

		usuario.setCpf("71894810287");

		return usuario;
	}
	
}
