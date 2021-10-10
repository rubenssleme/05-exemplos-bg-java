
package br.bg.com.sga.cliente;

import br.com.bg.sga.dominio.Pessoa;
import br.com.bg.sga.servico.PessoaServiceRemote;
import java.util.List;
import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;


public class ClientePessoaService {
    
    
    
    public static void main(String[] args) {

        System.out.println("Iniciando llamada al EJB desde el cliente\n");
        try {
            Context jndi = new InitialContext();
            PessoaServiceRemote pessoaService = (PessoaServiceRemote) jndi.lookup("java:global/sga-jee1/PessoaServiceRemoteImpl!br.com.bg.sga.servico.PessoaServiceRemote");
            

            List<Pessoa> pessoas = pessoaService.listarPessoas();

            for (Pessoa pessoa : pessoas) {
                System.out.println(pessoa);
            }
            System.out.println("\nFin llamada al EJB desde el cliente");
        } catch (NamingException e) {
            e.printStackTrace();
        }
    }
}
