  class A {
  
     synchronized  void bank () {
    
	         int a=0;
			 int b=10;
	    do {
		   System.out.println(" It's my startup bank name called is Mariyamman");
           System.out.println(" It's under RBI guidelines ");	
           a++;		   
		}while( a<b );
	    
	  }
  }
  
  class B extends Thread {
	  
	    A ob;
		
		B(A ob) {
	   
	    this.ob=ob;
	    }
		
	    public void run () {
			
		ob.bank();	
		}
  }
   
  public class Apple {
  
  public static void main ( String [] args ) {
	   
	   int c = 0;
       int d = 5;
	   
		A ob = new A ();
		
		B obj = new B (ob);
		
		obj.setDaemon(true); 
        obj.start();
		
		while (c<d) {
			
			System.out.println(" I am MainBank for RBI ");
			c++;
		}
      }
  }