    import java.util.Scanner;
 class Factorial7{
     int id;
	 String name;
	 String  company;
   public static void show(Factorial7 ob){
     System.out.println("this the Empoly Id :" +ob.id);
	 System.out.println("this the Empoly Name:" +ob.name);
     System.out.println("our Compamy : "+ob.company);
    }
	public static Factorial7 display(int id ,String name,String company){
		Factorial7 obj = new Factorial7();
		obj.id=id;
    	obj.name=name;
		obj.company=company;
		return obj;
	}
 public static void main(String[]args){
	    Scanner sc = new Scanner(System.in);
		 Factorial7[]one = new Factorial7[10];
	  
          for(int i=0;i<one.length;i++){
			  one[i] = new Factorial7();
			  System.out.println("enter the details");
			  System.out.println("employ id " + (i+1));
			  one[i].id=sc.nextInt();
			  sc.nextLine();
			  System.out.println("employ name " +(i+1));
			  one[i].name=sc.nextLine();
			  System.out.println("employ company " +(i+1));
			  one[i].company=sc.nextLine();
		  }
		  sc.close();
        System.out.println("All employ Detiles");
		 for(int i=0;i<one.length;i++){
			show(one[i]);
		 }
   }
 }