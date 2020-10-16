/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.org.laramara.usse.repositorios;

import br.org.laramara.usse.dominio.Equipamento;
import java.util.List;

/**
 *
 * @author rubens.leme
 */
public class RepositorioEquipamento extends RepositorioGenerico<Equipamento>{
        public void listarTodos(){
        RepositorioEquipamento repositorioEquipamento = new RepositorioEquipamento();
        List<Equipamento> resultado = repositorioEquipamento.listar();
        
        for(Equipamento equipamento : resultado){
            System.out.println(equipamento.toString());
        }
        System.out.println("Total de Registros: " + resultado.size());
    }
}
