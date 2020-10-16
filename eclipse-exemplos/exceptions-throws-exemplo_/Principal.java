import javax.swing.*;

public class Principal {

	public static void main(String[] args) {

		Caixa c1 = new Caixa();

		int op;

		do{

			op = Integer.parseInt(JOptionPane.showInputDialog("Digite sua opção: \n1 - Entrada \n2 - Retirada \n3 - Consultar saldo \n0 - Sair \n"));

			switch(op){

			case 1:				

				try{
					c1.entrada();
					
				// se a exception gerada foi a MovimentoZero
				} catch (MovimentoZero erro) {
					// Apresenta a descricao gerada contida no parametro erro
					JOptionPane.showMessageDialog(null, erro, "Erro zero!", 0);
					
				// se a exception gerada foi a MovimentoNegativo
				} catch (MovimentoNegativo erro) {
					// Apresenta a descricao gerada contida no parametro erro						
					JOptionPane.showMessageDialog(null, erro, "Erro negativo!", 0);				
				}		
				break;

			case 2:

				try{
					c1.retirada();
					
				// se a exception gerada foi a MovimentoZero
				} catch (MovimentoZero erro) {
					// Apresenta a descricao gerada contida no parametro erro
					JOptionPane.showMessageDialog(null, erro, "Erro zero!", 0);
					
				// se a exception gerada foi a MovimentoNegativo
				} catch (MovimentoNegativo erro) {
					// Apresenta a descricao gerada contida no parametro erro						
					JOptionPane.showMessageDialog(null, erro, "Erro negativo!", 0);				
				}		
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

		}while(op != 0);

	}

}
