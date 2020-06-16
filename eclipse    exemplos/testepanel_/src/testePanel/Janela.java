package testePanel;

import java.awt.*;

import javax.swing.*;



public class Janela extends JFrame {     
    
    JTextField jTxtField1 = new JTextField(10);     
    JLabel jLabel1 = new JLabel("Pasta:");     
    JButton jButton1 = new JButton("Atualizar");     
      
    public Janela() {     
        JPanel painel = new JPanel();    
        painel.setLayout(new GridLayout(7,2));  
          
        JPanel painel2 = new JPanel();  
        painel2.setLayout(new FlowLayout(FlowLayout.LEFT));  
          
        painel2.add(jLabel1);  
        painel2.add(jTxtField1);   
          
        painel.add(painel2);  
        painel.add(jButton1);  
          
        this.setContentPane(painel);   
        this.setSize(310,220);     
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);     
        this.setLocationRelativeTo(null);     
        this.setTitle("JFrame, FUCK YEAH!");   
    }      
    
    public static void main(String[] args) {     
        new Janela().setVisible(true);     
    }     
}    