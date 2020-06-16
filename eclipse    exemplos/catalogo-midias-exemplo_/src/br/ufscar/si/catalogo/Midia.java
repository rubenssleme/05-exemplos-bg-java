/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ufscar.si.catalogo;

import javax.swing.JOptionPane;
import br.ufscar.si.catalogo.CD;

/**
 *
 * @author Ana Paula
 */
public abstract class Midia {
    String titulo;
    int anoCriacao;
    
    public Midia() {
		this("",0);
		
	}
    
    public Midia(String titulo, int anoCriacao){
        this.titulo = titulo;
        this.anoCriacao = anoCriacao; 
    }
    
    protected abstract int  getTipo();
      
   
    void imprimeFichas(){
        Mensagem.exibirMensagem("Titulo: " + titulo + "\n Ano: " + anoCriacao + "\n Tipo: " + getTipo());
    }
    
    
}
