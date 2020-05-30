package exemplolambdaslivro;
//Outro exemplo: Runnable
class Capitulo2a {

//Runnable que conta de 0 a 1000;
//exemplo 01
	void teste1() {
		Runnable r = new Runnable() {
			public void run() {
				for (int i = 0; i <= 1000; i++) {
					System.out.println(i);
				}
			}
		};

		new Thread(r).start();
	}

//exemplo 02
	void teste2() {
		Runnable r = () -> {
			for (int i = 0; i <= 1000; i++) {
				System.out.println(i);
			}
		};
		new Thread(r).start();
	}

//exemplo 02
	void teste3() {
		new Thread(() -> {
			for (int i = 0; i <= 1000; i++) {
				System.out.println(i);
			}

		}).start();

	}

}