package Concate;

public class concate {

	public static void main(String[] args) {
		String s1="Swapnil";
		String s2="Swapnil";
		s1.concat(" Since_1999");//String is immutable.
		System.out.println(s1);
		s1=s1.concat(" Ramteke");// So assign it explicitly.
		System.out.println(s1);
		

	}

}