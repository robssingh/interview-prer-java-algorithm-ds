package javaPractice.multiThreading;

import java.util.concurrent.Executors;
import java.util.concurrent.ExecutorService;

public class ThreadPool implements Runnable {
	private String name;

	public ThreadPool(String s) {
		name = s;
	}

	public void run() {
		for (int i = 0; i < 5; i++) {
			if (i == 0) {
				System.out.println("Initializing thread--" + name);
			} else {
				System.out.println("Running thread -- " + name);
			}
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

	public static void main(String[] args) {
		Runnable t1 = new ThreadPool("Thread 1");
		Runnable t2 = new ThreadPool("Thread 2");
		Runnable t3 = new ThreadPool("Thread 3");
		Runnable t4 = new ThreadPool("Thread 4");
		Runnable t5 = new ThreadPool("Thread 5");

		// create thread pool of size 3
		ExecutorService pool = Executors.newFixedThreadPool(3);

		// pass runnable objects to the pool
		pool.execute(t1);
		pool.execute(t2);
		pool.execute(t3);
		pool.execute(t4);
		pool.execute(t5);

	}

}
