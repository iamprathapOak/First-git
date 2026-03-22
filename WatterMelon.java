    interface A {
   
     void demo ();
   
    static void add1 () {
		
		System.out.println (" static method ");
	 }
	 
	 default int a () {
		 
		 int z = 10;
		 int x = 10;
		System.out.println (z+x); 
		return 0;
	 }
	
   }
   
   class B implements A {
	   
	   
	   public void demo () {
		 
        System.out.println (" i am abstack ");		 
	   }
	   
	  public int a () {
		  
		A.super.a();  
		System.out.println(" i am override default ");
        return 40;		
	  }
	   
   }
   
   public class WatterMelon {
   
     public static void main ( String [] args ) {
	 
	     B ob = new B ();
		 
		 A.add1();
		 ob.demo();
		 ob.a();
   
         }
   }