
package br.com.bg.sga.servico;


import java.util.List;
import br.com.bg.sga.dominio.Pessoa;
import javax.ejb.Local;


@Local
public interface PessoaService {
    public List<Pessoa> listarPessoas();
    public Pessoa bucarPorId(Pessoa pessoa);
    public Pessoa buscarPorEmail(Pessoa pessoa);
    public void salvarPessoa(Pessoa pessoa);
    public void alterarPessoa(Pessoa pessoa);
    public void removerPessoa(Pessoa pessoa);
}
