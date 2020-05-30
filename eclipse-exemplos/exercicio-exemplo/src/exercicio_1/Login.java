/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicio_1;

import javax.swing.JOptionPane;

/**
 *
 * @author Rubens
 */
public class Login {
  //Declaraçao dos Atributos  
    String usuario;
    String senha;
    
    
  // Contrutor sem Valor
    
    public Login(){
     this("","");    
    }
  // Contrutor com Valor
    
    public Login(String usuario, String senha){
        this.usuario = usuario;
        this.senha = senha;       
    }
    //Metodos get e set
    public String getUsuario(){
        
       return usuario;
    }
    
    public void setUsuario(String valor){
        
        this.usuario = valor;
    }
    
    public String getSenha(){
        
        return senha;
    }
    
    public void setSenha(String valor){
        this.senha = valor;
        
    }
    
 // Metodo validar usuario e senha ....
    
    
    public String validar(String Usuario, String Senha){
        // Flogin clie = new Flogin();
        String retorno = "";
     if ((Usuario.equals(""))&&(Senha.equals(""))){
         JOptionPane.showMessageDialog(null, "Vazio");
    } else{
         JOptionPane.showMessageDialog(null, "OK");
         retorno  = "senha";
             
    } 
         
       
      return retorno ; 
        
    }
    
    
    
    
    
}
