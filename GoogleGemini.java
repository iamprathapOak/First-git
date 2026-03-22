  import java.util.*;
  
  class A {
  
       String prouductname;
	   String prouduct;
	   int price;
	   float qulate;
  
    A ( String prouductname, String prouduct, int price, float qulate ) {
  
       this.prouductname=prouductname;
	   this.prouduct=prouduct;
	   this.price=price;
	   this.qulate=qulate;
	   
      }
	  
	public String toString () {
	
	   return "this is a prouductname : "+prouductname+ "|| prouduct : "+prouduct+"|| price : "+price+"|| qulate : "+qulate;
	  }
  }
  
  public class GoogleGemini {
  
  public static void main ( String [] args ) {
   
        ArrayList <A> ob = new ArrayList <> ();
	  
	  ob.add(new A("Briyani","Food",100,80.9f));
	  ob.add(new A("Chicken","65",150,91.9f));
	  ob.add(new A("Parotta","Mutta",70,99.9f));
	  
	  System.out.println (ob);
	  
	   for ( A a : ob ) {
		  
		 System.out.println(a);
	      }
       }
  }