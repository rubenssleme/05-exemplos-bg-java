package br.org.laramara.usse.testes.repositorio;

import br.org.laramara.usse.dominio.Roteador;
import br.org.laramara.usse.repositorios.RepositorioRoteador;
import java.util.List;
import org.junit.Ignore;
import org.junit.Test;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author rubens.leme
 */
public class RepositorioRoteadorTeste {

    @Test
    public void salvar() {
        Roteador roteador = new Roteador();
        roteador.setMarca("Tp-Link");
        roteador.setModelo("xls1542");
        roteador.setUsuario("admin");
        roteador.setSenha("senhaA");
        RepositorioRoteador repositorioRoteador = new RepositorioRoteador();
        repositorioRoteador.salvar(roteador);

    }

    @Test
    public void listar() {
        RepositorioRoteador repositorioRoteador = new RepositorioRoteador();
        List<Roteador> resultado = repositorioRoteador.listar();

        for (Roteador roteador : resultado) {
            System.out.println(roteador.toString());
        }
        System.out.println("Total de Registros: " + resultado.size());
    }
}
