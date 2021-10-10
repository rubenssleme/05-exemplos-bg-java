package exemplolambdaslivro;

import java.awt.Button;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

//Outro exemplo: Listeners
public class Capitulo2b {
	Button button;
//exemplo 01
	void teste1() {
		button.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("evento do click acionado");
			}
		});
	}
	
//exemplo 02
	void teste2() {
		button.addActionListener(event -> System.out.println("evento do click acionado"));
	}
}
