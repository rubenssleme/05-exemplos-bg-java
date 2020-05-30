
import br.org.laramara.usse.dominio.Equipamento;
import br.org.laramara.usse.dominio.Servidor;
import br.org.laramara.usse.repositorios.RepositorioEquipamento;
import br.org.laramara.usse.utilitarios.Mensagem;
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
public class RepositorioServidorTeste {
    
     @Test
     @Ignore
    public void salvar() {
        Servidor servidor = new Servidor();
        servidor.setMarca("Compacq");
        servidor.setModelo("1835");
        servidor.setQuantidadesVms(5);
        RepositorioEquipamento repositorioServidor = new RepositorioEquipamento();
        repositorioServidor.salvar(servidor);

    }
    @Test
    public void listar(){
        RepositorioEquipamento repositorioServidor = new RepositorioEquipamento();
        List<Equipamento> resultado = repositorioServidor.listar();
        
        for(Equipamento equipamento : resultado){
            Mensagem.exibirMensagem(equipamento.toString());
        }
        Mensagem.exibirMensagem("Total de Registros: " + resultado.size());
    }
    
}
