  class A {
	  
	  void add () {
		 for (int i=0; i<=10; i++) {

            System.out.println("i am for " + i);
		 }			 
	  }
	  
	  void show () {
		  
		    System.out.println(" i am parent class show method ");
	  }
  }
  
  class B extends A {

      void add () {
		  
		      super.add();
		      super.show();
		  
		 int a=1;
         int b=5;
         while (a<b) {

            System.out.println(" i am while " + a);
			a++;
		 }			 
	  }
	  
	  void show () {
		  
		    System.out.println(" i am Child show method ");
	  }
  }  

   class C extends B {
	   
	   void sub () {
		   
	   }

       void add () {
		   
		   super.add();
		   super.show();
		   
		  int c=0;
          int d=3;

         do {
             System.out.println(" i am do While " + c);
			 c++;
		  } while (c<d);			 
	   }
     
       void show () {
		      
            System.out.println(" i am grandChild ");
	   }		   
   }	   
  
  public class Google {
  
  public static void main ( String [] args ) {
  
         A ob = new C ();
		 ob.add();
		 ob.show();
		 
      }
  }