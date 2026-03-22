import java.util.Scanner;

 class A {
 
     private int bike;
     private long car;
	 
	  A ( int bike, long car ) {
		 
		this.bike = bike; 
		this.car = car;
	 }
	 
	 public void show (double employee) {
		 
		 if ( bike <= employee ) {
			
            System.out.println("your price getin the Bike ");			
		 }
		 
		 else if ( car <= employee ) {
			 
			System.out.println("Your price getin the Car " ); 
		 }
		 
		 else {
			 
			System.out.println("Sorry your amount low ");
		 }
	 }
  }
  
 public class Banana {
 
 public static void main (String [] args) {
 
      A ob = new A (1500, 20000);
	  
	 Scanner sc = new Scanner (System.in) ;
	 
	 System.out.println(" Telling your amount ");
 
     double a = sc.nextDouble();
	 
	 // System.out.println(" you are need ");
	   
	 // int b = sc.nextInt();
	   
	   ob.show (a);
	   
	  // ob.show (b);
     }
  }