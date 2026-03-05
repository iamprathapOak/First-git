  import java.util.Scanner;
  import java.io.*;  
  class Employee{
	 String name;
	 int id;
	 int age;
	 String experience;
	 
    Employee(String name,int id,int age,String experience){
	   this.name=name;
	   this.id=id;
	   this.age=age;
	   this.experience=experience;
	}
	public void show(){
		System.out.println("Employee Name :"+name);
		System.out.println("Employee Id :"+id);
		System.out.println("Employee Age :"+age);
		System.out.println("Employee Experience :"+experience);
	}
  }
   public class Organization{
  
   public static void main(String[]args) throws IOException{
        Scanner sc = new Scanner(System.in);
		try{
		Employee[]one=new Employee[3];
		  for(int i=0;i<20;i++){
		 System.out.println("Enter Name");
		     String na = sc.nextLine();
		 System.out.println("Enter Id");
             int st =sc.nextInt();
         System.out.println("Enter Age");
             int a=sc.nextInt();
			 sc.nextLine();
         System.out.println("Experience");
              String ex=sc.next();	
            one[i]= new Employee(na,st,a,ex);			  
		  }
		  System.out.println("_____________________");
		  System.out.println("Employee Details");
		  System.out.println("_____________________");
		  for(int i=0;i<20;i++){
			  one[i].show();
		  }
		}
		catch(Exception e){
			System.out.println(e);
		}
		 sc.close();
	}
  }