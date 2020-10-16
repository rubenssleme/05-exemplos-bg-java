package javaee7crud;

import javax.faces.bean.ManagedBean;
import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.Entity;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import javaee7crud.entities.DadosDTO;

@ManagedBean
public class ControladorTela {
     
    private String text;
 
    public String getText() {
        return text;
    }
    
	public void setText(String text) {
    	Client client = ClientBuilder.newClient();
		WebTarget myResource = client.target("http://www.mocky.io/v2/59b0726f100000ed09db21c5");
		Response rs = myResource.request(MediaType.APPLICATION_JSON)
				.post(Entity.json(new DadosDTO("mykey", "value")), Response.class);
		DadosDTO retorno = rs.readEntity(DadosDTO.class);
        this.text = retorno.toString()+"YYY";
    }
}