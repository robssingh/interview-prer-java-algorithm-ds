package multiThreading;

public class PrintOddEven {
	
	static int num =1;
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Thread odd = new Thread(new Runnable() {
			@Override
			public void run() {
				// TODO Auto-generated method stub
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
