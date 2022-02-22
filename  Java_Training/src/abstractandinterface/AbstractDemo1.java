package abstractandinterface;
abstract class Bike{  
	  abstract void run();  
	}  
	class AbstractDemo1 extends Bike{  
	void run(){System.out.println("running safely");}  
	public static void main(String args[]){  
	 AbstractDemo1 obj =new AbstractDemo1();  
	 obj.run();  
	}  
	}  
	
