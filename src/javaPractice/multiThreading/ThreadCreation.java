package javaPractice.multiThreading;

public class ThreadCreation extends Thread {

	static void doThreadWork(int j) throws InterruptedException {

		for (int i = 0; i < 3; i++) {
			Thread.sleep(1000);
			System.out.println("thread running--" + i * j);
		}

	}

	public void run() {
		try {
			doThreadWork(5);
		} catch (InterruptedException e) {
			System.out.println("caught exception --");
		}
	}

	public static void main(String[] args) throws InterruptedException {
		// create thread with anonymous block
		Thread t1 = new Thread() {
			public void run() {
				System.out.println("Thread created using anonymous block");
			}
		};
		t1.start();

		// create thread by class extending thread class
		ThreadCreation obj1 = new ThreadCreation();
		ThreadCreation obj2 = new ThreadCreation();
		ThreadCreation obj3 = new ThreadCreation();
		obj1.start();
		obj1.join();
		obj2.start();
		obj2.join();
		obj3.start();

	}

}
