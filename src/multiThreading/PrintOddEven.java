package multiThreading;

public class PrintOddEven {
	
	static int num =1;
	
	

	public static void main(String[] args) {
		Thread odd = new Thread(new Runnable() {
			@Override
			public void run() {
				if(num%2!=0) {
					System.out.println(num);
					num++;
					}
			}
		}, "t1");
//		Thread t2 = new Thread(new PrintOddEven(), "t2");
		odd.start();
//		t2.start();
	}
}
