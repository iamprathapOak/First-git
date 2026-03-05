  import java.util.*;
  
  class Queen{   //First in First out;
  
     public static void main(String[]args){
  
     Queue < Character > one = new PriorityQueue<>();
	 
       one.add('A');
	   one.add('B');
	   one.add('C');
	   one.add('D');
	   one.add('E');
	   
	   System.out.println(one);
	   
	   System.out.println(one.poll());
	   
	   System.out.println(one.poll());
	   
	   System.out.println(one.offer('Z'));
	   
	   System.out.println(one.offer('A'));
	   
	   System.out.println(one.element());
	   
	   System.out.println(one.element());
	   
	   System.out.println(one.peek());
	   
	   System.out.println(one.size());
  
  
   }
  }