import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;
public class Data extends JFrame{
	
	JLabel rotulo,rotulo2;
	int ds,dia,mes,ano;
	Calendar data;
	
	String diasemana[]={"Domingo","Segunda - Feira","Terça - Feira","Quarta - Feira",
			"Quinta - Feira","Sexta - Feira","Sábado"};
	String meses[]={"Janeiro","Fevereiro","Março","Abril","Maio","Junho",
			"Julho","Agosto","Setembro","Outubro","Novembro","Dezembro"};
	
	public Data(){
		super("Exemplo de Data");
		Container tela = getContentPane();
		tela.setLayout(null);
		rotulo = new JLabel("");
		rotulo2 = new JLabel("");
		rotulo.setBounds(20,30,280,20);
		rotulo2.setBounds(20,60,280,20);
		data = Calendar.getInstance();
		ds = data.get(Calendar.DAY_OF_WEEK);
		dia = data.get(Calendar.DAY_OF_MONTH);
		mes = data.get(Calendar.MONTH);
		ano = data.get(Calendar.YEAR);
		rotulo.setText("Data: dia semana  "+ds+ " --- dia mês"+dia+"/"+(mes+1)+"/"+ano);
		rotulo2.setText("Data: "+diasemana[ds-1]+", "+dia+" de "+meses[mes]+" de "+ano);
		tela.add(rotulo);
		tela.add(rotulo2);
		setSize(300, 200);
		setVisible(true);
		setLocationRelativeTo(null); }
	
	public static void main(String args[]){
		Data app = new Data();
		app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}