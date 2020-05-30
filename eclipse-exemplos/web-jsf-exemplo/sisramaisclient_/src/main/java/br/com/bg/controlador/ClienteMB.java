package br.com.bg.controlador;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import br.com.bg.dto.Cliente;
import java.io.Serializable;

/**
 *
 * @author laramara
 */

@ManagedBean
@ViewScoped
public class ClienteMB implements Serializable{
     private List<Cliente> clientes = new ArrayList<Cliente>();
         
         public ClienteMB() {
               for (int i = 0; i < 20; i++) {
                      clientes.add(generateRandomCliente());
               }
         }
         
         public String [] nomes = {"Eduardo", "Luiz", "Henrique", "Felipe", "Bruna", "Brianda", "Sonia"};
               
         public List<Cliente> getClientes() {
               return clientes;           
         }
         
         public Cliente generateRandomCliente() {
               
               int indice = (int) Math.floor(Math.random()*7);
               Cliente cliente = new Cliente();
               cliente.setNome(nomes[indice]);
               cliente.setEndereco("Rua " + indice);
               cliente.setIdade((indice + 1) * 3);
               cliente.setDescricao("Teste");
               cliente.setTelefone(indice * 20 + "123");
               cliente.setDataCadastro(new Date());
               
               return cliente;
                             
         }
}
