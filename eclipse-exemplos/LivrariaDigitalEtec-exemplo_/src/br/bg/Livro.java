package br.bg;

/**
 *
 * @author rubens.leme
 */
public class Livro {

    private Long id;
    private String ISBN_ID;
    private String titulo;
    private String dataPublicacao;
    private String formatoLivro;
    private Long idFornecedor;
    private Long idEditora;
    private double valorCusto;
    private double valorVenda;

    public Livro() {
    }
    
    
    public Livro(Long id, String ISBN_ID, String titulo, String dataPublicacao,String formatoLivro, Long idFornecedor, Long idEditora, double valorCusto, double valorVenda) {
        this.id = id;
        this.ISBN_ID = ISBN_ID;
        this.titulo = titulo;
        this.dataPublicacao = dataPublicacao;
        this.formatoLivro = formatoLivro;
        this.idFornecedor = idFornecedor;
        this.idEditora = idEditora;
        this.valorCusto = valorCusto;
        this.valorVenda = valorVenda;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getISBN_ID() {
        return ISBN_ID;
    }

    public void setISBN_ID(String ISBN_ID) {
        this.ISBN_ID = ISBN_ID;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDataPublicacao() {
        return dataPublicacao;
    }

    public void setDataPublicacao(String dataPublicacao) {
        this.dataPublicacao = dataPublicacao;
    }

    public String getFormato() {
        return formatoLivro;
    }

    public void setFormato(String formato) {
        this.formatoLivro = formato;
    }
    
    public Long getIdFornecedor() {
        return idFornecedor;
    }

    public void setIdFornecedor(Long idFornecedor) {
        this.idFornecedor = idFornecedor;
    }

    public Long getIdEditora() {
        return idEditora;
    }

    public void setIdEditora(Long idEditora) {
        this.idEditora = idEditora;
    }

    public double getValorCusto() {
        return valorCusto;
    }

    public void setValorCusto(double valorCusto) {
        this.valorCusto = valorCusto;
    }

    public double getValorVenda() {
        return valorVenda;
    }

    public void setValorVenda(double valorVenda) {
        this.valorVenda = valorVenda;
    }
    
    
    
    
     
}
