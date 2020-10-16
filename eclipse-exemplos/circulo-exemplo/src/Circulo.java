import javax.swing.JOptionPane;


public class Circulo {

	//	 Atributos
	private double raio;



	// Inicializando o atributo zerado
	public Circulo(){
		this(0.0);
	}

	// Inicializando o atributo com parâmetro
	public Circulo(double pRaio) {
		this.raio = pRaio;

	}
	public double getRaio() {
		return raio;
	}
	public void setRaio(double pRaio) {
		this.raio = pRaio;
	}

	
	//Le o valor do raio do círculo e coloca a informação no atributo raio.
	public void cadastraCirculo()
	{
		//double valorRaio = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor do Raio: "));
		
		double valorRaio = Double.parseDouble(Mensagem.exibirPergunta("Digite o valor do Raio: "));
		this.setRaio(valorRaio);
	}

	//	Verifica se o valor do raio do círculo é maior que zero, se for exibe o
	//valor do diâmetro do círculo, sabendo-se que o valor do diâmetro do círculo é 
	//de 2 vezes o valor do raio.
	//Se o raio do círculo for igual a zero exibe a mensagem que é necessário 
	//se cadastrar o circulo antes de calcular seu diâmetro. 
	
	public void calculaDiametro()
	{
		if (this.getRaio() > 0) {
			double diametroCirculo = this.getRaio() * 2;
			//JOptionPane.showMessageDialog(null,"O Diametro =" + String.valueOf(diametroCirculo));
			
			Mensagem.exibirMensagem("O Diametro =" + String.valueOf(diametroCirculo));
		} 
		else
			// JOptionPane.showMessageDialog(null, "É necessário cadastrar o círculo antes de calcular o diâmetro");
			Mensagem.exibirMensagem("É necessário cadastrar o círculo antes de calcular o diâmetro");


	}

	//	Verifica se o valor do raio do círculo é maior que zero, se for calcula e 
	//exibe o valor do Perímetro do circulo, sabendo-se que o mesmo é dado pela 
	//	fórmula 2 vezes PI vezes o raio.
	//Se o raio do círculo for igual a zero exibe a mensagem que é necessário
	//se cadastrar o circulo antes de calcular seu Perímetro. Utilizar para PI o valor 3,1416.

	public void calculaPerimetro()
	{
		if (this.getRaio() > 0) {
			double perimetroCirculo = (2 * 3.1416) * this.getRaio();
			//JOptionPane.showMessageDialog(null,"O raio =" + String.valueOf(perimetroCirculo));
			Mensagem.exibirMensagem("O raio =" + String.valueOf(perimetroCirculo));
		}else{
			//JOptionPane.showMessageDialog(null,"É necessário cadastrar o círculo antes de calcular o Perimetro");
			Mensagem.exibirMensagem("É necessário cadastrar o círculo antes de calcular o Perimetro");
		}
	}



	//Verifica se o valor do raio do círculo é maior que zero, se for calcula e 
	//exibe o valor da Área do circulo, sabendo-se que o mesmo é dado pela 
	//fórmula PI vezes o raio ao quadrado.
	//Se o raio do círculo for igual a zero exibe a mensagem 
	//que é necessário se cadastrar o circulo antes de calcular sua Área. 
	//Utilizar para PI o valor 3,1416.
	
	public void calculaArea()
	{
		if (this.getRaio() > 0) {
			double raioCirculo = 3.1416 * (this.getRaio() * this.getRaio());
			//JOptionPane.showMessageDialog(null,"O raio =" + String.valueOf(raio));
			Mensagem.exibirMensagem("O raio =" + String.valueOf(raioCirculo));
		
		}else{
			//JOptionPane.showMessageDialog(null,"É necessário cadastrar o círculo antes de calcular o Area");
			Mensagem.exibirMensagem("É necessário cadastrar o círculo antes de calcular o Area");
		}

	}

}
