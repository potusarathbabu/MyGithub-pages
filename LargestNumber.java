package patternsTriangles;

import java.util.Scanner;

public class LargestNumber {

	public static void main(String[] args) {
		int a, b, c;
		System.out.println("Enter numbers");
		Scanner sc = new Scanner(System.in);
		a = sc.nextInt();
		b = sc.nextInt();
		c = sc.nextInt();
		if (a >= b && a >= c)
			System.out.println("The largest number" + a);
		if (b >= a && b >= c)
			System.out.println("The largest number" + b);
		if (c >= a && c >= b)
			System.out.println("The largest number" + c);
	}
}
