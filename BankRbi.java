   interface Grovrnment {
   
        void loan();
   }
   
   class Hdfc implements Grovrnment  {
   
          public void loan () {
			  
		  int a = 100000;
		  System.out.println("HDFC loan Amount for " + a); 
	   }
   }
   
   class Sbi implements Grovrnment  {
	   
	      public void loan () {
			  
		  long b = 200000;
          System.out.println("SBI minimum loan " + b);  
	   }
   }
   
   class IndianBank implements Grovrnment  {
	   
	        public void loan () {
				
			long c = 3300000;
			System.out.println("INDIAN bank loan " + c);
		}   
   }
   
   class LoanOfficer {
       
	   public Grovrnment getLo (int number) {
		   
		   if(number==1) {
			   
		    return new Hdfc();
		   }
		   
		   if(number==2) {
			 
             return new Sbi();			 
		   }
		   
		   if(number==3) {
			  
             return new IndianBank ();			  
		   }
		   return null; 
	   }
    }
	
   public class BankRbi {
  
   public static void main (String [] args) {
  
        LoanOfficer ob = new LoanOfficer ();
		
	    Grovrnment obj = ob.getLo (3);
		
	    obj.loan();
  
    }
  }