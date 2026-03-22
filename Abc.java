  class MacBook {
  
  
     void add (int apple) {
	 
	     for ( int i=0; i<=10; i++ ){
			 
           try{
			   
			   Thread.sleep( 3000 );
			   
         System.out.println(" pepole " + i);
		 
		 System.out.println("Iphone price " + apple);
		      }
		   catch (Exception e) {
			   
			   System.out.println(e);
		   }
        }		 
	  }
    }
  class A extends Thread {
  
	  MacBook ob;
	      A ( MacBook ob) {
		  
		     this.ob=ob;
		  }
       
	 public void run () {
	  
	     ob.add( 40000 );
	  }
  }
  
  public class Abc {
  
    public static void main (String [] args ) {
  
        MacBook ob = new MacBook();
		
		A obj = new A(ob);
		
		obj.start();
		
		obj.run();
	 }
  }  