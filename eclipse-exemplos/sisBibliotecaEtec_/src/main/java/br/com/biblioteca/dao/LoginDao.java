/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.biblioteca.dao;

import br.com.biblioteca.entity.Usuario;
import org.hibernate.Query;
import org.hibernate.Session;

/**
 *
 * @author rubens leme
 */
public class LoginDao extends GenericDao<Usuario> {

    public boolean isValidLoginAndPassword(String login, String password) {
        return SelectComParametros("from Usuario usr where usr.login like ? and usr.senha like ? and usr.ativo = true", login, password) != null;
    }
}
