
package br.com.bg.controler;

import java.io.Serializable;
import java.util.List;
import javax.annotation.PostConstruct;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.ViewScoped;
import javax.faces.context.FacesContext;
import org.primefaces.event.CellEditEvent;
import org.primefaces.event.RowEditEvent;
import br.com.bg.model.Cliente;
import java.util.Date;


/**
 *
 * @author laramara
 */
@ManagedBean(name="dtEditView")
@ViewScoped
public class EditView implements Serializable{
    private List<Cliente> clientes1;
    private List<Cliente> clientes2;
         
 
    @PostConstruct
    public void init() {
       
        for (int i = 0; i < 20; i++) {
                      clientes1.add(generateRandomCliente());
               }
    }
 
    public List<Cliente> getClientes() {
        return clientes1;
    }
 
    public List<Cliente> getClientes2() {
        return clientes2;
    }
     
   
     
    public void onRowEdit(RowEditEvent event) {
        FacesMessage msg = new FacesMessage("Car Edited", ((Cliente) event.getObject()).getNome());
        FacesContext.getCurrentInstance().addMessage(null, msg);
    }
     
    public void onRowCancel(RowEditEvent event) {
        FacesMessage msg = new FacesMessage("Edit Cancelled", ((Cliente) event.getObject()).getNome());
        FacesContext.getCurrentInstance().addMessage(null, msg);
    }
     
    public void onCellEdit(CellEditEvent event) {
        Object oldValue = event.getOldValue();
        Object newValue = event.getNewValue();
         
        if(newValue != null && !newValue.equals(oldValue)) {
            FacesMessage msg = new FacesMessage(FacesMessage.SEVERITY_INFO, "Cell Changed", "Old: " + oldValue + ", New:" + newValue);
            FacesContext.getCurrentInstance().addMessage(null, msg);
        }
    }
    public String [] nomes = {"Eduardo", "Luiz", "Henrique", "Felipe", "Bruna", "Brianda", "Sonia"};
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
