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
public class Jogo extends Midia{
	ArrayList<String> genero = new ArrayList<String> ();

	public Jogo() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Jogo(String titulo, int anoCriacao){
		super(titulo, anoCriacao);
	}

	@Override
	public int getTipo(){
		return 3;
	}

	void adicionaGenero(String genero){
		this.genero.add("Genero: " + genero);
	}

	@Override
	void imprimeFichas(){
		JOptionPane.showInputDialog(null, Arrays.toString (genero.toArray()));
	}


}
