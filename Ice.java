 // object class 
 
 public class Ice  implements Cloneable {
  
     int a;
	 
  public String toString () 
   {
	    return " Class name Ice ";
         }
  
  public static void main ( String [] args ) throws CloneNotSupportedException {
  
     Ice obj = new Ice ();
     System.out.println ( obj );
	 obj.a = 10;
	 System.out.println ( obj.a );
     
	 Ice ob = (Ice) obj.clone();
	 System.out.println(ob.a);
	 
	 ob.a = 200;
	 System.out.println(ob.a);
	 
	 Ice ok = (Ice) ob.clone();
	 ok.a=1000;
	 System.out.println(ok.a);
	 
	 System.out.println (obj.getClass());
	 
	 String b = " Java ";
	 String c = " Java ";
	 
	 System.out.println (obj.hashCode());
	 
	 System.out.println (b.hashCode());
	 
	 System.out.println (c.hashCode());
	 
	 System.out.println (ok.hashCode());
  
  
        }
  }