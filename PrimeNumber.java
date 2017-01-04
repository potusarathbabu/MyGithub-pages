
import java.io.*;

public class PrimeNumber {
	public static void main(String args[]) throws IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		int a, b, c;
		c = 0;
		System.out.println("\nEnter the no=");
		a = Integer.parseInt(in.readLine());
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
