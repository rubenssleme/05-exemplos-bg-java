import javax.swing.*;

public class Principal {

	public static void main(String[] args) {


		Caixa c1 = new Caixa();

		int op=0;

		do{
			try{
				op = Integer.parseInt(JOptionPane.showInputDialog("Digite sua opção: \n1 - Entrada \n2 - Retirada \n3 - Consultar saldo \n0 - Sair \n"));

				switch(op){

				case 1:				
					c1.entrada();
					break;

				case 2:
					c1.retirada();
					break;

				case 3:
					JOptionPane.showMessageDialog(null, "Saldo atual: " + c1.getSaldo());
					break;

				case 0:
					JOptionPane.showMessageDialog(null, "Programa finalizado!");
					break;

				default:
					JOptionPane.showMessageDialog(null, "Opção inválida!");
				}
			}catch (NumberFormatException erro){
				// Apresenta mensagem personalizada
				JOptionPane.showMessageDialog(null, "Digite apenas numeros!", "Tipo invalido!", 0);
			}catch(Exception e){
				JOptionPane.showMessageDialog(null, "Ocorreu o erro: "+e.getMessage(), "Erro.", 0);
			}
		}while(op != 0);
	}

}
