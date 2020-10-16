package br.org.laramara.syscontatos.controlador;

import br.org.laramara.syscontatos.model.Contato;
import java.io.Serializable;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import org.codehaus.jackson.map.ObjectMapper;

import com.sun.jersey.api.client.Client;
import com.sun.jersey.api.client.WebResource;

import br.org.laramara.syscontatos.servico.ServicoUsuario;
import java.util.ArrayList;
import java.util.List;
import org.codehaus.jackson.type.TypeReference;


@ManagedBean(name="controladorContato")
@SessionScoped
public class ControladorContato implements Serializable{
	private ServicoUsuario servico = new ServicoUsuario();
	private static final long serialVersionUID = 6201600595084284192L;

    public ControladorContato() {
           this.carregarContato();
    }
       
        
        List<Contato> contatos;

	public void carregarContato(){
		contatos = new ArrayList<Contato>();
		Client c = Client.create();
		WebResource wr = c.resource("http://localhost:8081/greeting/");
		System.out.println("CHAMOU O URI....");
		
		try {
		contatos = new ObjectMapper().readValue(wr.get(String.class), new TypeReference<List<Contato>>(){});
			System.out.println(contatos);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}

	public List<Contato> getContatos() {
		return contatos;
	}
}
