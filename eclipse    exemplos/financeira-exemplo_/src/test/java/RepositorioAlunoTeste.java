/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import br.com.apf.gerenciadorfinanceiro.dominio.Aluno;
import br.com.apf.gerenciadorfinanceiro.repositorios.RepositorioAluno;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author rubens.leme
 */
public class RepositorioAlunoTeste {
    
   @Test
    //@Ignore
    public void salvar() {
       Aluno aluno = new Aluno();
        aluno.setNome("a");
        aluno.setCpf(12345678);
        aluno.setRg(25252525);
        aluno.setSexo("a");
        

        RepositorioAluno repositorioAluno = new RepositorioAluno();
        repositorioAluno.salvar(aluno);

    }

    
}
