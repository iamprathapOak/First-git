 import java.util.Scanner;
 class Factorial{
     int id;
	 String name;
	 String  company;
   public static void show(Factorial ob){
     System.out.println("this the Empoly Id :" +ob.id);
	 System.out.println("this the Empoly Name:" +ob.name);
     System.out.println("our Compamy : "+ob.company);
    }
	public static Factorial display(int id ,String name,String company){
		Factorial obj = new Factorial();
		obj.id=id;
    	obj.name=name;
		obj.company=company;
		return obj;
	}
 public static void main(String[]args){
	    Scanner sc = new Scanner(System.in);
		System.out.println("Empoly id");
		int a1=sc.nextInt();
		sc.nextLine();
		System.out.println("enter the empoly Name");
		String a = sc.nextLine();
		System.out.println("company name");
		String a2=sc.nextLine();
		sc.close();
       Factorial ok=display(a1,a,a2);
	    show(ok);
	  
 
 
   }
 }