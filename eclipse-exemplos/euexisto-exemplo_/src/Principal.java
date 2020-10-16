public class Principal {

	public static void main(String[] args) {
		Usuario usu = new Usuario();
		Usuario usu1 = new Usuario("Maria","maria@maria.com.br","maria","123");
		usu.provarExistencia();
		System.out.println("O nome do usuario �:"+ usu1.getNome());
		usu1.setNome("Joaquina");
		System.out.println("O nome do usu�rio �:"+ usu1.getNome());
	}

}
