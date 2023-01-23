package IgnoreCase;

public class equalsIgnoreCase {

	public static void main(String[] args) {
		String s1="Swapnil";
		String s2="SwApNiL";
		String s3="swapnil";
		String s4="Sachin";
		System.out.println(s1.equalsIgnoreCase(s2));
		System.out.println(s4.equalsIgnoreCase(s3));
		System.out.println(s2.equalsIgnoreCase(s3));
		System.out.println(s2.equalsIgnoreCase(s3));
		System.out.println(s3.equalsIgnoreCase(s1));
		System.out.println(s2.equalsIgnoreCase(s4));
	}

}
