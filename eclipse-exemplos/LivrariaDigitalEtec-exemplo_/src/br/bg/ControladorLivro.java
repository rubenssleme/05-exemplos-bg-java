/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.bg;

import javax.swing.JTextField;

/**
 *
 * @author rubens.leme
 */
public class ControladorLivro {

    private JTextField jtfISBN_ID;
    private JTextField jtfTitulo;
    private JTextField jtfDataPublicacao;
    private JTextField jtfFormatoLivro;
    private JTextField jtfIdFornecedor;
    private JTextField jtfIdEditora;
    private JTextField jtfValorCusto;
    private JTextField jtfValorVenda;
    private Livro livro;

    private RepositorioLivro repositorioLivro;

    public ControladorLivro(JTextField jtfISBN_ID, JTextField jtfTitulo, JTextField jtfDataPublicacao,JTextField jtfFormatoLivro,
            JTextField jtfIdFornecedor, JTextField jtfIdEditora, JTextField jtfValorCusto, JTextField jtfValorVenda) {
        this.jtfISBN_ID = jtfISBN_ID;
        this.jtfTitulo = jtfTitulo;
        this.jtfDataPublicacao = jtfDataPublicacao;
        this.jtfFormatoLivro = jtfFormatoLivro;
        this.jtfIdFornecedor = jtfIdFornecedor;
        this.jtfIdEditora = jtfIdEditora;
        this.jtfValorCusto = jtfValorCusto;
        this.jtfValorVenda = jtfValorVenda;
        repositorioLivro = new RepositorioLivro();
    }

    public Livro inicializarObjeto(Livro livro) {
        livro.setISBN_ID(jtfISBN_ID.getText());
        livro.setTitulo(jtfTitulo.getText());
        livro.setDataPublicacao(jtfDataPublicacao.getText());
        livro.setFormato(jtfFormatoLivro.getText());
        livro.setIdFornecedor(Long.parseLong(jtfIdFornecedor.getText()));
        livro.setIdEditora(Long.parseLong(jtfIdEditora.getText()));
        livro.setValorCusto(Double.parseDouble(jtfValorCusto.getText()));
        livro.setValorVenda(Double.parseDouble(jtfValorVenda.getText()));

        return livro;
    }

    public void salvar() {
        livro = new Livro();
        livro = inicializarObjeto(livro);

        if (repositorioLivro.incluir(livro)) {
            Mensagem.exibirMensagem("Livro " + livro.toString()
                    + " foi salvo com sucesso.");
        } else {
            Mensagem.exibirMensagem("Falha ao salvar o fornecedor "
                    + livro.toString() + ".");
        }

    }

}
