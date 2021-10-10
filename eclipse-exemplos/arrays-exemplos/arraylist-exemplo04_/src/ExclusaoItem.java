import java.util.ArrayList;
public class ExclusaoItem {

	public static void main(String args[]){
	
		ArrayList<Pessoa> listaPessoa = new ArrayList<Pessoa>();
			
		Pessoa p1 = new Pessoa("01", "Diego");
		Pessoa p2 = new Pessoa("02", "Gustavo");
		Pessoa p3 = new Pessoa("03", "Java");
			
		listaPessoa.add(p1);
		listaPessoa.add(p2);
		listaPessoa.add(p3);

		listaPessoa.remove(2);
		
		listaPessoa.remove(p2);	
	}
}



