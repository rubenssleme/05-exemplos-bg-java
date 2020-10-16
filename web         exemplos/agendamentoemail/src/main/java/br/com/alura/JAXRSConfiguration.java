
package br.com.alura;

import javax.ws.rs.ApplicationPath;
import javax.ws.rs.core.Application;

import br.com.alura.controlador.CaminhoRecurso;


/**
 * @author rhuanrocha
 */


@ApplicationPath(CaminhoRecurso.URL_BASE)
public class JAXRSConfiguration extends Application {

}