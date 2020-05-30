import javax.swing.JFrame;

public class ContainerDeJanelas extends JFrame {
	public ContainerDeJanelas() {
		
		add(new Fase());
		setTitle("Joguin");
		setSize(500,400);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		setResizable(false);
		setVisible(true);
	}

	public static void main(String[] args) {
		new ContainerDeJanelas();

	}

}
