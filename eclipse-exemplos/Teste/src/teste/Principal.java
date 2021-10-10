package teste;
public class Principal {

	public static void main(String[] args) {
		Usuario usuario = new Usuario("Rubens leme", 45);
		
		Administrador adm = new Administrador("Rubens Leme",45);
		
		
		System.out.println(usuario.getNome()+" - " + usuario.getIdade());
	    System.out.println(usuario.toString());	
	    
	    System.out.println("######################");
	    
	    System.out.println(adm.toString());
	    
	}

}
