/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import br.com.apf.gerenciadorfinanceiro.repositorios.RepositorioEstado;
import br.com.apf.gerenciadorfinanceiro.dominio.Estado;
import java.util.List;
import org.junit.Ignore;
import org.junit.Test;

/**
 *
 * @author rubens.leme
 */
public class RepositorioEstadoTeste {

    @Test
    //@Ignore
    public void salvar() {
        Estado estado = new Estado();
        estado.setNome("São Paulo");
        estado.setSigla("SP");

        RepositorioEstado repositorioEstado = new RepositorioEstado();
        repositorioEstado.salvar(estado);

    }

    
    
    
    
    @Test
    //@Ignore
    public void listar() {
        salvar();
        RepositorioEstado repositorioEstado = new RepositorioEstado();
        List<Estado> resultado = repositorioEstado.listar();

        for (Estado estado : resultado) {
            System.out.println("Codigo: " + estado.getCodigo() + "- Nome: " + estado.getNome() + "- Sigla: " + estado.getSigla());
        }

        System.out.println("Total de Registros: " + resultado.size());
    }
    
    
    
    
    

    @Test
    //@Ignore
    public void buscarTeste() {
        salvar();
        Long codigo = 1L;
        RepositorioEstado repositorioEstado = new RepositorioEstado();
        Estado estado = repositorioEstado.buscar(codigo);
        if(estado == null){
            System.out.println("Registro não encotrado: ");
        }else{
        System.out.println("Registro encotrado: ");
        System.out.println("Codigo: " + estado.getCodigo() + "- Nome: " + estado.getNome() + "- Sigla: " + estado.getSigla());
        }
    }
    
    @Test
    @Ignore
    public void excluirTeste(){
        Long codigo = 1L;
        RepositorioEstado repositorioEstado = new RepositorioEstado();
        Estado estado = repositorioEstado.buscar(codigo);
        if (estado == null){
            System.out.println("Registro não encotrado: ");
        }else {
        System.out.println("Registro removido com sucesso!!! ");
        System.out.println("Codigo: " + estado.getCodigo() + "- Nome: " + estado.getNome() + "- Sigla: " + estado.getSigla());
        repositorioEstado.Excluir(estado); 
            
        }
    }
        
        @Test
        @Ignore
    public void editarTeste(){
        Long codigo = 4L;
        RepositorioEstado repositorioEstado = new RepositorioEstado();
        Estado estado = repositorioEstado.buscar(codigo);
        if (estado == null){
            System.out.println("Registro não encotrado: ");
        }else {
        System.out.println("Registro removido com sucesso!!! ");
        System.out.println("Codigo: " + estado.getCodigo() + "- Nome: " + estado.getNome() + "- Sigla: " + estado.getSigla());
        estado.setNome("São Paulo");
        estado.setSigla("SP");
        repositorioEstado.Editar(estado); 
        System.out.println("Codigo: " + estado.getCodigo() + "- Nome: " + estado.getNome() + "- Sigla: " + estado.getSigla());
            
        }
           
    }

}
