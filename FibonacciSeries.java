import java.util.Scanner;

public class FibonacciSeries {

	public static void main(String args[]) {
		int a = 0, b = 0, c = 1, n;
		System.out.println("Enter the limit");
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();

		for (int i = 0; i <= n; i++) {
			System.out.println(c);
			a = b;
			b = c;
			c = a + b;

		}
	}

}
