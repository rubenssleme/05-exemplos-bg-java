package desafioEssential;

import java.util.concurrent.TimeUnit;

public class Threads007 {

	public static void main(String[] args) {
		Object wn = new Object();
		Thread t1 = new Thread(new Runnable() {

			@Override
			public void run() {
				try {
					synchronized(wn) {
						System.out.println("[t1 start wait]");
						TimeUnit.SECONDS.sleep(1);
						wn.wait();
						wn.wait();
						System.out.println("[t1 end wait]");
					}
				} catch (InterruptedException e) {}

			}
		});
		
		Thread t2 = new Thread(new Runnable() {

			@Override
			public void run() {
				try {
					synchronized(wn) {
						System.out.println("[t2 start notify]");
						TimeUnit.SECONDS.sleep(2);
						wn.notify();
						System.out.println("[t2 end notify]");
					}
				} catch (InterruptedException e) {}

			}
		});
		
		Thread t3 = new Thread(new Runnable() {

			@Override
			public void run() {
				try {
					TimeUnit.SECONDS.sleep(2);
					synchronized(wn) {
						System.out.println("[t3 start notify]");
						TimeUnit.SECONDS.sleep(3);
						wn.notify();
						System.out.println("[t3 end notify]");
					}
				} catch (InterruptedException e) {}

			}
		});
		
		t1.start();
		t2.start();
		t3.start();
	}

}
