/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicio_1;

public class Principal {
    public static void main(String args[]) {  
       // Login lg = new Login("Rubens","epa");
       
        //java.awt.EventQueue.invokeLater(new Runnable() {
        java.awt.EventQueue.invokeLater(new Runnable(){
            public void run() {
                Flogin telaLogin = new Flogin();
                telaLogin.setTitle("Tela de Login");
                 telaLogin.setVisible(true);  
                       
                
          
            }
        });
    }
 
}