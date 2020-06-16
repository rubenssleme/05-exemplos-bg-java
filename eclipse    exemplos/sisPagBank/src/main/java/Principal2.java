import com.exemplo.sisPagbank.dominio.ContaCorrente;

import javax.swing.JOptionPane;

public class Principal2 {

    public static void main(String[] args) {
        ContaCorrente contaCorrente = new ContaCorrente();
        int opPro,opOperacao = 0;
        do {
            opPro = Integer.parseInt(JOptionPane.showInputDialog(
                    "Escolha uma opção de Conta:\n1 - Conta Corrente \n2 - Conta Poupança \n3 - Consultar Saldo \n0 - Sair"));

            if ((opPro == 1) || (opPro == 2)) {// Vendo se é conta corrente ou conta poupança.
                System.out.println("Conta tipo :" + opPro);

                do {
                    opOperacao =Integer.parseInt(JOptionPane.showInputDialog("Escolha uma operação:\n1 - Depositar \n2 - Sacar \n3 - Consultar \n4 - Atualizar \n0 - Sair"));

                    switch(opPro){ // Abertura da estrutura de switch-case
                        case 1: //Para opção conta 1
                            if (opOperacao == 1){//depositar
                                System.out.println(" operação :" + 1);
                            }
                            if (opOperacao == 2){//debitar
                                System.out.println(" operação :" + 2);
                            }
                            if (opOperacao == 3){//Consultar
                                System.out.println(" operação :" + 3);
                            }
                            if (opOperacao == 4){//atualizar valor
                                System.out.println(" operação :" + 4);
                            }
                            if (opOperacao == 0){//atualizar valor
                                System.out.println(" operação :" + 0);
                            }
                            break;
                        case 2: //Para opção conta 2
                            System.out.println("caso :" + 2);
                            break;
                        case 3: //Para opção conta 3
                            System.out.println("caso :" + 3);
                            break;
                        case 0:	//Para opção conta 0
                            System.out.println("caso :" + 0);
                            break;
                    }

                }while(true);

            } else {
                if (opPro == 3) { // Totaliza Contas
                    System.out.println("Conta tipo :" + opPro);

                }
            }

        } while (true);

    }

}
