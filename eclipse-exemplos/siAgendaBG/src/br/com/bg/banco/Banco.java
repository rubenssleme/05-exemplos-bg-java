package br.com.bg.banco;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Banco {

	private static List<Contato> agenda = new ArrayList<>();
	private static Integer chaveSequencial = 1;

	static {
		Contato contato = new Contato();
		contato.setId(chaveSequencial++);
		contato.setNomeContato("Alura");
		Contato contato2 = new Contato();
		contato2.setId(chaveSequencial++);
		contato2.setNomeContato("Caelum");
		agenda.add(contato);
		agenda.add(contato);
	}

	public void adiciona(Contato contato) {
		contato.setId(Banco.chaveSequencial++);
		Banco.agenda.add(contato);
	}

	public List<Contato> getContato(){
		return Banco.agenda;
	}

	public void removeContato(Integer id) {

		Iterator<Contato> it = agenda.iterator();

		while(it.hasNext()) {
			Contato emp = it.next();

			if(emp.getId() == id) {
				it.remove();
			}
		}
	}

	public Contato buscaContatoPeloId(Integer id) {
		for (Contato contato : agenda) {
			if(contato.getId() == id) {
				return contato;
			}
		}
		return null;
	}

}