
import java.util.Scanner;

class Encap{
      private int a;
      private String name;
	  Encap(int a,String name){
		  this.a=a;
		  this.name=name;
		  System.out.println(a);
		  System.out.println(name);
	  }
   public void setA(int a){
	   this.a=a;
   }
   public void setName(String name) {
	     this.name=name;
   }
   public int getA() {
	   return a;
   }
   public String getName() {
	   return name;
   }

}
public class Soldout {
        
	public static void main(String[] args) {
		try{
		int b=1;
		Scanner sc = new Scanner(System.in);
		System.out.println("Default your are password and name");
		Encap ob = new Encap(0000,"null");
		while(b<4){
		System.out.println("hiii Surya");
		System.out.println("set are password "); 
		 int a1=sc.nextInt();
        ob.setA(a1);
        System.out.println(ob.getA());
		System.out.println("change pin :"+a1);
		System.out.println("change name ");
		String name1=sc.next();
		ob.setName(name1);
		System.out.println(ob.getName());
		System.out.println("name change :" + name1);
		b++;
		System.out.println("three time more your cheange:"+(b-1));
		 }
		}
		catch(Exception e){
			System.out.println(e);
		}
	}

}
