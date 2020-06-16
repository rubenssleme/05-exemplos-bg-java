package escola;

public class Principal {

	public static void main(String[] args) {
		Aluno rubens  = new Aluno();
		
		rubens.bim1 = 70;
		rubens.bim2 = 60;
		rubens.bim3 = 80;
		rubens.bim4 = 70;
		
		
		System.out.println(rubens.media());
		System.out.println(rubens.passouDeAno());

	}

}
