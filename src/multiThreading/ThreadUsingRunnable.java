package multiThreading;

public class ThreadUsingRunnable{
	
//Thread class implements runnable interface
	public static class SampleRunnableThread implements Runnable{
		Thread t;
		public SampleRunnableThread(String name) {
			//key point--creating thread with class which implemented runnable
			t = new Thread(this, name);
			System.out.println("Creating Thread --"+t.getName());
			t.start();
		}
		
		@Override
		//must override run method and provide business logic here
		public void run() {
			System.out.println("Starting thread -- "+t.getName());
			System.out.println("This is running !!");
			System.out.println("Finishing thread -- "+t.getName());
		}
	}

	
// Class extends Thread class to implement thread behavior
	public static class SampleThread extends Thread{
		Thread t;
		public SampleThread(String name) {
			//key point--creating thread with class which implemented runnable- first argument this
			t = new Thread(this, name);
			System.out.println("Creating Thread --"+t.getName());
			t.start();
		}
		
		
		@Override
		//override run method and provide business logic here
		public void run() {
			System.out.println("Starting thread -- "+t.getName());
			System.out.println("This is running !!");
			System.out.println("Finishing thread -- "+t.getName());
		}
	}
	
	
	public static void main(String[] args) {
		//SampleThread T1 = new SampleThread("T1");
	}
	
}
