import java.util.Arrays;
class B{
  public static void main(String[]args){
    String a="java is a programming lang";
	System.out.println(a.length());
    String ar1 [] = a.split("m");
	 System.out.println(Arrays.toString(ar1));
	 System.out.println(a.repeat(3));
	 System.out.println(a.contains("z"));
	 
	 String s="hii";
	 String s1=new String("python");
	 System.out.println(s.hashCode());
	 System.out.println(s.hashCode());
	// s1=s1.intern();
	 System.out.println(s1.hashCode());
   }
}