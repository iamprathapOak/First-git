 import java.util.*; 
 
  class Dqueen {
	
    	public static void main(String[]args) {
	  
	     Deque <Integer> one = new ArrayDeque<>();
	        one.add(100);
	        one.add(1000);
			one.addLast(70);
			one.offerLast(000);
			one.offerFirst(0);
			one.addFirst(1);
			//one.add(null);
			
	    System.out.println(one);
		
	    System.out.println(one.removeFirstOccurrence(1000));
		
		
	    one.clear();
		
		System.out.println(one);
	
	  }
	}