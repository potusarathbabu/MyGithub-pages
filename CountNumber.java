package patternsTriangles;

import java.util.Scanner;

public class CountNumber {

	public static void main(String[] args) {
		int n, a = 0;
		Scanner s = new Scanner(System.in);
		System.out.println("Enter any number : ");
		n = s.nextInt();

		if (n< 0) {
			n = n * -1;
		} else if (n == 0) {
			n = 1;
		}
		while (n > 0) {
			n = n / 10;//10
			a++;
		}
		System.out.println("Number of Digits in given number is: " + a);
	}

}
