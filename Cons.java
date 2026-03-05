   class Parent {
   
        public void add() {
         System.out.println("i am Parent class ");
     }
     
	    Parent(int a, int b) {
        System.out.println(" Java project start in :"+ a);
        System.out.println(" Java project start in :"+ b);
     }
  }
   
   class Sub extends Parent {
   
         public void call() {
             System.out.println(" i am child class ");
         }
   
        Sub(int b) {
		       super(1991, 75);
		       System.out.println(" Java project end in :" + b);
		}
   }
   
    class Sub1 extends Sub{
	
	    Sub1() {
	      super(1995);
		  System.out.println(" Java father off Jamescoling ");
	     }
	}
   
   public class Cons {
   
       public static void main (String [] args) {
   
         Sub1 ob = new Sub1();
           ob.add();
		   ob.call();
      }
   }
   
   