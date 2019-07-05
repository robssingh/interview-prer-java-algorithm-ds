package practice;
import multiThreading.ThreadUsingRunnable;
class Base { 
    protected int x, y; 
   
    
     static derived doSth() {
    	System.out.println("--- Point class doing something ---");
    	return new derived();
    }
  
//public class Main { 
    public static void main(String args[]) { 
      Base p = null; 
//      System.out.println("x = " + p.x + ", y = " + p.y); 
//      p.doSth();
      derived obj1 = new derived();
      obj1.doSth();
      
      
    }     
}
class derived extends Base{
	
//	@Override
	static derived doSth(){
		 System.out.println("--derived class doSth--");
		return new derived();
	}
	
}