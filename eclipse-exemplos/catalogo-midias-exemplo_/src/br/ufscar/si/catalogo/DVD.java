/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ufscar.si.catalogo;

import javax.swing.JOptionPane;
import java.util.ArrayList;
import java.util.Arrays;

/**
 *
 * @author Ana Paula
 */
public class DVD extends Midia{
    String diretor;
    ArrayList <String> artista = new ArrayList<String> ();
    
    
   
    public DVD() {
		super();
		// TODO Auto-generated constructor stub
	}


	public DVD (String titulo, int anoCriacao, String diretor){
        super(titulo, anoCriacao);
        this.diretor = diretor;
    }

        
    @Override
   public  int getTipo(){
        return 2;
    }
    void adicionaArtista(String artista, String papel){
        if(this.artista.size() < 5){
            this.artista.add("Artista: " + artista + ", Papel: " + papel );
        }
        else{
            JOptionPane.showMessageDialog(null, "Não foi possíveladicionar novo artista.");
        }
    }
    
    @Override
    void imprimeFichas(){
     JOptionPane.showMessageDialog(null, Arrays.toString(artista.toArray()));
    }

    
}
