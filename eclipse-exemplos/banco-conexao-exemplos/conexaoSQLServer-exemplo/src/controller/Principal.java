package controller;

import view.TelaCadastroCliente;

public class Principal {

	public static void main(String[] args) {

		java.awt.EventQueue.invokeLater(new Runnable(){
			public void run() {
				new TelaCadastroCliente().setVisible(true);
			}
		});


	}

}
