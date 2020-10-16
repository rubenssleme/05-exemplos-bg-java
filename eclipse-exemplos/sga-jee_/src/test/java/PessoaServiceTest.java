
import br.com.bg.sga.dominio.Pessoa;
import br.com.bg.sga.servico.PessoaService;
import java.util.List;
import javax.ejb.embeddable.EJBContainer;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Before;

public class PessoaServiceTest {

    private PessoaService pessoaService;

    @Before
    public void setUP() throws Exception {
        EJBContainer container = EJBContainer.createEJBContainer();
        pessoaService = (PessoaService) container.getContext().lookup("java:global/classes/PessoaServiceRemoteImpl!br.com.bg.sga.servico.PessoaService");
    }
    @Test
    public void testEJBPessoaService(){
        System.out.println("Iniciando Teste EJB PessoaService");
        assertTrue(pessoaService != null);
        assertEquals(2, pessoaService.listarPessoas().size());
        
        System.out.println("O numero de pessoas é igual : " +  pessoaService.listarPessoas().size());
        
        this.removerPessoas(pessoaService.listarPessoas());
        
    }
    
    public void removerPessoas(List<Pessoa> pessoas){
        for(Pessoa pessoa : pessoas){
            System.out.println(pessoa);
        }
    }
}
