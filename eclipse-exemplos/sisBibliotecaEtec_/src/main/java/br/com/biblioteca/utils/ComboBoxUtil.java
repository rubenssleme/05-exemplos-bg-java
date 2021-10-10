/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.biblioteca.utils;

import java.util.ArrayList;  
import java.util.Collection;  
  
import javax.swing.ComboBoxModel;  
import javax.swing.event.ListDataListener;  
/**
 *
 * @author Caio
 */
public class ComboBoxUtil<E> implements ComboBoxModel {
    private  ArrayList<E> dados=null;  
    private  int index;  
      
    private  E selected_item = null;    
      
    public ComboBoxUtil (Collection<E> lista){  
        dados=new ArrayList<E>();  
        for (E dado : lista) {  
            dados.add(dado);  
        }  
    }  
      
    public int getSelectedIndex(){    
        return index;    
    }    
    
    public void setSelectedIndex(int anIndex){    
        this.index = anIndex;    
    }    
        
    @Override  
    public Object getElementAt(int index) {  
        return dados.get(index);  
    }  
  
    @Override  
    public int getSize() {  
        return dados.size();  
    }  
  
  
    @Override  
    public Object getSelectedItem() {  
        return selected_item;  
    }  
  
    @Override  
    public void setSelectedItem(Object anItem) {  
         selected_item = (E)anItem;    
         setSelectedIndex(dados.indexOf(anItem));  
    }  
      
    @Override  
    public void removeListDataListener(ListDataListener arg0) {  
        // TODO Auto-generated method stub  
    }  
      
    @Override  
    public void addListDataListener(ListDataListener arg0) {  
        // TODO Auto-generated method stub  
    }  
}
