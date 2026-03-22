  abstract class A {
  
       A ( String a , int b ) {
	   
	     System.out.println (" Bank Name " + a);
		 System.out.println (" start in Bank " + b);
	   }
	   
	   A (long a1, double b1, String c1) {

         System.out.println (" long Value " + a1);
		 System.out.println (" double Value " + b1);
		 System.out.println (" String Value " + c1);
	   }
	   
      abstract void show ();
	  
	  public static void display () {
	  
	     System.out.println (" display method " );
	  }
  
  }
  
  class B extends A {
	  
	    B () {
			
			super ("java", 1995);
			
		}
		
		 B (int x) {
			
			super ( 10000, 200000, " python " );
		 }
	  
	  void show () {
		  
		 System.out.println (" i am abstract class ");
	  } 
	  
	  public static void display () {
		  
		// super.display(); 
		 System.out.println (" i am override display "); 
	  }
	  
  }
  
  public class StrawBerry {
  
      public static void main ( String [] args ) {
  
        A ob = new B ();
        B obj = new B (200);
		ob.show();
		ob.display();
  
      }
  }