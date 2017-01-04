import java.util.Scanner;

public class ArmstrongNumber {
	public boolean isArmstrongNumber(int number) {
		 
		
		
		int tmp = number;
		int noOfDigits = String.valueOf(number).length();
		int sum = 0;
		int div = 0;
		while (tmp > 0) {
			div = tmp % 10;
			int temp = 1;
			for (int i = 0; i < noOfDigits; i++) {
				temp *= div;
			}
			sum += temp;
			tmp = tmp / 10;
		}
		if (number == sum) {
			return true;
		} else {
			return false;
		}
	}

	public static void main(String a[]) {
		int k;
		System.out.println("enter number");
		Scanner sc=new Scanner(System.in);
		k=sc.nextInt();
		
		
		
		ArmstrongNumber man = new ArmstrongNumber();
		System.out.println("Ur given Armstrong Number is " + man.isArmstrongNumber(k));
			}
}
