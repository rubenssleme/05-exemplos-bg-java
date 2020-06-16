import static org.junit.Assert.*;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.junit.Test;

import br.com.bg.dominio.Servidor;
import br.com.bg.repositorio.RepositorioServidor;

public class CadastroTeste {

	@Test
	public void cadastroTest() {
		Servidor  servidor = new Servidor();
		RepositorioServidor rep= new RepositorioServidor();
		Date d = new Date();
		SimpleDateFormat formatador = new SimpleDateFormat("dd/MM/yyyy");
		
		
		servidor.setNomeServidor("nomeServidor");
		servidor.setMarca("marca");
		servidor.setModelo("modelo");
		servidor.setSistemaOperacional("sistemaOperacional");
		servidor.setEnderecoIP("enderecoIP");
		servidor.setDataCompra(d);
		
		rep.salvarRegistro(servidor);
		
	}

}
