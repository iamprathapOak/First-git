    import java.util.Stack;
	
	class LastinFirst{
	
	public static void main(String[]args) {
		
	   Stack < Integer > ob= new Stack<>();
	
	    ob.add(120);
		ob.add(90);
		ob.add(900);
		ob.add(900);
		ob.push(200);
		ob.push(300);
		
	System.out.println(ob);
	
	System.out.println(ob.pop());
	
	System.out.println(ob.pop());
	
	System.out.println(ob);
	
	System.out.println(ob.search(90));
	
	System.out.println(ob.search(900));
	
	System.out.println(ob.empty());
	
	System.out.println(ob.peek());
	
	System.out.println(ob);
	
	}
   }