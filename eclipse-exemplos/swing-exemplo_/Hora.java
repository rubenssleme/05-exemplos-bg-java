import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;
import java.text.DecimalFormat;
import javax.swing.Timer;
public class Hora extends JFrame{
	JLabel rotulo;
	int hh,mm,ss,h;
	Calendar hora;
	DecimalFormat formato;
	
	public Hora(){
		super("Exemplo de Hora");
		Container tela = getContentPane();
		tela.setLayout(null);
		rotulo = new JLabel("");
		rotulo.setBounds(20,30,280,20);
		ActionListener tarefa = (new ActionListener(){
			public void actionPerformed(ActionEvent e){
				HORAS();
			}
		});
		javax.swing.Timer time = new javax.swing.Timer(1000,tarefa);
		time.start();
		tela.add(rotulo);
		setSize(300, 200);
		setVisible(true);
		setLocationRelativeTo(null);
	}

	private void HORAS(){
		hora = Calendar.getInstance();
		hh = hora.get(Calendar.HOUR_OF_DAY);
		mm = hora.get(Calendar.MINUTE);
		ss = hora.get(Calendar.SECOND);
		formato = new DecimalFormat("00");
		rotulo.setText("Hora: "+formatar(hh%24)+":"+formatar(mm)+":"+formatar(ss));
	}

	private String formatar(int num){
		formato = new DecimalFormat("00");
		return formato.format(num);
	}
	
	
	public static void main(String args[]){
		Hora app = new Hora();
		app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}