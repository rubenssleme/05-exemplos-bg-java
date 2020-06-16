package br.com.bg.sga.servico;

import br.com.bg.sga.dominio.Pessoa;
import java.util.ArrayList;
import java.util.List;
import javax.ejb.Stateless;

@Stateless
public class PessoaServiceRemoteImpl implements PessoaServiceRemote,PessoaService {

    @Override
    public List<Pessoa> listarPessoas() {
        List<Pessoa> pessoas = new ArrayList<>();
        pessoas.add(new Pessoa(1, "Rubens Leme", "Não declarado", "Neide Leme", "rubenss.leme@gmail.com", "5555-5555"));
        pessoas.add(new Pessoa(2, "Rose Leme", "Não declarado", "Neide Leme", "rose.leme@gmail.com", "6666-6666"));

        return pessoas;
    }

    @Override
    public Pessoa bucarPorId(Pessoa pessoa) {
        return null;
    }

    @Override
    public Pessoa buscarPorEmail(Pessoa pessoa) {
        return null;
    }

    @Override
    public void salvarPessoa(Pessoa pessoa) {

    }

    @Override
    public void alterarPessoa(Pessoa pessoa) {

    }

    @Override
    public void removerPessoa(Pessoa pessoa) {

    }

}
