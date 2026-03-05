  class A{ 
  public static void main(String[]args){
       char [][] arr={{ 'N','S','V','P'},{ 'o','m','a','n'}};
	     String [] strArr=new String[arr.length];
		 
		   
	   for(int i=0;i<arr.length;i++){
		    strArr[i] = new String(arr[i]);
	     
	   }
	   for(String s : strArr)
	   {  
		   System.out.println(s);
	   }
    }
  }