import com.exemplo.sisPagbank.utilitarios.Conexao;
import org.junit.Test;

public class TesteConexao {

    @Test
    public void test_conectarBancoSucesso(){
      Conexao cc = new Conexao();
      if(cc.testaConexao()){
          System.out.println(cc.getClass().getSimpleName() + " - OK");
      }
    }

}
