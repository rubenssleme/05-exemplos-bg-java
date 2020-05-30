/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package telamenu;

import javax.swing.JFrame;

/**
 *
 * @author Rubens
 */
public class Telamenu {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        TelaMenuCor janela = new TelaMenuCor();
        janela.setVisible(true);
        janela.setLocationRelativeTo(null);
        janela.setResizable(true);
        janela.setExtendedState(JFrame.MAXIMIZED_BOTH);
        
    }
}
    
