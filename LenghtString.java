import java.util.Scanner;

public class LenghtString {
	
	public static void main(String[] args) {
	  
	    String str = "";
	    Scanner in=new Scanner(System.in);
	    System.out.println("Enter the String");
	    str=in.nextLine();
	    int length = str.length();
	    System.out.println("Length of a String is : " + length);
	  }
	

}
