  import java.io.*;
  
  class Demon extends Thread {
  
     void add () {  
     
	 for(int i=0; i<=20; i++) {
	     
		try {
	    Thread.sleep(1000);
		
	    System.out.println(" backThread " + i);
	    	}
		catch (Exception e) {
			
			System.out.println(e);
		    }
	   }
    } 
	
	public void run () {
		
		add();
	}
  
   }
 
 public class FreantEnd {
  
    public static void main (String [] args) throws  InterruptedException {
  
       Demon ob = new Demon ();
	   
       ob.setDaemon(true);
	   
	   ob.start();
	   
	   for (int j=0; j<=10; j++) {
		   
		   Thread.sleep(1000);
		   
		   System.out.println(" Main Thread " + j);
	   }
     }
  }