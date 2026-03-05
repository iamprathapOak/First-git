    public class Method {
   
      public void nonpar () {
             int a = 10;
			 int b = 20;
			 int c = 70;
		     int abc = (a + b + c);
		     System.out.println(abc);
         }
		 
      public void para(String a, String b) {
	  
             System.out.println(a + b);
         }
    
	  public int nonretupar() {
              int e = 100;
			  int f = 200;
		      System.out.println(e + f);
			  return f;
          }
   
      public String retupar(String name, String src) {
              System.out.println(name + src);
			  return name;
   }
   
    public static void main (String [] args ) {
	
	      Method obj = new Method();
	
	      obj. nonpar();
		  obj. para( "Zoho", "TCS");
		  obj. nonretupar();
		  obj. retupar("Wipro", "HCL");
	
	      }
	}
    