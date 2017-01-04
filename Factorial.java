
import java.util.Scanner;

public class Factorial {

	public static void main(String args[]) {
		long n, c, fact = 1;

		System.out.println("Enter an integer to calculate it's factorial=");
		Scanner in = new Scanner(System.in);

		n = in.nextLong();

		if (n < 0)
			System.out.println("Number should be non-negative.");
		else {
			for (c = 1; c <= n; c++)
				fact = fact * c;

			System.out.println("Factorial of " + n + " is = " + fact);
		}
	}

}
