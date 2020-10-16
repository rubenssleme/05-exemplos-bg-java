package desafioEssential;

public class Threads03 {

	public static void main(String[] args) {
		Thread t = new Thread(new Runnable() {

			@Override
			public void run() {
				try {
						Thread.sleep(1);
						System.out.println("01");
				} catch (InterruptedException e) {
					System.out.println("01");
				}

			}
		});
		t.setDaemon(true);
		t.start();
		System.out.println("02");
	}

}
