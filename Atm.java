 import java.util.Scanner;
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
		   case 2:
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
  public class Atm extends PaymentVersion2{
  
  public static void main(String[]args){
        PaymentVersion2 obj = new Atm();
           try{
			obj.payment();   
		   }
		   catch(Exception e){
			   System.out.println(e);
		   }
    } 
  }