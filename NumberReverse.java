
public class NumberReverse {

	public int reverseNumber(int number) {

		int reverse = 0;
		System.out.println("\nEnter the Number=");
		while (number != 0) {
			reverse = (reverse * 10) + (number % 10);
			number = number / 10;
		}
		return reverse;
	}

	public static void main(String a[]) {
		int Number = 0;
		NumberReverse nr = new NumberReverse();
		System.out.println("Result: " + nr.reverseNumber(Number));

	}
}
