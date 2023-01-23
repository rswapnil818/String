package Contain;

public class contains {

	public static void main(String[] args) {
	String name="what do you know about me"	;
	//ye pass kiye huye argument ko check karta hai ki wo srting me present hai ya nhi.
	// if the passed argument is present in the stering the it print true else print false .
	System.out.println(name.contains("do you know"));//it present in the string(true)
	System.out.println(name.contains("about"));// it present in the string(true)
	System.out.println(name.contains("hello"));//it not present in the string(false)
	}

}
