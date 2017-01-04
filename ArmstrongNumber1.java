import java.util.Scanner;

public class ArmstrongNumber1 {

	public static void main(String arg[]) {
		Scanner ob = new Scanner(System.in);
		System.out.println("Enter any number to check whether it is armstrong or not:");
		int n = ob.nextInt();
		int r, sum = 0, temp = n;
		while (n > 0) {
			r = n % 10;
			n = n / 10;
			sum = sum + (r * r * r);
		}
		if (sum == temp)
			System.out.print("Given number " + temp + " is Armstrong");
		else
			System.out.println("Given number " + temp + " is not Armstrong");
	}

}
