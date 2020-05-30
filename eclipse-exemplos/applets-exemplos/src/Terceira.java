import java.applet.Applet;
import java.awt.*;
public class Terceira extends Applet {
	String mensagem;
	int contador=1;
	TextField txt1, txt2;
	public void init(){
		txt1 = new TextField("Exemplo de Applet");
		txt2 = new TextField();
		setLayout(new GridLayout(2,1));
		add(txt1);
		add(txt2);
	}
	public void start(){
		System.out.println("Iniciando...");
	}
	public void stop(){
		System.out.println("Parando...");
	}
	public void destroy(){
		System.out.println("Destruindo...");
	}
	public void paint(Graphics g){
		txt2.setText("Atualizou " + contador + " vezes.");
		contador++;
	}
}
