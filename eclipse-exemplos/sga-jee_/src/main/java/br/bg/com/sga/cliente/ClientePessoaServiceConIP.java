
package br.bg.com.sga.cliente;


import java.util.List;
import java.util.Properties;
import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import br.com.bg.sga.dominio.Pessoa;
import br.com.bg.sga.servico.PessoaServiceRemote;


public class ClientePessoaServiceConIP {
    
    
    public static void main(String[] args) {
        System.out.println("Iniciando a chamada ao EJB deste clinte");
        
        try{
            Properties props = new Properties();
            props.setProperty("java.naming.factory.initial","com.sun.enterprise.naming.SerialInitContextFactory");
            props.setProperty("java.naming.factory.url.pkgs","com.sun.enterprise.naming");
            props.setProperty("java.naming.factory.state","com.sun.corba.ee.impl.presentation.rmi.JNDIStateFactoryImpl");
            props.setProperty("org.omg.CORBA.ORBInitialHost","127.0.0.1");
            props.setProperty("org.omg.CORBA.ORBInitialPort", "3700");
            Context jndi = new InitialContext(props);
            PessoaServiceRemote pessoaService = (PessoaServiceRemote) jndi.lookup("java:global/sga-jee1/PessoaServiceRemoteImpl!br.com.bg.sga.servico.PessoaServiceRemote");
            List<Pessoa> pessoas =  pessoaService.listarPessoas();
            for(Pessoa pessoa : pessoas){
                System.out.println(pessoa);
            }
            System.out.println("\nFim da Chamanda ao EJB deste Cliente");
            
        } catch (NamingException e) {
           e.printStackTrace();
        }
    }
            
}
