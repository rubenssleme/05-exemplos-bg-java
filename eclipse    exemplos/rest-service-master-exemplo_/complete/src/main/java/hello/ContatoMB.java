package hello;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

import org.springframework.stereotype.Component;

@Component
public class ContatoMB {

	private List<Contato> contatos = new ArrayList<Contato>();

	public ContatoMB(){

		for(int i = 0;i < 20; i++){
			contatos.add(generateRandomContato());
		}
	}
	public String [] nomes = {"Eduardo", "Luiz", "Henrique", "Felipe", "Bruna", "Brianda", "Sonia"};

	public List<Contato> getContatos(){
		return contatos;
	}

	public Contato generateRandomContato() {

		int indice = (int) Math.floor(Math.random()*7);
		Contato contato = new Contato();
		contato.setNome(nomes[indice]);
		contato.setEndereco("Rua " + indice);
		contato.setIdade((indice + 1) * 3);
		contato.setDescricao("Teste");
		contato.setTelefone(indice * 20 + "123");
		contato.setDataCadastro(new Date());

		return contato;

	}


}
