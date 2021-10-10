/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.bg.sisprojeto;

import br.com.bg.sisprojeto.dao.CidadeDAO;
import br.com.bg.sisprojeto.dao.EstadoDAO;
import br.com.bg.sisprojeto.dominio.Cidade;
import br.com.bg.sisprojeto.dominio.Estado;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Before;

/**
 *
 * @author rubens.leme
 */
public class CidadeDAOTeste {
   
       
     @Test
     public void salvar() {
         
     EstadoDAO estadoDAO = new EstadoDAO();
     Estado estado  = estadoDAO.buscar(2L);
     
     Cidade cidade = new Cidade();
     cidade.setNome("Friburgo");          
     cidade.setEstado(estado);
     
     CidadeDAO cidadeDAO = new CidadeDAO();
     cidadeDAO.salvar(cidade);
     
     }
}
