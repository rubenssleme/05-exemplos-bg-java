package com.aprendaefaca.conexaojavamaven.view;

import javax.swing.JFrame;
import javax.swing.JTable;

import com.aprendaefaca.conexaojavamaven.control.ControladorTelaMostraProduto;

@SuppressWarnings("serial")
public class TelaMostraProduto extends JFrame {

	JTable jta;

	ControladorTelaMostraProduto controlador;

	public TelaMostraProduto() {
		controlador = new ControladorTelaMostraProduto(this, jta);
		controlador.abrirTela();
	}

	public static void main(String[] args) {
		new TelaMostraProduto();
	}
}
