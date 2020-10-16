/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.biblioteca.controller;

import br.com.biblioteca.dao.GeneroDao;
import br.com.biblioteca.dao.LivroDao;
import br.com.biblioteca.entity.Genero;
import br.com.biblioteca.entity.Livro;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author Caio
 */
public class LivroController {

    /**
     * Método para inserção de livro no banco de dados
     */
    public Livro salvar(String anoPublicacao, String autor, String codigo, String editora, Genero genero, String isbn, String tema, String titulo) throws Exception {
        Livro livro = new Livro();
        livro.setAnopublicacao(anoPublicacao);
        livro.setAtivo(true);
        livro.setAutor(autor);
        livro.setCodigo(codigo);
        livro.setEditora(editora);
        livro.setIdgenero(genero);
        livro.setIsbn(isbn);
        livro.setStatuslivro(true);
        livro.setTema(tema);
        livro.setTitulo(titulo);
        new LivroDao().salvar(livro);

        return livro;
    }

    /**
     * Método para inserção de livro no banco de dados
     */
    public void alterar(long id, String anoPublicacao, String autor, String codigo, String editora, Genero genero, String isbn, String tema, String titulo) throws Exception {
        Livro livro = new Livro();
        livro.setId(id);
        livro.setAnopublicacao(anoPublicacao);
        livro.setAtivo(true);
        livro.setAutor(autor);
        livro.setCodigo(codigo);
        livro.setEditora(editora);
        livro.setIdgenero(genero);
        livro.setIsbn(isbn);
        livro.setStatuslivro(true);
        livro.setTema(tema);
        livro.setTitulo(titulo);
        new LivroDao().alterar(livro);
    }

    /**
     * Método para alteração de livro no banco de dados
     */
    public List listarLivros() {
        LivroDao dao = new LivroDao();
        try {
            return dao.getPureList("from Livro livro where ativo = true");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Problemas ao localizar livro\n" + e.getLocalizedMessage());
        }
        return null;
    }

    public List listarGeneros() {
        GeneroDao dao = new GeneroDao();
        try {
            return dao.getPureList("from Genero gnr");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Problemas ao localizar generos\n" + e.getLocalizedMessage());
        }
        return null;
    }

    /**
     * Método para exclusão de livro no banco de dados
     */
    public void excluir(Livro livro) throws Exception {
        livro.setAtivo(false);
        new LivroDao().alterar(livro);
    }

    /**
     * Método para buscar de livros por titulo no banco de dados
     */
    public List buscaLivroPorTitulo(String field, String value) throws Exception {
        LivroDao dao = new LivroDao();
        return dao.findByName(field, value);
    }
}
