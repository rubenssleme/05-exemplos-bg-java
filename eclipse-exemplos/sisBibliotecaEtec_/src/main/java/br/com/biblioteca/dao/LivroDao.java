/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.biblioteca.dao;

import br.com.biblioteca.entity.Livro;

/**
 *
 * @author Caio
 */
public class LivroDao extends GenericDao<Livro> {
    
    public void salvar(Livro livro) {
        save(livro);
    }
 
    public void alterar(Livro livro) {
        update(livro);
    }
 
    public void excluir(long id) {
        Livro c = findById(id);
        delete(c);
    } 
}
