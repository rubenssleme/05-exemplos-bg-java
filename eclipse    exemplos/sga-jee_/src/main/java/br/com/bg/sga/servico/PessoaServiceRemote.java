
package br.com.bg.sga.servico;


import java.util.List;
import javax.ejb.Remote;
import br.com.bg.sga.dominio.Pessoa;


@Remote
public interface PessoaServiceRemote {
    public List<Pessoa> listarPessoas();
    public Pessoa bucarPorId(Pessoa pessoa);
    public Pessoa buscarPorEmail(Pessoa pessoa);
    public void salvarPessoa(Pessoa pessoa);
    public void alterarPessoa(Pessoa pessoa);
    public void removerPessoa(Pessoa pessoa);
}
