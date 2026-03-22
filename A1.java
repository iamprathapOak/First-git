   interface A {
   
    
     static void add () {
		
        System.out.println (" i am Java 8 Adavanc " );
	  }
	  
	 default void show () {
		  
		System.out.println (" i am java Developer ");
	  }
	  
	   void java ();      // this is funchion interface becasue one method abstack ;
	  
   }
   
   class B implements A {
	   
	  public void java () {
		  
        System.out.println ( " i am java 7 ");		  
	   }
   }
   
   public class A1 {
   
     public static void main ( String [] args ) {
		 
		 B ob = new B ();
		 ob.java();
         A.add();
		 ob.show();
      
	    }
   }