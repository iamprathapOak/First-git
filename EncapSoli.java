 import java.util.Scanner;
 
    class EncapSoli {
  
     private int password ;
	 private double balance ;
  
    public void setPassword ( int password ) {
      
	 this.password=password; 
    }
  
    public void setBalance ( double balance ) {
		
	 this.balance=balance;	
	}
  
    public int getPassword() {
  
       return password;
    }
  
    public double getBalance() {
		
		return balance;
	}
	
   public static void main (String [] args) {
  
      EncapSoli ob = new EncapSoli();
	  
	  Scanner sc = new Scanner( System. in );
	
	 System.out.println(" private password ");
	
	   int a = sc.nextInt();
	
	   ob.setPassword(a);
	   
	   System.out.println(ob.getPassword());
	   
	   System.out.println(" your balance ");
	   
	   ob.setBalance( 200000);
	   
	   System.out.println(ob.getBalance());
	
    }
 }