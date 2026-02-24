 import java.util.Scanner;
 import java.io.*;
 class Gpay{
  
  public void payment()throws IOException{
    Scanner scan = new Scanner(System.in);
     double balance = 1000;
	 int withra=0;
	 byte one=0;
	 byte three = 3;
	 while(one<three){
	 System.out.println("set pin");
     int set=scan.nextInt();
     System.out.println("comform pin");
     int comform = scan.nextInt();
	 if(set==comform){
		 
	   System.out.println("creat password SucessFull");
	   break;
	 }
     else{
		 one++;
	   System.out.println("wrong password");
	   System.out.println("aging one time "+(one-1));
	   scan.nextLine();
	   System.out.println("your card is Block aging try 24 houres"); 
	 }
    }
  }
  //System.out.println("your card is Block aging try 24 houres"); 
 }
  public class Atm extends Gpay{
  
  public static void main(String[]args){
        Gpay obj = new Atm();
           try{
			obj.payment();   
		   }
		   catch(Exception e){
			   System.out.println(e);
		   }
    } 
  }