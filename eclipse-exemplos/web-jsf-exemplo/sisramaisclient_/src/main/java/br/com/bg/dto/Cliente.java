package br.com.bg.dto;

/**
 *
 * @author rubens leme
 */
import java.util.Date;
   
  public class Cliente {
         
         private String nome;
         private String endereco;
         private String telefone;
         private int idade;
         private String descricao;
         private Date dataCadastro;
         
      public Cliente() {
               
         }
   
         public Cliente(String nome, String endereco, String telefone, int idade,
                      String descricao, Date dataCadastro) {
               super();
               this.nome = nome;
               this.endereco = endereco;
               this.telefone = telefone;
               this.idade = idade;
               this.descricao = descricao;
               this.dataCadastro = dataCadastro;
         }
   
         public String getNome() {
               return nome;
         }
         
         public void setNome(String nome) {
               this.nome = nome;
         }
         
         public String getEndereco() {
               return endereco;
         }
         
         public void setEndereco(String endereco) {
               this.endereco = endereco;
         }
         
         public String getTelefone() {
               return telefone;
         }
         
         public void setTelefone(String telefone) {
               this.telefone = telefone;
         }
         
         public int getIdade() {
               return idade;
         }
         
         public void setIdade(int idade) {
               this.idade = idade;
         }
         
         public String getDescricao() {
               return descricao;
         }
         
         public void setDescricao(String descricao) {
               this.descricao = descricao;
         }
         
         public Date getDataCadastro() {
               return dataCadastro;
         }
         
         public void setDataCadastro(Date dataCadastro) {
               this.dataCadastro = dataCadastro;
         }
   
  } 
