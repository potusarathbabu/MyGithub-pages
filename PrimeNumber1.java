import java.util.Scanner;

public class PrimeNumber1 {
	
	public static void main(String args[])  {
		Scanner in = new Scanner(System.in);
		int a, b, c=0;
	
		System.out.println("\nEnter the no=");
		a = in.nextInt();
		for (b = 1; b <= a; b++) {
			if (a % b == 0)
				c = c + 1;
		}
		if (c == 2)
			System.out.println(a + " is a prime no.");
		else
			System.out.println(a + " is not a prime no.");
	}

}



