
import javax.swing.ImageIcon;
import javax.swing.JFrame;
public class DefinirIconeFormulario extends JFrame{
	
	public DefinirIconeFormulario(){
		super("Como definir o ícone para a janela");
		ImageIcon icone = new ImageIcon("Tux.gif");
		setIconImage(icone.getImage());
		setSize(300, 150);
		setVisible(true);
	}
	
	public static void main(String args[]){
		DefinirIconeFormulario app = new DefinirIconeFormulario();
		app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}