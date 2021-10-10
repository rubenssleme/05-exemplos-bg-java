package projetoviagem;

import javax.swing.JOptionPane;

public class TesteViagem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Viagem passeio  = new Viagem();
		
		
		int tempo = (Integer.parseInt(JOptionPane.showInputDialog("Digite o tempo da viagem:")));
		int velocidadeMedia = (Integer.parseInt(JOptionPane.showInputDialog("Digite a velocidade media da viagem:")));
		
		
		
		passeio.calculaDistancia(tempo, velocidadeMedia);
		String message = "Distancia percorrida: " + passeio.retornaDistancia() +" kilometros";
		JOptionPane.showMessageDialog(null, message);
		
		passeio.calculaGastoCombustivel(passeio.retornaDistancia());
		String message1 = "Combustivel gasto: " + passeio.retornaCombustivelGasto() +" Litros de combustivel" ;
		JOptionPane.showMessageDialog(null, message1);
	}

}
