   class A {
   
      public void add () {
		  
		 for (int i=1; i<20; i++) {
             //try{
				//Thread.sleep(1000); 
				System.out.println(" i am A " );
			// }
			 // catch ( Exception e) {
			   // System.out.println(e);
		    // }
		 }			 
	  }
   }
   
   class B {
	   
	  public void add1 () {
		   
		  int a=1;
		  int b=20;
		  while (a<b) {
			  
			 // try{
				//Thread.sleep(1000); 
				System.out.println(" i am B ");
			 //}
			 // catch ( Exception e) {
			   // System.out.println(e);
			 // }
			  a++;
		  }
	   } 
   }
   
   class C extends Thread {
	   
	     A ob;
		 
		 C (A ob) {
			 
			this.ob=ob;
		 }
	    
		public void run () {
			ob.add();
		}
    }
   
   class D extends Thread {
	   
	     B obj;
	   
	     D (B obj) {
			
            this.obj=obj;			
		 }
	   public void run () {
        
		 obj.add1();
	   }  
   }
   
   public class Sample {
   
     public static void main (String [] args ) {
	      
		  A ob = new A();
		  
		  B obj = new B();
		  
		  C one = new C(ob);
		  
		  D two = new D(obj);

         // one.setDaemon(true);
         // two.setDaemon(true);
          one.start();
		  two.start();
	
		  for ( int z=1; z<=5; z++) {
			System.out.println(" i am a Main Method ");  
		  }
	 }
   }