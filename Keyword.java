  class Keyword{
   int a;
   String b;
  
    void add(int a, String b){
		this.a = a;
		this.b = b;
		System.out.println(a);
	    System.out.println(b);
  }
  
    Keyword(){
		System.out.println(a);
	    System.out.println(b);
	}
    
  public static void main (String [] args){
	     Keyword ob = new Keyword();
	     ob.add(10,"hello");
	  
   }  
  }