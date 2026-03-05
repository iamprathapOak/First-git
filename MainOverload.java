  public class MainOverload{
   
    public static void main (String [] args) {
		  
		    MainOverload ob = new MainOverload();
   
              main(" XXXX ", " IFCA9080ICI ");
			  main(" ABCD ", " Tambaram ", " Chennai ", " TamilNadu ", " India ");
			  main(8667305535l, 600045);
              main(10000.0);  
			  ob. main(1000);
			  
	   }
	   
    public static void main (String name, String accountnumer) {
		  
	      System.out.println(" Account Holder Name :" + name);
			
	      System.out.println(" Your Account Number :" + accountnumer);
		  
      }
	  
    public static void main (String bankname, String branch, String location, String state , String country) {
		  
		  System.out.println(" Your Bank Name :" + bankname);
		  
		  System.out.println(" Branch :" + branch);
		  
		  System.out.println(" City :" + location);
		  
		  System.out.println(" State :" + state);
		  
		  System.out.println(" Country :" + country);
		  
	  }
	  
	public static void main (long mob, int bin) {
		
		 System.out.println(" Mobile Number :" + mob);
		 
		 System.out.println(" PIN Code :" + bin);
		 
	 }
	  
	public static void main (double balance) {
			
          System.out.println(" Your blance :" + balance);
			  
      }  
	   
	public static void main (int min) {
	  
	      System.out.println(" Maintain fot minmum blance :" + min);
	  
      }
   
  }