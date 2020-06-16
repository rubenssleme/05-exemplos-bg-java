/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.bg.sisprojeto;

import br.com.bg.sisprojeto.dao.EstadoDAO;
import br.com.bg.sisprojeto.dominio.Estado;
import java.util.List;
import org.junit.Ignore;
import org.junit.Test;

/**
 *
 * @author rubens.leme
 */
public class EstadoDAOTeste {

    @Test
    @Ignore
     public void salvar() {
        Estado estado = new Estado();
        estado.setNome("São Paulo");
        estado.setSigla("SP");

        EstadoDAO estadodao = new EstadoDAO();
        estadodao.salvar(estado);

    }

    
    
    
    
    @Test
    @Ignore
    public void listar() {
        EstadoDAO estadodao = new EstadoDAO();
        List<Estado> resultado = estadodao.listar();

        for (Estado estado : resultado) {
            System.out.println("Codigo: " + estado.getCodigo() + "- Nome: " + estado.getNome() + "- Sigla: " + estado.getSigla());
        }

        System.out.println("Total de Registros: " + resultado.size());
    }
    
    
    
    
    

    @Test
    @Ignore
    public void buscarTeste() {
        Long codigo = 1L;
        EstadoDAO estadoDAO = new EstadoDAO();
        Estado estado = estadoDAO.buscar(codigo);
        if(estado == null){
            System.out.println("Registro não encotrado: ");
        }else{
        System.out.println("Registro encotrado: ");
        System.out.println("Codigo: " + estado.getCodigo() + "- Nome: " + estado.getNome() + "- Sigla: " + estado.getSigla());
        }
    }
    
    @Test
    public void excluirTeste(){
        Long codigo = 1L;
        EstadoDAO estadoDAO = new EstadoDAO();
        Estado estado = estadoDAO.buscar(codigo);
        if (estado == null){
            System.out.println("Registro não encotrado: ");
        }else {
        System.out.println("Registro removido com sucesso!!! ");
        System.out.println("Codigo: " + estado.getCodigo() + "- Nome: " + estado.getNome() + "- Sigla: " + estado.getSigla());
        estadoDAO.Excluir(estado); 
            
        }
    }
        
        @Test
    public void editarTeste(){
        Long codigo = 4L;
        EstadoDAO estadoDAO = new EstadoDAO();
        Estado estado = estadoDAO.buscar(codigo);
        if (estado == null){
            System.out.println("Registro não encotrado: ");
        }else {
        System.out.println("Registro removido com sucesso!!! ");
        System.out.println("Codigo: " + estado.getCodigo() + "- Nome: " + estado.getNome() + "- Sigla: " + estado.getSigla());
        estado.setNome("São Paulo");
        estado.setSigla("SP");
        estadoDAO.Editar(estado); 
        System.out.println("Codigo: " + estado.getCodigo() + "- Nome: " + estado.getNome() + "- Sigla: " + estado.getSigla());
            
        }
           
    }

}
