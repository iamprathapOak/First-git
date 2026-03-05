   class Inner {
   
       private int a = 10;
	   private String b = "Java";
	   private String name;
	   private int acc;
        
   class Inside{
         
		 Inside(String name, int acc){
			 
		     System.out.println(" Your balance :" + a);
			 System.out.println(" Account Holder Name :" + b);
			 System.out.println(" Your name :" + name);
			 System.out.println(" Account Number :" +acc);
			 
		 }
     }
   
   public static void main (String [] args) {
   
         Inner ob = new Inner();
		 
		 Inner.Inside obj = ob. new Inside(" Python ", 200);
		 
		 Inner.Inside obj1 = ob. new Inside(" dote net ", 300);
   
       }
   }