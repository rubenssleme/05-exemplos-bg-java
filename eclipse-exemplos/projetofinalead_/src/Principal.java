import javax.swing.JOptionPane;


public class Principal {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Aluno alu = new Aluno();
		Docente doc = new Docente();
		Funcionario fun = new Funcionario();
		
		
		int opConta = 0; //variavel que indica a conta a ser usada
		int opOperacao = 0;

		do{ 
			opConta  =Integer.parseInt(JOptionPane.showInputDialog("Digite:\n1 - Cadastro\n2 - Consulta\n0 - Sair"));
			if (opConta  != 0)

				do{

					opOperacao =Integer.parseInt(JOptionPane.showInputDialog("Digite:\n1 - Cadastrar Aluno\n2 - Cadastrar Docente\n3 - Cadastrar Funcionario\n4 - Atualizar \n0 - Sair"));

					switch(opConta){ // Abertura da estrutura de switch-case

					case 1: // Menu de Cadastros
 
						if (opOperacao == 1){//Cadastrar Aluno
							String nome = (JOptionPane.showInputDialog("Digite o Nome:"));
							String end = (JOptionPane.showInputDialog("Digite o Endereço:"));
							String username = (JOptionPane.showInputDialog("Digite o User Name:"));
							int senha = Integer.parseInt(JOptionPane.showInputDialog("Digite a Senha:"));
							String email = (JOptionPane.showInputDialog("Digite o Email:"));
							int ra = Integer.parseInt(JOptionPane.showInputDialog("Digite o RA:"));
							String curso = (JOptionPane.showInputDialog("Digite o Curso:"));
							alu.cadastrar(nome, end, username, senha, email, ra, curso)	; 
						}
						if (opOperacao == 2){//Cadastrar Docente
							String nome = (JOptionPane.showInputDialog("Digite o Nome:"));
							String end = (JOptionPane.showInputDialog("Digite o Endereço:"));
							String username = (JOptionPane.showInputDialog("Digite o User Name:"));
							int senha = Integer.parseInt(JOptionPane.showInputDialog("Digite a Senha:"));
							String email = (JOptionPane.showInputDialog("Digite o Email:"));
							String disciplina = (JOptionPane.showInputDialog("Digite o Curso:"));
							doc.cadastrar(nome, end, username, senha, email, disciplina);
						}
						if (opOperacao == 3){//Cadastrar Funcionario
							String nome = (JOptionPane.showInputDialog("Digite o Nome:"));
							String end = (JOptionPane.showInputDialog("Digite o Endereço:"));
							String username = (JOptionPane.showInputDialog("Digite o User Name:"));
							int senha = Integer.parseInt(JOptionPane.showInputDialog("Digite a Senha:"));
							String email = (JOptionPane.showInputDialog("Digite o Email:"));
							String departamento = (JOptionPane.showInputDialog("Digite o Email:"));
							fun.cadastrar(nome, end, username, senha, email, departamento);
							
						}
						
						break;

					case 2: // Visualizar 

						if (opOperacao == 1){//Alunos
							alu.mostra();
							
							
						}
						if (opOperacao == 2){//Docentes
							doc.mostra();
						}
						if (opOperacao == 3){//Funcionarios
							fun.mostra();
						}

						break;
						
					case 3: // Testar Login

						if (opOperacao == 1){// Login Alunos
							String username = (JOptionPane.showInputDialog("Digite o Nome:"));
							int senha = Integer.parseInt(JOptionPane.showInputDialog("Digite o Nome:"));
							alu.testarLogin(username, senha);
							
							
						}
						if (opOperacao == 2){//Login Docentes
							String username = (JOptionPane.showInputDialog("Digite o Nome:"));
							int senha = Integer.parseInt(JOptionPane.showInputDialog("Digite o Nome:"));
							doc.testarLogin(username, senha);
						}
						if (opOperacao == 3){//Login Funcionario
							String username = (JOptionPane.showInputDialog("Digite o Nome:"));
							int senha = Integer.parseInt(JOptionPane.showInputDialog("Digite o Nome:"));
							fun.testarLogin(username, senha);
						}

						break;
					case 0:// Sair do Menu
						JOptionPane.showMessageDialog(null,"Obrigado por usar a nossa agencia");
						break;
					} 

				}while(opOperacao != 0);

		}while(opConta  != 0);
		
		
		
		
		

	}

}
