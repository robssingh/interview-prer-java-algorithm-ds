package javaPractice.multiThreading;

public class PrintOddEven extends Thread {

	static int num = 1;

	@Override
	public void run() {
		if (num % 2 == 0) {
			System.out.println(num);
			num++;
		}
	}

	public static void main(String[] args) {
		Thread odd = new Thread(new Runnable() {
			@Override
			public void run() {
				if (num % 2 != 0) {
					System.out.println(num);
					num++;
				}
			}
		}, "t1");
		Thread even = new Thread(new PrintOddEven(), "even");
		odd.start();
		even.start();
	}
}
