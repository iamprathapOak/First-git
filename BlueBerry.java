 class A {
 
   void add () {
   
        for ( int i=1; i<=10; i++ ) {
		    
		      System.out.println(i);
		}
    }
 }
 
 class B extends A {
 
   void add () {
	   
        int a=0;
        int b=15;
		
		while (a<=b) {
		
		  System.out.println(a);
		  a++;
		}  
    }   
 }
 
 class D extends Thread {
	 
	 B ob;
	 
	 D ( B ob ) {
		 
		 this.ob=ob;
	 }
	 
	 public void run () {
		 
		ob.add(); 
	 }
	 
	 
 }
 
 public class BlueBerry {
 
   public static void main ( String [] args ) {
 
        B ob = new B ();
		D obj = new D(ob);

		obj.start();
		obj.join();  
		
		int x = 1;
		int z = 5;
		
		do {
			
		System.out.println("i am main thread " + x);
        x++;
			
		} while ( x < z);
 
 
      }
 }