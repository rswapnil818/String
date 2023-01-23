
public class Notes {
	public static void main(String[] args) {
		
	
	//in String double equals to(==) method not check the string it check memory address of string.
      String s="Swapnil";  //SCP memory
      String s1=new String("Swapnil"); //Heap memory
      String s2=new String("SWapNiL");
      System.out.println(s==s1);//it check memory address. i.e, SCP And Heap both are different therefore it gives Result=false
	  System.out.println(s.equals(s1)); //it check Strings i.e, Swapnil,Swapnil both are equal then it gives result as true
	  System.out.println(s.equalsIgnoreCase(s2));
	  System.out.println(s.compareTo(s1));// it check contain and object
	  System.out.println(s.substring(1));
	  System.out.println();
	  System.out.println();
	  System.out.println();
	  System.out.println();
	  System.out.println();
	  System.out.println();
	  System.out.println();
	
	
	
	
	}
	
	
}
