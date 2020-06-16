
public class Pessoa {
	
	private String id;
	private String nome;
	
	public Pessoa(String id, String nome){
		this.id = id;
		this.nome = nome;
	}
	
	public String toString(){
		StringBuilder sb = new StringBuilder();
		sb.append(id);
		sb.append(" - ");
		sb.append(nome);		
		return sb.toString();
	}
}
