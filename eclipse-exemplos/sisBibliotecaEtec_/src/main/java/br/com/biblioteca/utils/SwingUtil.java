/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.biblioteca.utils;

import java.awt.Component;
import java.awt.Container;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFormattedTextField;
import javax.swing.JTextArea;
import javax.swing.JTextField;

/**
 *
 * @author Caio
 */
public class SwingUtil {
    public static void limparCampos(Container container) {  
        Component components[] = container.getComponents();  
        for (Component component : components) {  
            if (component instanceof JFormattedTextField) {  
                JFormattedTextField field = (JFormattedTextField) component;  
                field.setValue(null);  
            } else if (component instanceof JTextField) {  
                JTextField field = (JTextField) component;  
                field.setText("");  
            } else if (component instanceof JTextArea) {  
                JTextArea area = (JTextArea) component;  
                area.setText("");  
            } else if (component instanceof JComboBox){
                JComboBox combo = (JComboBox)component;
                combo.setSelectedIndex(0);
            }
        }  
    }  
    
    public static void desabilitarCampos(Container container) {  
        Component components[] = container.getComponents();  
        for (Component component : components) {  
            if (component instanceof JFormattedTextField) {  
                JFormattedTextField field = (JFormattedTextField) component;  
                field.setEditable(false);  
            } else if (component instanceof JTextField) {  
                JTextField field = (JTextField) component;  
                field.setEditable(false); 
            } else if (component instanceof JTextArea) {  
                JTextArea area = (JTextArea) component;  
                area.setEditable(false); 
            } else if (component instanceof JButton){
                JButton button = (JButton) component;
                button.setEnabled(false);
            } else if (component instanceof JComboBox){
                JComboBox comboBox = (JComboBox) component;
                comboBox.setEnabled(false);
            } 
        }  
    }  
    
    public static void habilitarCampos(Container container) {  
        Component components[] = container.getComponents();  
        for (Component component : components) {  
            if (component instanceof JFormattedTextField) {  
                JFormattedTextField field = (JFormattedTextField) component;  
                field.setEditable(true);  
            } else if (component instanceof JTextField) {  
                JTextField field = (JTextField) component;  
                field.setEditable(true); 
            } else if (component instanceof JTextArea) {  
                JTextArea area = (JTextArea) component;  
                area.setEditable(true); 
            } else if (component instanceof JButton){
                JButton button = (JButton) component;
                button.setEnabled(true);
            }  else if (component instanceof JComboBox){
                JComboBox comboBox = (JComboBox) component;
                comboBox.setEnabled(true);
            } 
        }  
    }  
}
