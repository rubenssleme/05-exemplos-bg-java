package projetoPato;

public class MiniDuckSimulator {

	public static void main(String[] args) {

		Duck model = new ModelDuck();

		model.performFly();
		model.setFlyBehavior(new FlyRocketPowared());
		model.performFly();

	}

}
