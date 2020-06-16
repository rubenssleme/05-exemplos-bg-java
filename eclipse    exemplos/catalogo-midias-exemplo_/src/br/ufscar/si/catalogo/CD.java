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
public class CD extends Midia {
	String artista;
	ArrayList <String> faixas = new ArrayList<String> ();

			
	public CD() {
			
	}

	public CD(String titulo, int anoCriacao, String artista) {
		super(titulo, anoCriacao);
		
	}

	@Override
	public int getTipo(){
		return 1;
	}
	
	@Override
	public void imprimeFichas(){
		super.imprimeFichas();
		Mensagem.exibirMensagem( Arrays.toString (faixas.toArray()));
	}

	public void adicionaFaixa(String faixa, int duracao){
			
		if(this.faixas.size() < 15){
			this.faixas.add("Faixa: " + faixa + " Duração: " + duracao);

		}
		else{
			JOptionPane.showMessageDialog(null,"Não foi possivel adicionar nova faixa.");
		}
	}



}   


