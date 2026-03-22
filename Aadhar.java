  import java.util.Scanner;
  
   public class Aadhar {
 
   public static void main ( String [] args ) {
	  
	    Scanner scan = new Scanner ( System.in);
		
		System.out.println("__Welcome To This Is Aadhar Card Apply  Managment System__ ");
		
        System.out.println(" Enter you Name " ); 
		String name = scan.nextLine ();
		
		System.out.println(" Tell Me father name ");
		String father = scan.nextLine();
		
		System.out.println(" Tell Mee Your Dateofbrith ");
		String a = scan.nextLine();
		
		System.out.println(" Male ,Female ,Other ");
		String genter = scan.nextLine();
		
		System.out.println(" Tell Mee Your Home Address ");
		String add = scan.nextLine();
		
		System.out.println(" Enter your state ");
		String state = scan.nextLine();
		
		System.out.println(" Enter your pin code ");
		long pin = scan.nextLong();
		
		System.out.println (" Enter The Aadhar Card Number ");
		long number = scan.nextLong();
		scan.nextLine();
		
		System.out.println(" Enter Your Mobile Number ");
		long mobile = scan.nextLong();
		
		main (name , father, a , genter , add);
		main (state, pin);
		main (number, mobile);
		
          }
		  
   public static void main ( String name , String father, String dateof , String genter , String add ) {
  
         System.out.println ( "_____Uniqu Identification Of India_____");
         System.out.println ( " To.");
         System.out.println ( " your name :" + name+" "+father);
		 System.out.println ( " your date of brith :" + dateof );
		 System.out.println ( " Genter :" + genter );
		 System.out.println ( " your Address :" + add);
          }
		  
	public static void main ( String state, long pin ) {
		
		 System.out.println ( " your Are State :" + state );
		 System.out.println ( " your Pin code :" + pin );
	     }
		  
   public static void main ( long number, long mobile ) {
	   
	    System.out.println (" your Aadhar number :" + number);
		System.out.println (" your are mobile number :" + mobile);
		
		System.out.println (" THIS DEVELOPER FOR - >() { PRATHAP } "  );
		
          }
    }