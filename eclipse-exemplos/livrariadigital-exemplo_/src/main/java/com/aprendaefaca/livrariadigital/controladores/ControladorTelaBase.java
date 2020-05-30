package com.aprendaefaca.livrariadigital.controladores;

import javax.swing.JDialog;

public class ControladorTelaBase {
	private JDialog telaPai;

	public ControladorTelaBase(JDialog telaPai) {
		this.telaPai = telaPai;
	}

	public void abrirTela() {
		telaPai.setVisible(true);
	}

	public void fecharTela() {
		telaPai.setVisible(false);
	}
}
