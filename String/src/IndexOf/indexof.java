package IndexOf;

public class indexof {

	public static void main(String[] args) {
    String s1="What a match what a player";
    //Passing substring
    int index1=s1.indexOf("ch");
    System.out.println(index1);
    int index2=s1.indexOf("match");
    System.out.println(index2);
    
    //passing substring with from index.
    int index3=s1.indexOf("what",4);
    System.out.println(index3);
    
    //passing char value
    int index4=s1.indexOf('y');
    System.out.println(index4);
	}

}
