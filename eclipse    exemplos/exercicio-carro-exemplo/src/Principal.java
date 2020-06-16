
import javax.swing.JOptionPane;

public class Principal {


	public static void main(String[] args) {
		Carro car = new Carro("Voyage","Volkswagen",5,0);
		car.ligar();
		car.subirMarcha();
		System.out.println(car.getMarchaAtual());
		JOptionPane.showMessageDialog(null, car.getMarchaAtual());
		car.subirMarcha();
		System.out.println(car.getMarchaAtual());
		car.subirMarcha();
		System.out.println(car.getMarchaAtual());
		car.subirMarcha();
		System.out.println(car.getMarchaAtual());
		car.subirMarcha();
		System.out.println(car.getMarchaAtual());
		car.descerMarcha();
		System.out.println(car.getMarchaAtual());
		car.descerMarcha();
		System.out.println(car.getMarchaAtual());
		car.descerMarcha();
		System.out.println(car.getMarchaAtual());
		car.descerMarcha();
		System.out.println(car.getMarchaAtual());
		car.descerMarcha();
		System.out.println(car.getMarchaAtual());
		car.desligar();
		System.out.println("O modelo do carro é: " + car.getModelo());
		System.out.println("A marca do carro é: " + car.getMarca());
		System.out.println("O número de portas do carro : " + car.getNroPortas());
		System.out.println("A marcha atual do carro : " + car.getMarchaAtual());
	}

}
