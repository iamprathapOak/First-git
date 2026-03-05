   import java.util.*;
 import java.io.*;
 class Gpay{
  
  public void payment()throws IOException{
    Scanner scan = new Scanner(System.in);
     double balance = 1000;
	 int withra=0;
	 byte one=1;
	 byte three = 4;
	 while(one<three){
	 System.out.println("set pin");
     int set=scan.nextInt();
     System.out.println("comfirm pin");
     int comform = scan.nextInt();
	 if(set==comform){
	   System.out.println("creat password SucessFull");
	   break;
	 }
     else{
		 one++;
	   System.out.println("wrong password");
	   System.out.println("again  time  "+ (one-4));
	   scan.nextLine();
	 }
    }
	System.out.println("your card is Block again try 24 houres"); 
  }

 }
  class PaymentVersion2 extends Gpay {
	  
   public void payment()throws IOException{
	  
    Scanner scan = new Scanner(System.in);
     double balance = 1000;
	 int withra=0;
	 byte one=1;
	 byte three = 4;
	 while(one<three){
	 System.out.println("set pin");
     int set=scan.nextInt();
     System.out.println("comfirm pin");
     int comform = scan.nextInt();
	 if(set==comform){
	   System.out.println("creat password SucessFull");
	   int roll;
	   do{
		   System.out.println("-->ATM menu<--");
		   System.out.println("check balance enter the number 1");
		   System.out.println(" exit the ATM (2) ");
		   roll=scan.nextInt();
		   switch(roll){
		    case 1:
		   System.out.println("your Current balance :" +balance);
		    break;
			case 3:
			System.out.println("change password (3)");
		   case 4:
		   System.out.println("Thankyou for visit ");
		   break;
		   
		   }
	   }while(roll!=2);
	   break;
	 }
     else{
		 one++;
	   System.out.println("wrong password");
	   System.out.println("again  time  "+ (three-one));
	   scan.nextLine();
	 }
    }
	//System.out.println("your card is Block again try 24 houres"); 
  }
 }
   class PaymentVersion3 extends PaymentVersion2{
	   
	    public void payment()throws IOException{
	  
    Scanner scan = new Scanner(System.in);
     double balance = 1000;
	 int withra=0;
	 int deposite=0;
	 int pin=0;
	 byte one=1;
	 byte three = 4;
	 
	 ArrayList<String> history = new ArrayList<>();
	 
	 while(one<three){
	 System.out.println("set pin");
     int set=scan.nextInt();
     System.out.println("comfirm pin");
     int comform = scan.nextInt();
	 if(set==comform){
		 pin=set;
	   System.out.println("creat password SucessFull");
	   int roll;
	   do{
		   System.out.println("-->ATM menu<--");
		   System.out.print("Enter your choice: ");
		   System.out.println("check balance (1)");
		   System.out.println("withra amount (2)");
		   System.out.println("Deposit amount (3)");
		   System.out.println("Change pin (4)");
		   System.out.println(" View Transaction History(5)");
		   System.out.println(" exit the ATM (6) ");
		   roll=scan.nextInt();
		   switch(roll){
		    case 1:
		   System.out.println("your Current balance :" +balance);
		    break;
			case 2:
			  System.out.println("enter the Withdraw amount");
			  withra =scan.nextInt();
			  balance-=withra;
			  System.out.println("withdraw SucessFull ");
			  break;
			  case 3:
			  System.out.println("Deposit amount");
			  deposite=scan.nextInt();
			  balance+=deposite;
			  System.out.println("Deposite SucessFull ");
			  break;
			  case 4:
			  System.out.println("plese Enter the old pin");
			    int oldpin=scan.nextInt();
				 if(oldpin==pin){
					System.out.println("enter the new pin"); 
				int newpin=scan.nextInt();
				  pin=newpin;
				  System.out.println("pin Change sucessFull");
				 }
				 else{
					System.out.println("old pin is wrong"); 
				 }
				 break;
				 case 5:
                     System.out.println("---- Transaction History ----");
                 if (history.isEmpty()) {
                    System.out.println("No Transactions Yet ❗");
                    } 
					else {
                  for (String record : history) {
                  System.out.println(record);
                      }
                    }
					break;
		   case 6:
		   System.out.println("Thankyou visit again ");
		   break;
		   }
	   }while(roll!=6);
	   break;
	 }
     else{
		 one++;
	   System.out.println("wrong password");
	   System.out.println("again  time  "+ (three-one));
	   scan.nextLine();
	  }
     } 
	}  
   }
  public class CopyProject extends PaymentVersion3{
  
  public static void main(String[]args){
        PaymentVersion3 obj = new CopyProject();
           try{
			obj.payment();   
		   }
		   catch(Exception e){
			   System.out.println("no letter the Only numbers");
		   }
		   main("prathap");
    } 
	public static void main(String name){
		 System.out.println(" with regards devolper :" +name);
	}
  }