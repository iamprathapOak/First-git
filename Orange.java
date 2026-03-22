 import java.util.*;
 import java.io.*;
 
 class A {
  
      void add (double pepole) throws IOException {
        
		long amount = 3000;
	    pepole = 0;
        
		 if ( pepole > amount ) {
              
			  System.out.println ( " Congaiztion ");
           }
		 else {
		 
		   System.out.println ("Sorry you loan amount big ");
		   
		   throw new IOException ("your loan amount 3000 ");
		 }
       }
  }
  
  public  class Orange {
  
    public static void main ( String [] args ) {
     
	 Scanner sc = new Scanner (System.in) ;
	 
	 System.out.println (" enter the Loan amount ");
	 
	  double b = sc.nextDouble();
	  
	 A ob = new A ();
	 
     try{
		 
	 ob.add(b);
	 }
     catch (Exception e) {
		 
		System.out.println( e ); 
	 }
	}
  }