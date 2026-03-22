 import java.util.*;
 
   class A {
   
    void add (int a, int...b) {
   
             System.out.println ( a );
			 
			 System.out.println ( Arrays.toString(b));
         
		 // for (int value : b) {
			 
		     // System.out.println( value );
		    //
			//} 
         }
	 }
	 
   public class Constack { 
	 
   public static void main (String [] args) {
   
            A obj = new A ();
            
			obj.add(10,100,200,300,400,500);
   
         }
     }