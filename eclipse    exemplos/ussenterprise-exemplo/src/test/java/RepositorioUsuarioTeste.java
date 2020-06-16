/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import br.org.laramara.usse.dominio.Usuario;
import br.org.laramara.usse.repositorios.RepositorioUsuario;
import java.util.List;
import org.junit.Ignore;
import org.junit.Test;

/**
 *
 * @author rubens.leme
 */
public class RepositorioUsuarioTeste {

    @Test
    public void salvar() {
        Usuario usuario = new Usuario();
        usuario.setNome("a");
        usuario.setPerfil("Admin");
        usuario.setUsuario("a");
        usuario.setSenha("a");

        RepositorioUsuario repositorioUsuario = new RepositorioUsuario();
        repositorioUsuario.salvar(usuario);

    }
    
   @Test
   @Ignore
   public void listar() {
        RepositorioUsuario repositorioUsuario = new RepositorioUsuario();
        List<Usuario> resultado = repositorioUsuario.listar();

        for (Usuario usuario : resultado) {
            System.out.println("Codigo: " + usuario.getId() + "- Nome: " + usuario.getNome() + 
                    "- Perfil: " + usuario.getPerfil());
        }
        System.out.println("Total de Registros: " + resultado.size());
    }
    
   
    @Test
    @Ignore
    public void buscarTeste() {
         Long codigo = 1L;
        Usuario usuario = new RepositorioUsuario().buscar(codigo);
        if(usuario == null){
            System.out.println("Registro não encotrado: ");
        }else{
        System.out.println("Registro encotrado: ");
        System.out.println("Codigo: " + usuario.getId() + " - Nome: " + usuario.getNome() 
            + " - Usuario: " + usuario.getUsuario());
        }
    }
    
    @Test
    @Ignore
    public void excluirTeste(){
        Long codigo = 3L;
        RepositorioUsuario repositorioEstado = new RepositorioUsuario();
        Usuario usuario = repositorioEstado.buscar(codigo);
        if (usuario == null){
            System.out.println("Registro não encotrado: ");
        }else {
        System.out.println("Registro removido com sucesso!!! ");
        System.out.println("Codigo: " + usuario.getId() + "- Nome: " + usuario.getNome() 
                + "- Sigla: " + usuario.getPerfil());
        repositorioEstado.Excluir(usuario);   
        }
    }
      
    @Test
    @Ignore
    public void editarTeste(){
        Long codigo = 4L;
        RepositorioUsuario repositorioEstado = new RepositorioUsuario();
        Usuario usuario = repositorioEstado.buscar(codigo);
        if (usuario == null){
            System.out.println("Registro não encotrado: ");
        }else {
        System.out.println("Registro removido com sucesso!!! ");
        System.out.println("Codigo: " + usuario.getId() + "- Nome: " + usuario.getNome() + 
                "- Perfil: " + usuario.getPerfil());
        usuario.setNome("Rubens 4 Leme");
        usuario.setUsuario("rleme");
        usuario.setPerfil("Admin");
        usuario.setSenha("1234567");
        repositorioEstado.Editar(usuario); 
        System.out.println("Codigo: " + usuario.getId() + "- Nome: " + usuario.getNome() + 
                "- Perfil: " + usuario.getPerfil());
            
        }
           
    }

}
